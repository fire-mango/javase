package com.mango.d_if;

import java.util.Scanner;

public class Demo04IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data1 = sc.nextInt();
        int data2 = sc.nextInt();
        if (data1 > data2) {
            System.out.println("data1大于data2：" + data1);
        } else {
            System.out.println("data1小于data2：" + data2);
        }
    }
}
