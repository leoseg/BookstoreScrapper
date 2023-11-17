package com.scrapper.main.priceScrapping;

import com.scrapper.main.dataTypes.BookStoreItem;
import org.springframework.stereotype.Component;
import com.scrapper.main.dataTypes.Book;
import java.util.HashMap;

@Component
public interface StorePrices {

    String storeTag = null;


    String searchUrl = null;


    HashMap<String,String> storeItemMapping = null;


    String storeBaseUrl = null;


    ContentFetcher getContentFetcher();

    String getStoreSearchUrl(Book book);

    String getStoreBookUrl(String storeSearchContent, String title, String author);

    BookStoreItem getStoreBookData(String bookPage, String url);



}
