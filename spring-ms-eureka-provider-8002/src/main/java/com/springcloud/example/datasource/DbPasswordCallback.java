package com.springcloud.example.datasource;

import com.alibaba.druid.util.DruidPasswordCallback;
import lombok.extern.slf4j.Slf4j;

import java.util.Properties;

/**
 * 数据库密码解密 Created by Ambitor on 2019/3/15
 */
@Slf4j
public class DbPasswordCallback extends DruidPasswordCallback {

    public static final String KEY = "123456788765432112345678";
    public static final String SPRING_DATASOURCE_DRUID_CONNECTION_PROPERTIES =
            "spring.datasource.druid.connection-properties";

    /**
     * 回调处理密码
     *
     * @param properties
     */
    @Override
    public void setProperties(Properties properties) {
        super.setProperties(properties);
//        String pwd = ConfigService.getAppConfig().getProperty(SPRING_DATASOURCE_DRUID_CONNECTION_PROPERTIES, null);
//        if (StringUtils.isNotBlank(pwd)) {
//            try {
//                //对jdbc.properties配置的密码密文 进行解密
//                String password = ThreeDESUtil.decrypt(pwd, KEY);
//                setPassword(password.toCharArray());
//            } catch (Exception e) {
//                log.error("数据库密码解密失败 pwd->{}", pwd, e);
//                setPassword(pwd.toCharArray());
//            }
//        }
    }

}
