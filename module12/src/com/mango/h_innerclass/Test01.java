package com.mango.h_innerclass;

public class Test01 {
    public static void main(String[] args) {
        // 调用静态成员内部类
        // 外部类.内部类 对象名 = new 外部类().new 内部类();
        Person.Heart heart = new Person().new Heart();
        heart.jump();
    }
}
