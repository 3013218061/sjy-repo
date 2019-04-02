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
 * @created 2018/12/31
 */
public class Main {
    private static int index = 0;
    public static void main(String... sss){
        String aa = "sssssss[][[]{sfdafd}0{{]]]}}}0";

        //Heap OOM
        /*List<byte[]> list = new ArrayList<byte[]>();
        int i = 0;
        boolean flag = true;
        while (flag){
            try {
                i++;
                list.add(new byte[1024 * 1024]);//每次增加一个1M大小的数组对象
            }catch (Throwable e){
                e.printStackTrace();
                flag = false;
                System.out.println("count="+i);//记录运行的次数
            }
        }*/

        // VM stack OOM
       /* Main mock = new Main();
        try {
            mock.call();
        } catch (Throwable e) {
            System.out.println("Stack deep : " + index);
            e.printStackTrace();
        }*/

        //方法区OOM
        /*while (true) {

            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(TestCase.class);
            enhancer.setUseCache(false);
            enhancer.setCallback((MethodInterceptor) (arg0, arg1, arg2, arg3) -> arg3.invokeSuper(arg0, arg2));

            enhancer.create();
        }*/


        //常量池OOM
        /*List<String> list = new ArrayList<>();
        int i =1;
        while (true) {
            list.add(String.valueOf(i).intern());
            i++;
        }*/

        //直接内存OOM
        /*Field field = null;
        try {
            field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            Unsafe unsafe = (Unsafe) field.get(null);
            while (true) {
                index++;
                unsafe.allocateMemory(1024 * 1024);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        /*try {
            Thread.sleep(1000 * 60 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }

    public void call(){
        index++;
        call();
    }
    static class TestCase {

    }
}
