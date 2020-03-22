package com.springcloud.hystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.springcloud.hystrix.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author guofeng
 * @version 1.0
 * @see jdk 1.8
 **/
@RestController
public class UserController {

    @GetMapping("listUser")
    @HystrixCommand(fallbackMethod = "fallbackMethod")
    public List<User> getListUser() {
        return Arrays.asList(new User());
    }

    public List<User> fallbackMethod() {
        return Arrays.asList(new User());
    }
}
