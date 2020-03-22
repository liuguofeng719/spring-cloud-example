package com.springcloud.example.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * 数据源配置
 */
@Configuration
@MapperScan(basePackages = {"com.springcloud.example.dao"}, sqlSessionFactoryRef = "assetSqlSessionFactory")
public class AssetDataSourceConfig {


    /**
     * 属性注入
     *
     * @return
     * @throws Exception
     */
    @Bean(name = "assetDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.druid.asset")
    @Primary
    public DataSource assetDataSource() throws Exception {
        final DruidDataSource build = DruidDataSourceBuilder.create().build();
        build.setPasswordCallbackClassName(DbPasswordCallback.class.getName());
        return build;
    }

    /**
     * sql工厂
     *
     * @param dataSource
     * @return
     * @throws Exception
     */
    @Bean(name = "assetSqlSessionFactory")
    @Primary
    public SqlSessionFactory assetSqlSessionFactory(@Qualifier("assetDataSource") DataSource dataSource) throws Exception {
        MybatisSqlSessionFactoryBean sqlSessionFactoryBean = new MybatisSqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setPlugins(new Interceptor[]{paginationInterceptor()});
        return sqlSessionFactoryBean.getObject();
    }

    /**
     * 数据源关联事务
     *
     * @return
     * @throws Exception
     */
    @Bean(name = "transactionManager")
    @Primary
    public DataSourceTransactionManager transactionManager() throws Exception {
        return new DataSourceTransactionManager(assetDataSource());
    }

    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor().setDbType(DbType.MYSQL);
    }
}
