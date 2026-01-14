package com.mango.i_polymorphic;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃吃吃");
    }

    public void lookHome() {
        System.out.println("看家");
    }
}
