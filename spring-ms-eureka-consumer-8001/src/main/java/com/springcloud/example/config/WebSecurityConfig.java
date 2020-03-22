package com.springcloud.example.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author guofeng
 * @version 1.0
 * @see jdk 1.8
 **/
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);
        http.csrf().ignoringAntMatchers("/eureka/**");
        http
                .requestMatchers()
                .antMatchers("/api**", "/oauth/**")
                .and()
                .authorizeRequests().and()
                .httpBasic();
    }
}
