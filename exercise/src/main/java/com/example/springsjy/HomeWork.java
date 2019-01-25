/*
 * Copyright (c) 2017 maoyan.com
 * All rights reserved.
 *
 */
package com.example.springsjy;

/**
 * 在这里编写类的功能描述
 *
 * @author shangjinyu
 * @created 2018/11/11
 */
//@Component
public class HomeWork {

    private String workName;

    public HomeWork(String workName) {
        this.workName = workName;
    }

    public void doHomeWork(){
        System.out.println("doHomeWork");
    }
}
