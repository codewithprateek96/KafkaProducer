package com.Kafka.Producer.Service;

import com.Kafka.Producer.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, Employee> kafkaTemplate;

    private static final String TOPIC = "Kafka_Example";


    public void publishMessage(String name) {

        kafkaTemplate.send(TOPIC, new Employee(name,"1","Developer"));


    }
}
