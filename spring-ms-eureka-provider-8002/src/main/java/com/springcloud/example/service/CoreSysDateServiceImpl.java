package com.springcloud.example.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springcloud.example.entity.CoreSysDate;
import com.springcloud.example.dao.common.CoreSysDateDao;
import com.springcloud.example.service.impl.CoreSysDateService;

/**
 * @author guofeng
 * @version 1.0
 * @see jdk 1.8
 **/
@Service
public class CoreSysDateServiceImpl extends ServiceImpl<CoreSysDateDao, CoreSysDate> implements CoreSysDateService {

}
