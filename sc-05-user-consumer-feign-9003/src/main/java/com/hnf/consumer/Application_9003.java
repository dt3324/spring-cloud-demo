package com.hnf.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.hnf.consumer.service")
public class Application_9003 {
    public static void main(String[] args) {
        SpringApplication.run(Application_9003.class);
    }
}
