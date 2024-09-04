package com.mango.h_param;

public class Demo01Param {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        method(a, b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    private static void method(int a, int b) {
        a += 10;
        b += 20;
        System.out.println("method a = " + a);
        System.out.println("method b = " + b);
    }
}
