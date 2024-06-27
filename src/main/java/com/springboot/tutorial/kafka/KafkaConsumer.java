/**
 * Created by:AIDA
 * Date : 6/26/2024
 * Time : 3:56 PM
 */
package com.springboot.tutorial.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class KafkaConsumer {

    public static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "news", groupId = "groupA") //consumer is tied to topic[daily-news-events] and [groupID:ConsumerA]
    public void consume(String message) {
        LOGGER.info("KafkaConsumer, Local Time : ", message + LocalDateTime.now());
    }
}
