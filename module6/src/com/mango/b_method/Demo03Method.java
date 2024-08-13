package com.mango.b_method;

import java.util.Scanner;

/*
定义一个方法，给这个方法传几就打印几次“mango”
*/
public class Demo03Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        method(num);
        sc.close();
    }

    public static void method(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println("mango");
        }
    }
}
