package com.mango.a_method;
/*
    需求：定义一个方法，比较两个整数大小，如果第一个比第二个大，返回true，否则返回false
*/
public class Demo07Method {
    public static void main(String[] args) {
        int a = 100;
        int b = 20;
        boolean c = comple(a, b);
        System.out.println("c = " + c);
    }

    // 定义一个方法
    public static boolean comple(int a, int b) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        return a > b;
    }
}
