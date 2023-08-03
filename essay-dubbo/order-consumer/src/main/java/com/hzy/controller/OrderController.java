package com.hzy.controller;

import com.hzy.pojo.User;
import com.hzy.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.rpc.cluster.loadbalance.RandomLoadBalance;
import org.apache.dubbo.rpc.cluster.support.FailoverCluster;
import org.apache.dubbo.rpc.cluster.support.FailsafeCluster;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

    @Reference(mock = "com.hzy.mock.UserServiceMock")
    private UserService userService;

    @GetMapping("/name")
    public String getUserName(Integer id) {
        return userService.getUserName(id);
    }

    @GetMapping("/user")
    public User getUser(Integer id) {
        return userService.getUser(id);
    }
}
