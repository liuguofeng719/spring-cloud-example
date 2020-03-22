package com.springcloud.example.service.impl;

import com.springcloud.example.service.AddressService;
import com.springcloud.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author guofeng
 * @version 1.0
 * @see jdk 1.8
 **/
public class UserServiceImpl implements UserService {

    @Autowired
    private AddressService addressService;

    public void getUserInfo() {
        addressService.getAddress();
        System.out.println("userInfo");
    }
}
