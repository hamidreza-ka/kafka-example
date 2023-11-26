package com.hrk.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "main",
            groupId = "groupId"
    )
    void listener(String data){
        System.out.println("Listener Received: " + data + " 🎉");
    }
}
