package com.scrapper.main.priceScrapping;

import org.springframework.stereotype.Component;

/**
 * Content fetcher interface
 */
@Component
public interface ContentFetcher {

    /**
     * Fetch the content from the url
     * @param url url
     * @return content in html format
     */
    String fetchContent(String url);
}
