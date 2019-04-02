/*
 * Copyright (c) 2017 maoyan.com
 * All rights reserved.
 *
 */
package com.example.springsjy;

import java.util.Hashtable;

/**
 * 在这里编写类的功能描述
 *
 * @author shangjinyu
 * @created 2019-02-27
 */
public class Mian {
    public static void main(String... arg){
        Hashtable t1 = new Hashtable();
        t1.put(1,2);
        Hashtable t2 = (Hashtable<?,?>)t1.clone();

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t1.equals(t2));
        t2.remove(1);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t1.equals(t2));
    }
}
