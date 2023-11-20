package com.scrapper.main.priceScrapping;

import com.scrapper.main.dataTypes.BookStoreItem;
import org.springframework.stereotype.Component;
import com.scrapper.main.dataTypes.Book;
import java.util.HashMap;

/**
 * Store prices interface for all the stores
 */
@Component
public interface StorePrices {

    String storeTag = null;


    String searchUrl = null;


    HashMap<String,String> storeItemMapping = null;


    String storeBaseUrl = null;

    /**
     * Get the content fetcher of the store
     * @return ContentFetcher
     */
    ContentFetcher getContentFetcher();

    /**
     * Get the store search url for the book
     * @param book book to search for
     * @return store search url
     */
    String getStoreSearchUrl(Book book);

    /**
     * Get the store book url for the book
     * @param storeSearchContent store search content
     * @param title title of the book
     * @param author author of the book
     * @return store book url
     */
    String getStoreBookUrl(String storeSearchContent, String title, String author);

    /**
     * Get the store book data
     * @param bookPage content of the book page
     * @param url url of the bookpage
     * @return BookStoreItem
     */
    BookStoreItem getStoreBookData(String bookPage, String url);



}
