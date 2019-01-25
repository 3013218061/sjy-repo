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
public class TestClass {

    private int m;

    public int inc() {
        return m + 1;
    }

    public static int incV2(){
        int x;
        try {
            x = 1;
            //int b = 1 / 0;
            return x;
        }catch (Exception e){
            x = 2;
            return x;
        }finally {
            x = 3;
        }
    }

    public static void main(String... arg){
        int a = incV2();
        System.out.println(a);
    }
}
