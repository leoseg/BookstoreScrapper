package com.scrapper.main.priceScrapping;


import com.scrapper.main.dataTypes.Book;
import com.scrapper.main.dataTypes.BookStoreItem;
import com.scrapper.main.dataTypes.Matches;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Component;

import java.util.*;


@Component("Thalia")
public class Thalia implements StorePrices{

    public final String storeTag = "Thalia";
    public final String searchUrl = "https://www.thalia.de/suche?sq=";
    public final String storeBaseUrl = "https://www.thalia.de";

    public ContentFetcher contentFetcher;

    public StringHelper stringHelper;

    public Thalia(ContentFetcher contentFetcher, StringHelper stringHelper){
        this.contentFetcher = contentFetcher;
        this.stringHelper = stringHelper;
    }

    @Override
    public ContentFetcher getContentFetcher() {
        return this.contentFetcher;
    }

    public HashMap<String,String> storeItemMapping = new HashMap<>(){{
        put("Gebundenes Buch","price");
        put("eBook","priceEbook");
        put("Taschenbuch","pricePaperback");
        put("Gebundenes Buch (weitere)","price");
    }};

    public String getStoreSearchUrl(Book book){
        String authorParam = this.convertToToAuthorThaliaFormat(book.author()).replace(" ", "+");
        String titleParam = book.title().replace(" ", "+");
        return searchUrl+ titleParam + "+" + authorParam;

    }

    private String convertToToAuthorThaliaFormat(String author){
        List<String> authorList = new ArrayList<>(Arrays.stream(author.split(",")).map(String::trim).toList());
        Collections.reverse(authorList);
        String authorString = String.join(" ", authorList);
        return authorString.trim();
    }

    @Override
    public String getStoreBookUrl(String storeSearchContent, String title, String author) {
        Document doc = Jsoup.parse(storeSearchContent);
        List<Map<String,String>> products = new ArrayList<>();
        Elements productElements = doc.select(".tm-produktliste__eintrag.artikel");
        for (Element productElement : productElements) {
            String productName = productElement.select("dl-product").attr("name");
            if(productName.isEmpty()){
                productName = productElement.select(".tm-artikeldetails__title").text().trim();
            }
            String productAuthor = productElement.select(".tm-artikeldetails__autor").text().trim();
            if (!productName.isEmpty() && !productAuthor.isEmpty()) {
                String link = productElement.select("a.element-link-toplevel.tm-produkt-link").attr("href");
                HashMap<String,String> product = new HashMap<>();
                product.put("name", StringHelper.normalizeString(productName));
                product.put("author", StringHelper.normalizeString(productAuthor));
                product.put("link", link);
                products.add(product);
            }
        }
        String authorThaliaFormatNormalized = StringHelper.normalizeString(this.convertToToAuthorThaliaFormat(author));
        String titleNormalized = StringHelper.normalizeString(title);
        products = products.stream().filter(product -> stringHelper.compareStrings(product.get("author"),authorThaliaFormatNormalized) > 0.8 ).toList();
        if(products.isEmpty()){
            System.out.println("No book found for "+title);
            return "";
        }
        Matches matches = stringHelper.getMatches(products.stream().map(product ->  product.get("name")).toList(), titleNormalized);
        if(matches.bestMatch().score()>=0.8){
            return this.storeBaseUrl+ products.get(matches.bestMatchIndex()).get("link");
        } else if (matches.bestMatch().string().contains(titleNormalized) || titleNormalized.contains(matches.bestMatch().string())){
            return this.storeBaseUrl+ products.get(matches.bestMatchIndex()).get("link");
        } else {
            System.out.println("No book found for "+title);
            return "";

        }
    }

    @Override
    public BookStoreItem getStoreBookData(String searchResponseData, String url) {
        Document doc = Jsoup.parse(searchResponseData);
        Elements elements = doc.select(".element-struktur-kachel-standard.hauptformat");
        String price = "NA";
        String priceEbook = "NA";
        String pricePaperback = "NA";
        for (Element element : elements) {
            String caption = element.attr("caption");
            if(caption.isEmpty()){
                caption = element.select("p.element-text-small.bezeichnung").text().trim();
            }
            if (!caption.isEmpty() && storeItemMapping.containsKey(caption)) {
                String mappedValue = storeItemMapping.get(caption);
                if (mappedValue != null) {
                    String text = element.select("strong.element-text-small-strong").text().replaceAll("\\s+", " ").trim();
                    switch (mappedValue) {
                        case "price":
                            price = text;
                            break;
                        case "priceEbook":
                            priceEbook = text;
                            break;
                        case "pricePaperback":
                            pricePaperback = text;
                            break;
                    }
                }
            }

        }

        if (elements.isEmpty()) {
            price = Objects.requireNonNull(doc.select(".preis .element-headline-medium").first()).text().trim();
        }
        String storeID = url.substring(url.lastIndexOf("/") + 1);
        return new BookStoreItem(storeID, url, priceEbook, storeTag, price, pricePaperback, 0);
    }




}
