package com.mango.a_method;

import java.util.Arrays;

public class Demo04Method {
    public static void main(String[] args) {
        int a = sum();
        System.out.println("===========");
        System.out.println("a = " + a);
        System.out.println("===========");
        System.out.println("args = " + sum());
    }

    // 定义一个方法
    public static int sum() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("sum = " + sum);
        return sum;
    }
}
