/*
 * Copyright (c) 2017 maoyan.com
 * All rights reserved.
 *
 */
package com.example.springsjy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 在这里编写类的功能描述
 *
 * @author shangjinyu
 * @created 2018/11/11
 */
@Configuration
@ComponentScan() //默认扫描和配置类相同的包及其子包
public class StudentConfig {
    @Bean("student2")
    public Student student(){
        return new Student(homeWork());
    }

    @Bean("homeWork2")
    public HomeWork homeWork(){
        return new HomeWork("homeWork");
    }
}
