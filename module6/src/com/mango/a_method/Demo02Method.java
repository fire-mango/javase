package com.mango.a_method;

public class Demo02Method {
    public static void main(String[] args) {
        sum();
        System.out.println("===========");
    }

    // 定义一个方法
    public static void sum() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("sum = " + sum);
    }
}
