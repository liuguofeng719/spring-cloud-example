package com.springcloud.example.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author guofeng
 * @version 1.0
 * @see jdk 1.8
 * 注意这里的初始化bean是有顺序的,不然条件加载就会失败
 **/
@Configuration
public class DemoConfig {

    @Bean
    public DemoAspect demoAspect() {
        return new DemoAspect();
    }

    @Bean
    @Conditional(value = CustomCondition.class)
    public DemoLog demoLog() {
        return new DemoLog();
    }
}
