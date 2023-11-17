package com.scrapper.main.configs;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    public static final String RPC_MESSAGE_QUEUE = "books";
//    public static final String RPC_REPLY_MESSAGE_QUEUE = "amq.rabbitmq.reply-to";
//    public static final String RPC_EXCHANGE = "rpc_exchange";

    /** *
     * Configure the task message queue
     */
    @Bean
    Queue msgQueue() {
        return new Queue(RPC_MESSAGE_QUEUE);
    }


    @Bean
    public Jackson2JsonMessageConverter producerJackson2MessageConverter() {
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public RabbitTemplate rabbitTemplate(final ConnectionFactory connectionFactory) {
        final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(producerJackson2MessageConverter());
        return rabbitTemplate;
    }

//    /** *
//     * Return Queue Configuration
//     */
//    @Bean
//    Queue replyQueue() {
//        return new Queue(RPC_REPLY_MESSAGE_QUEUE);
//    }
//    /** *
//     * Configures the exchange between the queues
//     */
//    @Bean
//    TopicExchange topicExchange() {
//        return new TopicExchange(RPC_EXCHANGE);
//    }
//    /** *
//     *Bindes the task queue to the reply queue
//     */
//    @Bean
//    Binding msgBinding() {
//        return BindingBuilder.bind(msgQueue())
//                .to(topicExchange())
//                .with(RPC_MESSAGE_QUEUE);
//    }

}
