/*
 * Copyright (c) 2017 maoyan.com
 * All rights reserved.
 *
 */
package com.example.springsjy;

import sun.misc.ProxyGenerator;

import java.io.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.nio.charset.Charset;

/**
 * 在这里编写类的功能描述
 *
 * @author shangjinyu
 * @created 2018/12/27
 */
public class DynamicPro implements InvocationHandler {

    // 真实被代理的实例对象
    private Object object;

    public DynamicPro(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("中介干预");
        Object result = method.invoke(object, args);
        System.out.println("中介干预完成");
        return result;
    }
    public static void main(String[] args) throws IOException {
        Home home = new Home(1000, "red");
        //创建一个被代理的实例对象
        RealHomeowner realHomeowner = new RealHomeowner();
        //创建一个与被代理对象相关的InvocationHandler
        DynamicPro dynamicPro = new DynamicPro(realHomeowner);
        //创建一个类加载器
        ClassLoader classLoader = realHomeowner.getClass().getClassLoader();
        //被代理类的接口数组,里面的每一个方法都会执行InvocationHandler中的invoke方法
        Class<?>[] proxInterface = realHomeowner.getClass().getInterfaces();
        Homeowner homeowner = (Homeowner) Proxy.newProxyInstance(classLoader,proxInterface,dynamicPro);
        homeowner.LeaseHouse(home);


        System.out.println("Default Charset=" + Charset.defaultCharset());
        System.out.println("file.encoding=" + System.getProperty("file.encoding"));
        System.out.println("Default Charset=" + Charset.defaultCharset());
        System.out.println("Default Charset in Use=" + getDefaultCharSet());




        byte[] classFile = ProxyGenerator.generateProxyClass("$Proxy0", new Class[] {Homeowner.class});
        String path = "/Users/shangjinyu/Homeowner.class";
        //System.out.println(new String(classFile));
        try(FileOutputStream fos = new FileOutputStream(path)) {
            fos.write(classFile);
            fos.flush();
            System.out.println("代理类class文件写入成功");
        } catch (Exception e) {
            System.out.println("写文件错误");
        }
    }

    private static String getDefaultCharSet() {
        OutputStreamWriter writer = new OutputStreamWriter(new ByteArrayOutputStream());
        String enc = writer.getEncoding();
        return enc;
    }
}
