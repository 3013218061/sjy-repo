/*
 * Copyright (c) 2017 maoyan.com
 * All rights reserved.
 *
 */
package com.example.springsjy.dao;

import java.util.HashMap;
import java.util.Map;
/**
 * 在这里编写类的功能描述
 *
 * @author shangjinyu
 * @created 2019-02-18
 */
class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }
    @Override
    public void run(){
        for (int i=0; i<5; i++) {
            System.out.println(Thread.currentThread().getName()
                    +"("+Thread.currentThread().getPriority()+ ")"
                    +", loop "+i);
        }
    }
};

public class Demo {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName()
                +"("+Thread.currentThread().getPriority()+ ")");

        Thread t1=new MyThread("t1");    // 新建t1
        Thread t2=new MyThread("t2");    // 新建t2
        t1.setPriority(1);                // 设置t1的优先级为1
        t2.setPriority(10);                // 设置t2的优先级为10
        t2.start();                        // 启动t2
        t1.start();                        // 启动t1
        Map map = new HashMap();
        for(Object entry : map.entrySet()){

        }
    }
}