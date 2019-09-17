package com.gjxx.springbootdemo.db;

import com.gjxx.springbootdemo.service.JdbcTmplUserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * @Description 监测数据库连接池类型
 *              实现Spring Bean生命周期接口ApplicationContextAware
 * @Author Sxs
 * @Date 2019/9/17 17:39
 * @Version 1.0
 */
@Component
public class DataSourceShow implements ApplicationContextAware {

    private ApplicationContext applicationContext = null;

    @Autowired
    private JdbcTmplUserService jdbcTmplUserService;

    /**
     * Spring容器会自动调用这个方法，注入Spring Ioc容器
     * @param applicationContext Spring上下文对象
     * @throws BeansException 运行时异常
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        DataSource dataSource = applicationContext.getBean(DataSource.class);
        System.out.println("---------------------------");
        System.out.println(dataSource.getClass().getName());
        System.out.println(jdbcTmplUserService.getUser("sxs"));
        System.out.println("---------------------------");
    }

}
