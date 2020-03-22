package com.springcloud.example;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author guofeng
 * @version 1.0
 * @see jdk 1.8
 **/
public class SpringBeanTest {

    public static void main(String[] args) {
//        useBasicDefaultListableBeanFactory();
//        useClassPathXmlApplicationContext();
//        useAnnotationConfigApplicationContext();
    }

    private static void useAnnotationConfigApplicationContext() {
        // 第一种
        ApplicationContext ctx1 = new AnnotationConfigApplicationContext(UserConfig.class);
        System.out.println(ctx1.getBean("userInfo"));
        // 第二种
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//        ctx.register(UserConfig.class);
//        ctx.refresh();
//        System.out.println(ctx.getBean("userInfo"));
    }

    private static void useClassPathXmlApplicationContext() {
        ClassPathXmlApplicationContext fileSystemXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
        System.out.println(fileSystemXmlApplicationContext.getBean("userInfo"));
    }

    /**
     * 基本DefaultListableBeanFactory 对象是没有提供BeanDefinition资源定位以及解析
     * 1、通过资源的抽象定位的xml资源，
     * 2、在通过BeanDefinitionReader加载解析，
     * 3、最后注册到HashMap<beanName,BeanDefinition>
     * 4、BeanFactory 操作BeanDefinition
     */
    private static void useBasicDefaultListableBeanFactory() {
        ClassPathResource classPathResource = new ClassPathResource("bean.xml");
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
        xmlBeanDefinitionReader.loadBeanDefinitions(classPathResource);
        System.out.println(defaultListableBeanFactory.getBean("userInfo"));
    }
}
