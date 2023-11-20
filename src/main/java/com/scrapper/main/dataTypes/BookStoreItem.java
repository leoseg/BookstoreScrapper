package com.scrapper.main.dataTypes;


public record BookStoreItem(
        String storeID, String url, String priceEbook, String storeTag,
        String price, String pricePaperback, int errorCode)
{
}
