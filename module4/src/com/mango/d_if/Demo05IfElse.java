package com.mango.d_if;

import java.util.Scanner;

public class Demo05IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data1 = sc.nextInt();
        int data2 = sc.nextInt();
        int data3 = sc.nextInt();
        int temp = 0;
        if (data1 > data2) {
            temp = data1;
        } else {
            temp = data2;
        }
        if (temp > data3) {
            System.out.println("最大值为：" + temp);
        } else {
            System.out.println("最大值为：" + data3);
        }
    }
}
