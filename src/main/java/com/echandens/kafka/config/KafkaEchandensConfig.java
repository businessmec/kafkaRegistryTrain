package com.echandens.kafka.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaEchandensConfig {
    @Value("${topic.inputTopic}")
    private String INPUT_TOPIC;
    @Value("${topic.outputTopic}")
    private String OUTPUT_TOPIC;

    @Bean
    public String inputTopic() {
        return INPUT_TOPIC;
    }

    @Bean
    public String outputTopic(){
        return OUTPUT_TOPIC;
    }
}
