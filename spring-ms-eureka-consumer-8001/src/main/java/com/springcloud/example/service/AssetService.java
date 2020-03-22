package com.springcloud.example.service;

import com.springcloud.example.entity.Asset;
import com.springcloud.example.entity.CoreSysDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author guofeng
 * @version 1.0
 * @see jdk 1.8
 **/
@Service
public class AssetService {

    @Autowired
    RestTemplate restTemplate;

    public List<CoreSysDate> getCoreSystemDate() {
        final ResponseEntity<List<CoreSysDate>> exchange = restTemplate.exchange("http://spring-cloud-eureka-provider-8002/api/asset/coreSystemDate", HttpMethod.GET, null, new ParameterizedTypeReference<List<CoreSysDate>>() {
        });
        return exchange.getBody();
    }

}
