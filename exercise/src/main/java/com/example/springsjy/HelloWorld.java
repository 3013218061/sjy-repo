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
 * @created 2019-02-13
 */
public class HelloWorld {
    public native void sayHelloWorld(); //申明一个native方法

    static{
        System.loadLibrary("HelloWorld"); //装入动态链接库,"HelloWorldImpl"是装入动态链接库的名称
    }

    public static void main(String[] args){
        System.out.println(System.getProperty("java.library.path"));
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHelloWorld();
    }
}
