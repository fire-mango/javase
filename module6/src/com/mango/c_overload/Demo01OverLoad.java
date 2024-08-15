package com.mango.c_overload;
/*
方法的重载
1.方法名相同，参数列表不同的方法
2.参数列表不同分类
a.参数个数不同
b.参数类型不同
c.参数类型顺序不同
3.与返回值和参数名无关
*/
public class Demo01OverLoad {
    public static void main(String[] args) {
        sum(1, 2);
        sum(1, 2, 3);
        sum(1, 2, 3, 4);
    }

    // 两个整数相加
    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    // 三个整数相加
    public static void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    // 四个整数相加
    public static void sum(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }

    public static void sum(double a, int b) {
        System.out.println(a + b);
    }

    public static void sum(int a, double b) {
        System.out.println(a + b);
    }
}

