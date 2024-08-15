package com.mango.b_object;

public class Animal {
    String kind;
    String color;

    public void eat() {
        System.out.println(color + kind + "吃");
    }

    public void sleep() {
        System.out.println(color + kind + "睡");
    }
}
