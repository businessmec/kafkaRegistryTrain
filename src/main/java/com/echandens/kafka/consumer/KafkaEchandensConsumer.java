package com.echandens.kafka.consumer;


import com.echandens.kafka.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;
import org.springframework.kafka.retrytopic.SameIntervalTopicReuseStrategy;
import org.springframework.retry.annotation.Backoff;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class KafkaEchandensConsumer {
 //   @RetryableTopic(
    //        backoff = @Backoff(value = 6000),
   //         attempts = "4",
     //       autoCreateTopics = "false",

      //      dltTopicSuffix = "-dlt",
      //       sameIntervalTopicReuseStrategy = SameIntervalTopicReuseStrategy.SINGLE_TOPIC,
     //       exclude = {NullPointerException.class}
  //  )
    @KafkaListener(topics = "${topic.inputTopic}")
    public void consume(ConsumerRecord<String, Student> consumerStudent) {
        log.info(" Consommation message {} . {}", consumerStudent.key(), consumerStudent.value());

    }
}
