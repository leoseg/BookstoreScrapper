package com.scrapper.main.priceScrapping;

import com.scrapper.main.dataTypes.Book;
import com.scrapper.main.dataTypes.BookStoreItem;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Scrapper class which scrapes the data from the store by using different inferfaces of {@link StorePrices}
 */
@Component
public class Scrapper {


    private final Map<String,StorePrices> storePricesBeans;

    public Scrapper(Map<String,StorePrices> storePricesBeans){
        this.storePricesBeans = storePricesBeans;
    }

    /**
     * Get the book store item from the store
     * @param book book to search for
     * @param storePricesTag store tag
     * @return BookStoreItem
     */
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
                    0
            );
        }
        String bookPage = storePricesImpl.getContentFetcher().fetchContent(url);
        return storePricesImpl.getStoreBookData(bookPage,url);
    }


}
