package com.atguig.springcloud.service.impl;

import com.atguig.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author Guo
 * @Create 2020/7/12 12:22
 */
@EnableBinding(Source.class) //定义消息的推送管道 指信道channel和exchange绑定在一起
public class MessageProviderImpl implements IMessageProvider {

    /**
     *  消息发送管道
     */
    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        //消息发送
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*****serial: "+serial);
        return null;
    }
}