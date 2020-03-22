package com.springcloud.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEurakaServer9001Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurakaServer9001Application.class, args);
    }

}
