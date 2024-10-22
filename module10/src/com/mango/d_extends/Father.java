package com.mango.d_extends;

public class Father {
    public void methodFather() {
        System.out.println("我是父");
    }

    public void method(String name) {
        System.out.println(name + "我是父类");
    }

    public void method01() {
        System.out.println("我是父类method01");
    }

    public static void method02() {
        System.out.println("method02我是父类");
    }

    public Father method03() {
        return null;
    }
}
