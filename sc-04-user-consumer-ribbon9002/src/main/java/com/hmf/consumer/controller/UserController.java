package com.hmf.consumer.controller;

import com.hnf.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/ribbon")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/user/{id}")
    public User getUser(@PathVariable("id") Long id){
        //这里调用服务提供者:http://localhost:8001/user/1
        //return restTemplate.getForObject("http://localhost:8001/user/"+id, User.class); 直接从服务端获取的服务,没有通过注册中心
        //通过注册中心获取服务:通过注册中心的服务名获取服务:USER-PROVIDER
        return restTemplate.getForObject("http://USER-PROVIDER/user/"+id, User.class);
    }
}
