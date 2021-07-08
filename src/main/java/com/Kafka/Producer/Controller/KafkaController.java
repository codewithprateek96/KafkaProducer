package com.Kafka.Producer.Controller;

import com.Kafka.Producer.Service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    KafkaService kafkaService;

    @GetMapping("/publishMessage/{name}")
    public String postMessage(@PathVariable String name)
    {
        kafkaService.publishMessage(name);
        return "Published Successfully";
    }
}
