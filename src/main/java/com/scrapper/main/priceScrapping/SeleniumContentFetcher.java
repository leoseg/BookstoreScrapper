package com.scrapper.main.priceScrapping;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Selenium content fetcher who manages a pool of selenium webdrivers used by multiple threads
 */
@Component
public class SeleniumContentFetcher implements ContentFetcher{

    private final BlockingQueue<WebDriver> pool;


    private final int numWebdrivers;

    private ChromeOptions chromeOptions = new ChromeOptions();

    public SeleniumContentFetcher(@Value("${pool.size}") int numWebdrivers){
        this.numWebdrivers = numWebdrivers;
        this.pool = new LinkedBlockingQueue<>(numWebdrivers);
        this.initalizePool();

    }

    private static final String[] minimal_args = {
      "--disable-blink-features=AutomationControlled",
            "--window-size=1920,1080",
            "start-maximized",

    };

    private static final String[] userAgents = {
            "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36",
            "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36",
            "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36",
            "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36",
            "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36",
            "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.1 Safari/605.1.15",
            "Mozilla/5.0 (Macintosh; Intel Mac OS X 13_1) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.1 Safari/605.1.15",
    };

    private void initalizePool(){
        this.chromeOptions.addArguments("--headless=new");
        this.chromeOptions.addArguments(minimal_args);
        this.chromeOptions.addArguments("--user-agent="+userAgents[(int)(Math.random()*userAgents.length)]);
        this.chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        this.chromeOptions.setExperimentalOption("useAutomationExtension", false);
        for(int i = 0; i < numWebdrivers; i++){
            WebDriver driver = new ChromeDriver(this.chromeOptions);
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
                    WebDriver newDriver = new ChromeDriver(this.chromeOptions);
                    this.pool.offer(newDriver);
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
