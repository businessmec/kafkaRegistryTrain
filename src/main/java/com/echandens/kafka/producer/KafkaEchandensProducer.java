package com.echandens.kafka.producer;


import com.echandens.kafka.model.Contact;
import com.echandens.kafka.model.Score;
import com.echandens.kafka.model.Student;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;

import java.util.Collections;
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
        Contact contact = Contact
                .newBuilder()
                .setEmailId("jean@jean.ch")
                .setMobile("0671028580")
                .build();

        Score score =
                Score.newBuilder().
                        setMarks(18)
                        .setSubject("je suis la")
                        .build();
        student = Student.newBuilder().
                setFirstName("Jean").
                setId(UUID.randomUUID().toString()).
                setRollNumber(10).
                setLastName("jouarre").
                setClassName("installation").
                setScores(Collections.singletonList(score))
                        .setContact(contact).
                build();
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
