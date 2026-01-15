package com.mango.d_final_method;

public abstract class Animal {
    public final void eat() {
        System.out.println("吃吃吃");
    }
    // final和abstract不能同时使用
    // public abstract final void show();
}
