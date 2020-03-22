package com.springcloud.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author guofeng
 * @version 1.0
 * @see jdk 1.8
 **/
@Configuration
@Import({AddressImportSelector.class, UserImportBeanDefinitionRegistrar.class})
public class UserConfig {
}
