/**
 * Created by:Wondafrash
 * Date : 6/26/2024
 * Time : 2:35 PM
 */
package com.springboot.tutorial.controller;

import com.tutorials.spring_kafka.kafka.KafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka/api")
public class MessageController {

    private KafkaProducer producer;//if we have only ONE parameter to be injected, we can avoid using @AutoWiring

    public MessageController(KafkaProducer producer) {
        this.producer = producer;
    }

    //http://localhost:15000/kafka/api/m1?msg=Hi there
    @GetMapping("/m1")
    public ResponseEntity<String> publish(@RequestParam String msg) {
        producer.sendMessage(msg);
        return ResponseEntity.ok("Message Sent To The Topic");
    }
}
