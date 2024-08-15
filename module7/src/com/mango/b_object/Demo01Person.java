package com.mango.b_object;

public class Demo01Person {
    // 成员变量
    public static void main(String[] args) {
        Person p = new Person();
        p.age = 18;
        p.name = "mango";
        p.eat();
        p.sleep();
        p.study();
        System.out.println(p.age);
        System.out.println(p.name);
    }
}
