package com.scrapper.main.controller;

import com.scrapper.main.configs.RabbitMQConfig;
import com.scrapper.main.dataTypes.BookMessage;
import com.scrapper.main.dataTypes.BookStoreItem;
import com.scrapper.main.priceScrapping.Scrapper;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class RPCServerController {

    RabbitTemplate rabbitTemplate;


    Scrapper scrapper;

    RPCServerController(RabbitTemplate rabbitTemplate, Scrapper scrapper){
        this.rabbitTemplate = rabbitTemplate;
        this.scrapper = scrapper;
    }

    @RabbitListener(queues = RabbitMQConfig.RPC_MESSAGE_QUEUE)
    public BookStoreItem process(@Payload BookMessage bookMessage){
        return scrapper.getBookStoreItem(bookMessage.book(),bookMessage.storePricesTag());
    }
}
