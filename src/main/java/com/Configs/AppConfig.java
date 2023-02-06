package com.Configs;

import com.DAOs.UserDAO;
import com.DAOs.UserDAOimpl;
import com.Services.Service;
import com.Services.ServiceImpli;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
@ComponentScan({"com.Configs","com.Controllers","com.DAOs","com.Entities"})
@PropertySource("classpath:database.properties")
public class AppConfig {
    @Autowired
    Environment env;


    @Bean
    public LocalSessionFactoryBean sessionFactory(){
        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
        factoryBean.setHibernateProperties(properties());
        factoryBean.setDataSource(dataSource());
        factoryBean.setPackagesToScan("com.Entities");

        return factoryBean;
    }

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource =
                new DriverManagerDataSource();
        dataSource.setUrl(env.getRequiredProperty("jdbc.url"));
        dataSource.setDriverClassName(env.getRequiredProperty("jdbc.driverClass"));
        dataSource.setUsername(env.getRequiredProperty("jdbc.username"));
        dataSource.setPassword(env.getRequiredProperty("jdbc.password"));

        return dataSource;
    }

    public Properties properties(){
        Properties properties = new Properties();
        properties.setProperty("hibernate.dialect",env.getRequiredProperty("hibernate.dialect"));
        properties.setProperty("hibernate.show_sql", env.getRequiredProperty("hibernate.show_sql"));
        properties.setProperty("hibernate.format_sql", env.getRequiredProperty("hibernate.format_sql"));
        properties.setProperty("hibernate.hdm2ddl.auto", env.getRequiredProperty("hibernate.hdm2ddl.auto"));

        return properties;
    }

    @Bean
    public HibernateTransactionManager transactionManager(){
        HibernateTransactionManager transactionManager =
                new HibernateTransactionManager();
        transactionManager.setSessionFactory(sessionFactory().getObject());

        return transactionManager;
    }

    @Bean
    public UserDAO customerDao(){
        return new UserDAOimpl();
        }


    @Bean
    public Service service(){
        return new ServiceImpli();
    }

    }
