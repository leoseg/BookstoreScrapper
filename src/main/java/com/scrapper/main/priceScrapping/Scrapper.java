package com.scrapper.main.priceScrapping;

import com.scrapper.main.dataTypes.Book;
import com.scrapper.main.dataTypes.BookStoreItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;


@Component
public class Scrapper {

    @Autowired
    private Map<String,StorePrices> storePricesBeans;

    public BookStoreItem getBookStoreItem(Book book, String storePricesTag){
        StorePrices storePricesImpl = storePricesBeans.get(storePricesTag);
        String storeSearchUrl = storePricesImpl.getStoreSearchUrl(book);
        String storeSearchContent = storePricesImpl.getContentFetcher().fetchContent(storeSearchUrl);
        String url = storePricesImpl.getStoreBookUrl(storeSearchContent, book.title(),book.author());
        if(url.isEmpty()){
            return new BookStoreItem(
                    "Not found",
                    "Not found",
                    " ",
                    storePricesTag,
                    " ",
                    " ",
                    book
            );
        }
        String bookPage = storePricesImpl.getContentFetcher().fetchContent(url);
        return storePricesImpl.getStoreBookData(bookPage,url);
    }


}
