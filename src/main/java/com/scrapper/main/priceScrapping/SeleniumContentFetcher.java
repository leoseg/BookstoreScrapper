package com.scrapper.main.priceScrapping;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class SeleniumContentFetcher implements ContentFetcher{

    private final BlockingQueue<WebDriver> pool;


    private final int numWebdrivers;

    public SeleniumContentFetcher(@Value("${pool.size}") int numWebdrivers){
        this.numWebdrivers = numWebdrivers;
        this.pool = new LinkedBlockingQueue<>(numWebdrivers);
        this.initalizePool();

    }

    private void initalizePool(){
        for(int i = 0; i < numWebdrivers; i++){
            WebDriver driver = new ChromeDriver();
            pool.offer(driver);
        }
    }

    private WebDriver aquirePool() throws InterruptedException {
        return pool.take();
    }

    private void releasePool(WebDriver driver){
        pool.offer(driver);
    }

    @Override
    public String fetchContent(String url) {
        WebDriver driver = null;
        try{
            driver = aquirePool();
            driver.get(url);
            return driver.getPageSource();
        } catch (InterruptedException e) {
            throw new RuntimeException("Error fetching content from " + url, e);
        } finally {
            if(driver != null){
                if(this.isWebDriverHealthy(driver)){
                    releasePool(driver);
                } else{
                    driver.quit();
                    this.pool.offer(new ChromeDriver());
                }

            }
        }
    }

    private void closeAll(){
        for(WebDriver driver : pool){
            driver.close();
        }
    }

    private boolean isWebDriverHealthy(WebDriver driver) {
    try {
        driver.get("about:blank");
        // Additional checks can be performed here
        return true;
    } catch (Exception e) {
        return false;
    }
}
}
