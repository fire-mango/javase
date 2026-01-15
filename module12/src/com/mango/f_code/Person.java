package com.mango.f_code;

public class Person {
    // 静态代码块 静态代码块只执行一次
    static {
        System.out.println("我是静态代码块");
    }

    // 构造代码块 优先于构造方法执行 每次new Person()都会执行
    {
        System.out.println("我是构造代码块");
    }

    public Person() {
        System.out.println("我是无参构造方法");
    }
}
