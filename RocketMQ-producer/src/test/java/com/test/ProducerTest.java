package com.test;

import com.ProducerStarter;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ProducerStarter.class})
public class ProducerTest
{
    @Autowired
    private RocketMQTemplate template;


    @Test
    public void testSendMessage()
    {
        template.convertAndSend("springboot-rocketMQ","Hello SpringBoot111");
    }



}
