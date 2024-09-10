package com.echandens.kafka.controller;

import com.echandens.kafka.model.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController

public interface KafkaEchandens {

    @PostMapping
    public void processEchandensStudent(@RequestBody Student etudiant);
}
