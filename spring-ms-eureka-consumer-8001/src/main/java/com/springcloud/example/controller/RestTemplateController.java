package com.springcloud.example.controller;

import com.springcloud.example.entity.CoreSysDate;
import com.springcloud.example.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author guofeng
 * @version 1.0
 * @see jdk 1.8
 **/
@RestController
@RequestMapping("/api")
public class RestTemplateController {

    @Autowired
    private AssetService assetService;

    @GetMapping("/getCoreSystemDate")
    public List<CoreSysDate> getCoreSystemDate() {
        return assetService.getCoreSystemDate();
    }
}
