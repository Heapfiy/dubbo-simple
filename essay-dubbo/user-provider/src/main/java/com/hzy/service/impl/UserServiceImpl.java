package com.hzy.service.impl;

import com.hzy.pojo.User;
import com.hzy.service.UserService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getUserName(Integer id) {
        return "getUserName";
    }

    @Override
    public User getUser(Integer id) {
        User user = new User(30, "张三", "12456");
        return user;
    }
}
