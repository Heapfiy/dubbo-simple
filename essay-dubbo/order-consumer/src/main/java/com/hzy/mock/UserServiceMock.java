package com.hzy.mock;

import com.hzy.pojo.User;
import com.hzy.service.UserService;

public class UserServiceMock implements UserService {
    @Override
    public String getUserName(Integer id) {
        return "降级方案";
    }

    @Override
    public User getUser(Integer id) {
        return new User(-1,"降级对象","降级密码");
    }
}
