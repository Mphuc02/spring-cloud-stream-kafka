package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.function.Consumer;
import org.springframework.messaging.Message;

@Configuration
public class Config {

    @Bean
    public Consumer<Message<String>> consumer(){
        return (i) -> {
            System.out.println("Consumer Received : " + i);
        };
    }
}