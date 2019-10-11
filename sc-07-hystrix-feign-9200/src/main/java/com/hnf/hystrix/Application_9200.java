package com.hnf.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.hnf.hystrix.client")
public class Application_9200 {
    public static void main(String[] args) {
        SpringApplication.run(Application_9200.class);
    }
}
