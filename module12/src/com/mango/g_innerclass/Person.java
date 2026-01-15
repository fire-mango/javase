package com.mango.g_innerclass;

public class Person {
    public void eat() {
        System.out.println("吃东西");
    }

    static class Heart {
        public void jump() {
            System.out.println("心脏跳动");
        }
    }
}
