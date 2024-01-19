package com.mango.c_switch;

import java.util.Scanner;

public class Demo01Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int data = sc.nextInt();
        switch (data) {
            case 1:
                System.out.println("你输入的是1");
                break;
            case 2:
                System.out.println("你输入的是2");
                break;
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
       /* switch (data) {
            case 1 -> System.out.println("你输入的是1");
            case 2 -> System.out.println("你输入的是2");
            case 3 -> System.out.println("你输入的是3");
            case 4 -> System.out.println("你输入的是4");
            default -> System.out.println("你输入的是其他值");
        }*/
    }
}
