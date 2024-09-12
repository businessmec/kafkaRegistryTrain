package com.echandens.kafka.producer;


import com.echandens.kafka.model.Student;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

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
       CompletableFuture<SendResult<String , Student>> future = kafkaTemplate.send(inputTopic, UUID.randomUUID().toString(), student);

       future.whenComplete((result , exception ) -> {
           if(exception != null) {
               log.error("send student failed", exception);
           }else {
               log.info("send student successful {} {}", result.getRecordMetadata().offset(), result.getRecordMetadata().partition());
           }
       });
        log.info( " transfert effectué ");
    }

}
