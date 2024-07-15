package com.mango.a_method;

public class Demo03Method {
    public static void main(String[] args) {
        sum(1, 5);
        System.out.println("===========");
    }

    // 定义一个方法
    public static void sum(int a, int b) {
        int sum = a + b;
        System.out.println("sum = " + sum);
    }
}
