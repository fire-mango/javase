package com.mango.d_if;

import java.util.Scanner;

public class Demo08ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数data1：");
        int data1 = sc.nextInt();
        System.out.println("请输入整数data2：");
        int data2 = sc.nextInt();
        if (data1 > data2) {
            System.out.println("data1大于data2：" + data1);
        } else if (data1 < data2) {
            System.out.println("data1小于data2：" + data2);
        } else {
            System.out.println("data1等于data2");
        }
    }
}
