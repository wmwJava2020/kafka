/**
 * Created by:Wondafrash
 * Date : 6/26/2024
 * Time : 2:13 PM
 */
package com.springboot.tutorial.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Slf4j
public class KafkaProducer {

    private KafkaTemplate<String,String> kafkaTemplate;
    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message){
        log.info("KafkaProducer Daily BBC news.... ",message);
        kafkaTemplate.send("news","KafkaProducer Local Time is : " + LocalDateTime.now());
    }


}
