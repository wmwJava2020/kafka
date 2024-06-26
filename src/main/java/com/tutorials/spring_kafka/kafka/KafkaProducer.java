/**
 * Created by:Wondafrash
 * Date : 6/26/2024
 * Time : 2:13 PM
 */
package com.tutorials.spring_kafka.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaProducer {

    private KafkaTemplate<String,String> kafkaTemplate;
    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message){
        log.info("Daily BBC news is being written : ",message);
        kafkaTemplate.send("news","There  is a huge clash in Kenya today because of TAX");
    }


}
