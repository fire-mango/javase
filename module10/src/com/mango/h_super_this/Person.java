package com.mango.h_super_this;

public class Person {
    int num = 10;

    public Person() {
        // this(100); // 调用当前对象的有参构造
        System.out.println("我是Person中的无参构造");
    }

    public Person(int data) {
        this(); // 调用当前对象的无参构造
        System.out.println("我是Person中的有参构造" + data);
    }

    public void method() {
        int num = 20;
        System.out.println(num); // num 20 当前的num
        System.out.println(this.num); // this.num 10 当前类中的num
        this.method01(); // 调用当前对象的method01方法
        method01(); // 调用当前类中的method01方法
        System.out.println("我是Person类中的method方法");
    }

    public void method01() {
        System.out.println("我是Person类中的method01方法");
    }
}
