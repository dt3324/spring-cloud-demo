package com.hnf.hystrix.controller;

import com.hnf.bean.User;
import com.hnf.hystrix.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserClient userClient;
    @RequestMapping("/user/{id}")
    public User findUser(@PathVariable("id") Long id){
        return userClient.findUser(id);
    }
}
