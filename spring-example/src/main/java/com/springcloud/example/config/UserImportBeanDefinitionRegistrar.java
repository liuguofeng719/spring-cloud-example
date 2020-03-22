package com.springcloud.example.config;

import com.springcloud.example.service.impl.UserServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author guofeng
 * @version 1.0
 * @see jdk 1.8
 **/
public class UserImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

        System.out.println("============" + importingClassMetadata);
        final BeanDefinitionBuilder beanDefinitionBuilder =
                BeanDefinitionBuilder.genericBeanDefinition(UserServiceImpl.class)
                        .setScope(BeanDefinition.SCOPE_SINGLETON);

        registry.registerBeanDefinition("userService", beanDefinitionBuilder.getBeanDefinition());
    }
}
