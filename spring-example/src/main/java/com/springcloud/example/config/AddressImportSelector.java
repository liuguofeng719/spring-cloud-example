package com.springcloud.example.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author guofeng
 * @version 1.0
 * @see jdk 1.8
 **/
public class AddressImportSelector implements ImportSelector {

    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println("AddressService ===" + importingClassMetadata);
        return new String[]{"com.springcloud.example.service.impl.AddressServiceImpl"};
    }
}
