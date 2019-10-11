package com.hnf.hystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {

    @RequestMapping("/hystrix/{id}")
    @HystrixCommand(fallbackMethod = "fallBake")
    public String getString(@PathVariable("id")Long id){
        if(id == 0){
            throw new RuntimeException("啊嘞？？？？");
        }
        return "哈哈";
    }

    public String fallBake(Long id){
        return "呵呵呵";
    }
}
