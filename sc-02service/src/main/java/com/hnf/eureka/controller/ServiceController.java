package com.hnf.eureka.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dt
 */
@RestController
public class ServiceController {

    @RequestMapping("/service")
    public String findUser(){
        return "我是服务001号！";
    }
}
