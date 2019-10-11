package com.hnf.hystrix.client;

import com.hnf.bean.User;
import com.hnf.hystrix.factory.UserClientFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "USER-PROVIDER",fallbackFactory = UserClientFactory.class)
public interface UserClient {
    @RequestMapping("/user/{id}")
    User findUser(@PathVariable("id") Long id);
}
