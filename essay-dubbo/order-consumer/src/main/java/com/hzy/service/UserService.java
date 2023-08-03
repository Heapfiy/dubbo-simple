package com.hzy.service;

import com.hzy.pojo.User;

public interface UserService {

    String getUserName(Integer id);

    User getUser(Integer id);
}
