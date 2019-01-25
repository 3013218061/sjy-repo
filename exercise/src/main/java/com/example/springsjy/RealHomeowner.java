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
 * @created 2018/12/27
 */
public class RealHomeowner implements Homeowner {
    @Override
    public void LeaseHouse(Home home) {
        System.out.println("房价是 " + home.price);
        System.out.println("房子颜色是 " + home.color);
    }
}
