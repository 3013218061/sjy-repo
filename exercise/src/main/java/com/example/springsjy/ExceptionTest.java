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
 * @created 2019-01-14
 */
public class ExceptionTest extends Exception {

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }

    public static void main(String... arg){
        long start = System.nanoTime();
        int a = 0;
        for (int i = 0; i < 1000000; i++) {
            try {
                a++;
                throw new ExceptionTest();
            } catch (Exception e) {
                //StackTraceElement[] stackTraceElements = e.getStackTrace();
            }
            //a++;
        }
        System.out.println((System.nanoTime() - start) / 1000000);
    }
}
