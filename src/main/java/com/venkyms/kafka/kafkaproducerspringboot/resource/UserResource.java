package com.venkyms.kafka.kafkaproducerspringboot.resource;

import com.venkyms.kafka.kafkaproducerspringboot.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class UserResource {
    private static final String TOPIC = "simpleKafkaProducer";

    @Autowired
    private KafkaTemplate<String, Message> kafkaTemplate;

    @GetMapping("/publish/{pnrlocator}")
    public String post(@PathVariable("pnrlocator") final String pnrlocator) {
        kafkaTemplate.send(TOPIC, new Message("HDQ", pnrlocator));
        return "publish success";
    }
}
