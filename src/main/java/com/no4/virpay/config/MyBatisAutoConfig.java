package com.no4.virpay.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;

/**
 * @author Times
 * @description
 */
@Configuration
@MapperScan(basePackages = {"com.no4.virpay.dao.mapper"}, sqlSessionTemplateRef  = "sqlSessionTemplate")
@EnableTransactionManagement
public class MyBatisAutoConfig implements TransactionManagementConfigurer {
    @Autowired
    @Qualifier(value ="druidDataSource")
    private DataSource druidDataSource;

    private final static String MAPPER_PATH = "com/no4/virpay/dao/sqlmap/*Mapper.xml";

    @Bean(name = "dovepaySqlSessionFactory")
    @Primary
    public SqlSessionFactory dovepaySqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        // 设置别名包
        sqlSessionFactoryBean.setTypeAliasesPackage("com.no4.virpay.model");
        // 添加mapper 扫描路径
        PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver = new PathMatchingResourcePatternResolver();
        String packageSearchPath = ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + MAPPER_PATH;
        sqlSessionFactoryBean.setMapperLocations(pathMatchingResourcePatternResolver.getResources(packageSearchPath));
        // 设置datasource
        sqlSessionFactoryBean.setDataSource(druidDataSource);
        return sqlSessionFactoryBean.getObject();
    }

    @Bean(name = "sqlSessionTemplate")
    @Primary
    public SqlSessionTemplate generalCoreSqlSessionTemplate(@Qualifier("dovepaySqlSessionFactory") SqlSessionFactory dovepaySqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(dovepaySqlSessionFactory);
    }

    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return new DataSourceTransactionManager(druidDataSource);
    }
}
