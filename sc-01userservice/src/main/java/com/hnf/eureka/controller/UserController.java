package com.hnf.eureka.controller;

import com.hnf.bean.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dt
 */
@RestController
public class UserController {

    @RequestMapping("/user/{id}")
    public User findUser(@PathVariable("id") Long id){
        if(id==1){
            throw new RuntimeException("啊嘞？？？？");
        }
        return new User(id,"xxx");
    }
}
