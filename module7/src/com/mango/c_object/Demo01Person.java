package com.mango.c_object;

public class Demo01Person {
    // 成员变量
    public static void main(String[] args) {
        Person p = new Person();
        p.age = 20;
        p.name = "fire";
        p.eat();
        p.sleep();
        p.study();
        System.out.println(p.age);
        System.out.println(p.name);
        System.out.println("===================");
        new Person().age = 22;
        System.out.println(new Person().age);
        new Person().name = "fireM";
        System.out.println(new Person().name);
        new Person().eat();
        new Person().sleep();
        new Person().study();
    }
}
