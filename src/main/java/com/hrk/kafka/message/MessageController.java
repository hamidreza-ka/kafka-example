package com.hrk.kafka.message;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("api/v1/messages")
public record MessageController(KafkaTemplate<String, Message> kafkaTemplate) {

    @PostMapping
    public void publish(@RequestBody MessageRequest request) {
        kafkaTemplate.send("main", new Message(request.message(), LocalDateTime.now()));
    }
}
