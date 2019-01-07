package com.toor.friend.client.impl;

import com.toor.friend.client.UserClient;
import org.springframework.stereotype.Component;

@Component
public class UserClientImpl implements UserClient {
    @Override
    public void updatefanscountandfollowcount(String userid, String friendid, int x) {
            System.out.println("熔断器启动了");
    }
}
