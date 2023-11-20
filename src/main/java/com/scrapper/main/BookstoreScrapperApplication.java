package com.scrapper.main;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookstoreScrapperApplication {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        SpringApplication.run(BookstoreScrapperApplication.class, args);
    }

}
