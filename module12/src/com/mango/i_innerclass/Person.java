package com.mango.i_innerclass;

public class Person {
    public void eat() {
        class Heart {
            public void jump() {
                System.out.println("心脏跳动");
            }
        }

        new Heart().jump();
    }
}
