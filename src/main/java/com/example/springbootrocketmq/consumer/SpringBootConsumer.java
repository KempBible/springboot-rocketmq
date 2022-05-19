package com.example.springbootrocketmq.consumer;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

//https://blog.csdn.net/qq_43631716/article/details/119902582
@Component
@RocketMQMessageListener(consumerGroup = "springBootGroup", topic = "TestTopic")
public class SpringBootConsumer implements RocketMQListener {

    @Override
    public void onMessage(Object message) {
        System.out.println("Received message : "+ message);
    }
}

