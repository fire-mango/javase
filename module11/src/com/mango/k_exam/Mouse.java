package com.mango.k_exam;

public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("鼠标USB打开");
    }

    @Override
    public void close() {
        System.out.println("鼠标USB关闭");
    }

    public void click() {
        System.out.println("鼠标点击");
    }
}
