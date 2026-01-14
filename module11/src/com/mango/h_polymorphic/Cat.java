package com.mango.h_polymorphic;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃吃吃");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
