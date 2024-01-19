package com.mango.c_switch;

import java.util.Scanner;

public class Demo03Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        switch (data) {
            case 1:
                System.out.println("你输入的是1");
            case 2:
                System.out.println("你输入的是2");
            case 3:
                System.out.println("你输入的是3");
                break;
            case 4:
                System.out.println("你输入的是4");
                break;
            default:
                System.out.println("你输入的是其他值");
                break;
        }
    }
}