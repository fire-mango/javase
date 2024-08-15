package com.mango.d_object;
/*
* 成员变量在堆中，跟着对象走。随着对象的创建，在堆中创建。随着对象的销毁，在堆中销毁。
* 局部变量在栈中，跟着方法走。随着方法的调用，在栈中创建。随着方法的结束，在栈中销毁。
* */
public class Variable {
    String name; // 成员变量

    public void fun1() {
        int i = 10;
        System.out.println(i); // 局部变量没有默认值，需要手动赋值后再使用
        int j; // 局部变量
        // System.out.println(j); // 局部变量没有默认值，需要手动赋值后再使用
        System.out.println(name); // 成员变量可以直接使用，因为有默认值
    }
    public void fun2() {
        // System.out.println(i); // 局部变量只能在定义它的方法中使用
        System.out.println(name); // 成员变量可以在定义它的类中，也可以在其它类中使用
    }
}
