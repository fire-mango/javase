package com.mango.h_innerclass;

public class Person {
    public void eat() {
        System.out.println("吃东西");
    }

    class Heart {
        public void jump() {
            System.out.println("心脏跳动");
        }
    }
}
