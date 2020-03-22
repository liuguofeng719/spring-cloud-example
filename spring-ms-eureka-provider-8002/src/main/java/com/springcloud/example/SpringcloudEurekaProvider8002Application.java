package com.springcloud.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudEurekaProvider8002Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaProvider8002Application.class, args);
    }

}
