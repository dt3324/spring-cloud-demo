package com.hnf.hystrix.factory;

import com.hnf.bean.User;
import com.hnf.hystrix.client.UserClient;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class UserClientFactory implements FallbackFactory<UserClient> {
    @Override
    public UserClient create(Throwable throwable) {
        return id -> new User(id,"feign调用失败");
    }
}
