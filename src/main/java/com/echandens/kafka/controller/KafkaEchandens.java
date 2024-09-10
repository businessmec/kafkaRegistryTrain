package com.echandens.kafka.controller;

import com.echandens.kafka.model.Student;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping(value="students" , produces = {MediaType.TEXT_PLAIN_VALUE,
MediaType.APPLICATION_JSON_VALUE})

public interface KafkaEchandens {

    @PostMapping
    public void processEchandensStudent(@RequestBody Student etudiant);
}
