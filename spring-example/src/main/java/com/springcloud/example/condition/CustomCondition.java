package com.springcloud.example.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author guofeng
 * @version 1.0
 * @see jdk 1.8
 **/
public class CustomCondition implements Condition {
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        if (context.getBeanFactory().containsBean("demoAspect")) {
            return true;
        }
        return false;
    }
}
