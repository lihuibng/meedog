package com.macro.meedog.server.kafka;

/**
 * @author "xxxxxx"
 * @modified 2020/11/10 9:44 下午
 */

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Slf4j
public class KafkaReceiver {

    @KafkaListener(id = "meedog-test", topicPartitions = {
            @TopicPartition(topic = "meedog-test1", partitions = {"0", "1"}),
            @TopicPartition(topic = "meedog-test2", partitions = "0")
            //       partitionOffsets = @PartitionOffset(partition = "0", initialOffset = "0"))
    }, concurrency = "3")
    public String listen(String input) {
        log.info("input value: {}", input);
        return "successful";
    }

    public void listen(ConsumerRecord<?, ?> record) {
        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()) {
            Object message = kafkaMessage.get();
            log.info("----------------- record =" + record);
            log.info("------------------ message =" + message);
        }
    }
}
