package com.springcloud.example.controller;

import com.springcloud.example.entity.Asset;
import com.springcloud.example.entity.CoreSysDate;
import com.springcloud.example.service.impl.AssetService;
import com.springcloud.example.service.impl.CoreSysDateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.RequestContextUtils;

import java.util.List;

/**
 * @author guofeng
 * @version 1.0
 * @see jdk 1.8
 **/
@RestController
@RequestMapping("/api")
public class AssetController {

    @Autowired
    private AssetService assetService;
    @Autowired
    private CoreSysDateService coreSysDateService;

    @GetMapping("/assetList")
    public List<Asset> getAssetList() {
        return assetService.list();
    }

    @GetMapping("/asset/coreSystemDate")
    public List<CoreSysDate> coreSystemDate() {
        return coreSysDateService.list();
    }
}
