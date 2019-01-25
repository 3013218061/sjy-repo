/*
 * Copyright (c) 2017 maoyan.com
 * All rights reserved.
 *
 */
package com.example.springsjy;

import java.io.PrintStream;

/**
 * 在这里编写类的功能描述
 *
 * @author shangjinyu
 * @created 2018/11/11
 */
public class HomeWorkAOP {
    private PrintStream printStream;

    public HomeWorkAOP(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void beforeHomeWork(){
        printStream.println("beforeHomeWork");
    }

    public void afterHomeWork(){
        printStream.println("afterHomeWork");
    }
}
