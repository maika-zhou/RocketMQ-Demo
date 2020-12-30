package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class ConsumerStarter
{
    public static void main(String[] args)
    {
        SpringApplication.run(ConsumerStarter.class);

        System.out.println("消费者启动： ");
    }

}
