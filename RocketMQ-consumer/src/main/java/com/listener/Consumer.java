package com.listener;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.stereotype.Component;


@RocketMQMessageListener(topic="springboot-rocketMQ",consumerGroup = "${rocketmq.consumer.group}")
@Component
public class Consumer implements RocketMQListener<String>
{
    @Override
    public void onMessage(String msg)
    {
        System.out.println("msg = " + msg);
    }
}
