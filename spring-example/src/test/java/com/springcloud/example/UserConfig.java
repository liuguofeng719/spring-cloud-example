package com.springcloud.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author guofeng
 * @version 1.0
 * @see jdk 1.8
 **/
@Configuration
public class UserConfig {

    @Bean
    public UserInfo userInfo() {
        final UserInfo userInfo = new UserInfo();
        userInfo.setAddress(address());
        return userInfo;
    }

    @Bean
    public Address address() {
        return new Address();
    }
}
