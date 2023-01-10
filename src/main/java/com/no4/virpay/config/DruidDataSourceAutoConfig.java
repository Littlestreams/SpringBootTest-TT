package com.no4.virpay.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @description
 */
@Configuration
public class DruidDataSourceAutoConfig {
    private final static Logger logger = LoggerFactory.getLogger(DruidDataSourceAutoConfig.class);

    @Value("${springBoot.datasource.url}")
    private String dbUrl;
    @Value("${springBoot.datasource.username}")
    private String username;
    @Value("${springBoot.datasource.password}")
    private String password;
    @Value("${springBoot.datasource.driver-class-name}")
    private String driverClassName;
    @Value("${springBoot.datasource.initialSize}")
    private int initialSize;
    @Value("${springBoot.datasource.minIdle}")
    private int minIdle;
    @Value("${springBoot.datasource.maxActive}")
    private int maxActive;
    @Value("${springBoot.datasource.maxWait}")
    private int maxWait;
    @Value("${springBoot.datasource.timeBetweenEvictionRunsMillis}")
    private int timeBetweenEvictionRunsMillis;
    @Value("${springBoot.datasource.minEvictableIdleTimeMillis}")
    private int minEvictableIdleTimeMillis;
    @Value("${springBoot.datasource.validationQuery}")
    private String validationQuery;
    @Value("${springBoot.datasource.testWhileIdle}")
    private boolean testWhileIdle;
    @Value("${springBoot.datasource.testOnBorrow}")
    private boolean testOnBorrow;
    @Value("${springBoot.datasource.testOnReturn}")
    private boolean testOnReturn;
    @Value("${springBoot.datasource.poolPreparedStatements}")
    private boolean poolPreparedStatements;
    @Value("${springBoot.datasource.maxPoolPreparedStatementPerConnectionSize}")
    private int maxPoolPreparedStatementPerConnectionSize;
    @Value("${springBoot.datasource.filters}")
    private String filters;
    @Value("${springBoot.datasource.connectionProperties}")
    private String connectionProperties;
    @Value("${springBoot.datasource.useGlobalDataSourceStat}")
    private boolean useGlobalDataSourceStat;

    @Bean(name = "druidDataSource")
    @Primary  //在同样的DataSource中，首先使用被标注的DataSource
    public DataSource dataSource() {
        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(this.dbUrl);
        datasource.setUsername(username);
        datasource.setPassword(password);
        datasource.setDriverClassName(driverClassName);
        //configuration
        datasource.setInitialSize(initialSize);
        datasource.setMinIdle(minIdle);
        datasource.setMaxActive(maxActive);
        datasource.setMaxWait(maxWait);
        datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        datasource.setValidationQuery(validationQuery);
        datasource.setTestWhileIdle(testWhileIdle);
        datasource.setTestOnBorrow(testOnBorrow);
        datasource.setTestOnReturn(testOnReturn);
        datasource.setPoolPreparedStatements(poolPreparedStatements);
        datasource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
        try {
            datasource.setFilters(filters);
        } catch (SQLException e) {
            logger.error("druid configuration initialization filter exception: " + e);
        }
        datasource.setConnectionProperties(connectionProperties);
        datasource.setUseGlobalDataSourceStat(useGlobalDataSourceStat);

        return datasource;
    }
}