package com.macro.meedog.server.kafka;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.Date;
import java.util.UUID;

/**
 * @author "xxxxxx"
 * @modified 2020/11/10 9:44 下午
 */

@Component
@Slf4j
public class KafkaSender {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    //发送消息方法
    public void send() {
        Message message = new Message();
        message.setId(System.currentTimeMillis());
        message.setMsg(UUID.randomUUID().toString());
        message.setSendTime(new Date());
        log.info("+++++++++++++++++++++  message = {}");
        ListenableFuture<SendResult<String, String>> future
                = kafkaTemplate.send("meedog-test1", JSON.toJSONString(message));
        try {
            SendResult<String, String> result = future.get();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}