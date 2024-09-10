package com.echandens.kafka.producer;


import com.echandens.kafka.model.Student;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class KafkaEchandensProducer {
    @Autowired
    private String inputTopic;

    @Autowired
    private String outputTopic;

    private KafkaTemplate<String, Student> kafkaTemplate;

    public void sendStudent(Student student) {
        log.info("transfert objet student firstname {} lastname {} inputTopic {} , outputTopic {}", student.getFirstName(),
                student.getLastName(), inputTopic, outputTopic);
        kafkaTemplate.send(inputTopic, student);
        log.info( " transfert effectué ");
    }

}
