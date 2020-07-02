package com.hnf.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "SERVICE")
public interface UserService {
    @RequestMapping("/service")
    String findUser();
}
