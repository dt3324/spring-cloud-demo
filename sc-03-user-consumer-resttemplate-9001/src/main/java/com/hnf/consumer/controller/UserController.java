package com.hnf.consumer.controller;

import com.hnf.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/restTemplate/{id}")
    public User getUser(@PathVariable("id") Long id){
        return restTemplate.getForObject("http://192.168.99.115:8001/user/"+id, User.class);
    }
}
