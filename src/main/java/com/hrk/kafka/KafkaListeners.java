package com.hrk.kafka;

import com.hrk.kafka.message.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "main",
            groupId = "groupId",
            containerFactory = "messageFactory" // this is the consumer factory Bean which defined in KafkaConsumerConfig class
    )
    void listener(Message data){
        System.out.println("Listener Received: " + data + " 🎉");
    }
}
