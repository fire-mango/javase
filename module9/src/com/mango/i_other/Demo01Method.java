package com.mango.i_other;

public class Demo01Method {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // 可使用alt+enter生成方法
        method(a, b);
        // ctrl+alt+m快速生成方法
        logMethod("a = ", a, "b = ", b);
    }

    private static void logMethod(String x, int a, String x1, int b) {
        System.out.println(x + a);
        System.out.println(x1 + b);
    }

    private static void method(int a, int b) {
        a += 10;
        b += 20;
        logMethod("method a = ", a, "method b = ", b);
    }
}
