package com.mango.b_static;

public class Test01 {
    public static void main(String[] args) {
        // 同类中，静态成员中访问非静态成员new对象
        Test01 test01 = new Test01();
        test01.method03();
        // 不同类中，静态成员中访问非静态成员new对象
        Person person = new Person();
        person.eat();
    }

    public static void method01() {
        System.out.println("method01");
        // 同类中，在静态方法中能直接访问静态方法
        method02();
        // 在不同类中，在静态方法中不能直接访问静态方法，用类名调用
        // sleep();
        Person.sleep();
    }

    public static void method02() {
        System.out.println("method02");
    }

    public void method03() {
        System.out.println("method03");
        // 同类中，在非静态方法中能直接访问静态方法
        method01();
        Test01.method01();
        // 在不同类中，在非静态方法中不能直接访问静态方法，用类名调用
        // sleep();
        Person.sleep();
        // Person person = new Person();
        // person.sleep();
    }

    public void method04() {
        // 同类中，非静态成员中访问非静态成员可以直接调用，也可以new对象调用
        method03();
        new Test01().method03();
        // 不同类中，非静态成员中访问非静态成员new对象调用
        new Person().eat();
    }
} 
