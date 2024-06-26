/**
 * Created by:Wondafrash
 * Date : 6/26/2024
 * Time : 2:10 PM
 */
package com.tutorials.spring_kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfiguration {
    @Bean
    public NewTopic bbcDailyNews(){
        return TopicBuilder.name("news")
                .partitions(4)
                .build();
    }
}
