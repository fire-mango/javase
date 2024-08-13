package com.mango.a_method;

public class Demo06Method {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        method(a, b);
        System.out.println("===========================");
        int c = sum(a, b);
        System.out.println("c = " + c);
    }

    // 定义一个方法
    public static void method(int a, int b) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
