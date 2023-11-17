package com.scrapper.main.priceScrapping;

import org.springframework.stereotype.Component;

@Component
public interface ContentFetcher {


    String fetchContent(String url);
}
