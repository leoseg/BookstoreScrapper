# BookStoreScrapper

###  Description

This scrapper is part of the greater project, where users from booklist can get the prices from different stores.
This scrapper scrapes the prices from the stores. It gets its request from rabbitmq along with the storetag to scrape 
with the corresponding interface implementation of StorePrices.
Stores at the moment: 
- Thalia
Each StorePrice implementation should have a ContentFetcher implementation which is used to get the content from the 
store webpage. Thalia uses the Selenium contentfetcher, which handles a thread of webdrivers which can be used by multiple
threads to download content. The number of multiple threads of the Rabbitlistener should be higher than the  number of 
webdrivers to ensure that the webdrivers are always used under 100% load.
The number of webdrivers should also be configured to controll the resource usage of the scrapper. 

### Technology-Stack
This service uses SpringBoot, RabbitMQ, Selenium, and JSoup.
