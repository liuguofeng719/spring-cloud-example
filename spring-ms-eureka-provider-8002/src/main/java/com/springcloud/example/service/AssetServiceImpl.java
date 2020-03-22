package com.springcloud.example.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springcloud.example.dao.AssetDao;
import com.springcloud.example.entity.Asset;
import com.springcloud.example.service.impl.AssetService;

/**
 * @author guofeng
 * @version 1.0
 * @see jdk 1.8
 **/
@Service
public class AssetServiceImpl extends ServiceImpl<AssetDao, Asset> implements AssetService {

}
