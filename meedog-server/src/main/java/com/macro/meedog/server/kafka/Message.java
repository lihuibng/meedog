package com.macro.meedog.server.kafka;

import lombok.Data;

import java.util.Date;

/**
 * @author "xxxxxx"
 * @modified 2020/11/10 9:54 下午
 */

@Data
public class Message {
    private Long id;    //id
    private String msg; //消息
    private Date sendTime;  //时间戳
}