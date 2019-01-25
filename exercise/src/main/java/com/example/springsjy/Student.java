/*
 * Copyright (c) 2017 maoyan.com
 * All rights reserved.
 *
 */
package com.example.springsjy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * bean生命周期
 *
 * @author shangjinyu
 * @created 2018/11/11
 */
//@Component //约定于 @Named
public class Student implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,BeanPostProcessor,InitializingBean,DisposableBean{

    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName");//设置bean名
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory"); //设置beanFactory
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext");//设置bean上下文
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

    //then init-method
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        //设置bean代理
        //System.out.println("postProcessBeforeInitialization: " + beanName);
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        //设置bean代理
        //System.out.println("postProcessAfterInitialization: " + beanName);
        return null;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    //then destory-method

    @Autowired(required = true)
    private HomeWork homeWork;

    @Autowired  //约定于@Inject
    public Student(HomeWork homeWork) {
        this.homeWork = homeWork;
    }
}
