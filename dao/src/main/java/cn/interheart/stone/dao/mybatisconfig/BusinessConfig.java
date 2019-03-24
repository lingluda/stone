package cn.interheart.stone.dao.mybatisconfig;

import cn.interheart.stone.dao.configs.BusinessDataSourse;
import cn.interheart.stone.dao.configs.DruidConnectionConfig;
import com.alibaba.druid.pool.xa.DruidXADataSource;
import com.atomikos.jdbc.AtomikosDataSourceBean;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.sql.SQLException;


/**
 * Created by victorrrr
 * Date : 2017/7/5 19:32
 */
@Configuration
@MapperScan(basePackages = {"cn.interheart.stone.dao.entity"}, sqlSessionTemplateRef = "businessSqlSessionTemplate")
public class BusinessConfig {
    // 配置数据源
    @Bean(name= "businessSource")
    public DataSource systemUserDataSource(BusinessDataSourse dataSource,DruidConnectionConfig druid) throws SQLException {
        DruidXADataSource datasource = new DruidXADataSource();
        datasource.setUrl(dataSource.getUrl());
        datasource.setUsername(dataSource.getUsername());
        datasource.setPassword(dataSource.getPassword());
        datasource.setDriverClassName(dataSource.getDriverClassName());
        datasource.setInitialSize(druid.getInitialSize());
        datasource.setMinIdle(druid.getMinIdle());
        datasource.setMaxActive(druid.getMaxActive());
        datasource.setMaxWait(druid.getMaxWait());
        datasource.setTimeBetweenEvictionRunsMillis(druid.getTimeBetweenEvictionRunsMillis());
        datasource.setMinEvictableIdleTimeMillis(druid.getMinEvictableIdleTimeMillis());
        datasource.setValidationQuery("SELECT 1");
        datasource.setTestWhileIdle(druid.isTestWhileIdle());
        datasource.setTestOnBorrow(druid.isTestOnBorrow());
        datasource.setTestOnReturn(druid.isTestOnReturn());
        AtomikosDataSourceBean xaDataSource = new AtomikosDataSourceBean();
        xaDataSource.setXaDataSource(datasource);
        xaDataSource.setUniqueResourceName("businessSource");
        return xaDataSource;
    }

    @Bean(name = "businessSqlSessionFactory")
    public SqlSessionFactory eboxSqlSessionFactory(@Qualifier("businessSource") DataSource dataSource)
            throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        org.apache.ibatis.session.Configuration configuration  =  new org.apache.ibatis.session.Configuration();
        bean.setConfiguration(configuration);
        bean.setDataSource(dataSource);
        bean.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources("classpath*:cn/interheart/stone/dao/entity/*Mapper.xml"));
        return bean.getObject();
    }
    @Bean(name = "businessSqlSessionTemplate")
    public SqlSessionTemplate eboxSqlSessionTemplate(
            @Qualifier("businessSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
