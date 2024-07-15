package com.mango.a_method;

public class Demo05Method {
    public static void main(String[] args) {
        int a = sum(8, 5);
        System.out.println("===========");
        System.out.println("a = " + a);
    }

    // 定义一个方法
    public static int sum(int a, int b) {
        int sum = a + b;
        System.out.println("sum = " + sum);
        return sum;
    }
}
