package com.echandens.kafka.controller.impl;

import com.echandens.kafka.controller.KafkaEchandens;
import com.echandens.kafka.model.Student;
import com.echandens.kafka.producer.KafkaEchandensProducer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class KafkaEchandensImpl implements KafkaEchandens {

    private final KafkaEchandensProducer kafkaEchandensProducer;

    @Override
    public void processEchandensStudent(Student etudiant) {
        log.info(" lancement service echadens service pour le producer ");
        kafkaEchandensProducer.sendStudent(etudiant);

    }
}
