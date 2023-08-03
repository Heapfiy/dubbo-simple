package com.hzy.controller;

import com.hzy.pojo.User;
import com.hzy.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

    @Reference
    private UserService userService;

    @GetMapping("/name")
    public String getUserName(Integer id){
        return userService.getUserName(id);
    }

    @GetMapping("/user")
    public User getUser(Integer id){
        return userService.getUser(id);
    }
}
