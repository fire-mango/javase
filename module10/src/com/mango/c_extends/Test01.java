package com.mango.c_extends;

public class Test01 {
    public static void main(String[] args) {
        Father father = new Father();
        father.methodFather();
        // father.methodSon(); // 父类不能直接调用子类特有方法
        father.method();
        System.out.println("...........");
        Son son = new Son();
        son.methodFather(); // 子类可以调用父类方法
        son.methodSon();
        son.method();

        // 成员方法：看new的是谁 调用谁的方法 子类没有找父类
        System.out.println("--------------------");
        Father f = new Son();
        f.method();
    }
}
