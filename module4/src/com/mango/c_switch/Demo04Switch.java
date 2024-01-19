package com.mango.c_switch;

import java.util.Scanner;

public class Demo04Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个月份：");
        int month = sc.nextInt();
        // case具有穿透性
        switch (month) {
            case 12:
                System.out.println("你输入的是12月，冬季");
            case 1:
                System.out.println("你输入的是1月，冬季");
            case 2:
                System.out.println("你输入的是2月，冬季");
                break;
            case 3:
                System.out.println("你输入的是3月，春季");
            case 4:
                System.out.println("你输入的是4月，春季");
            case 5:
                System.out.println("你输入的是5月，春季");
                break;
            case 6:
                System.out.println("你输入的是6月，夏季");
            case 7:
                System.out.println("你输入的是7月，夏季");
            case 8:
                System.out.println("你输入的是8月，夏季");
                break;
            case 9:
                System.out.println("你输入的是9月，秋季");
            case 10:
                System.out.println("你输入的是10月，秋季");
            case 11:
                System.out.println("你输入的是11月，秋季");
                break;


            default:
                System.out.println("你输入的是错误月份！");
                break;
        }
  /*      switch (month) {
            case 12 -> System.out.println("你输入的是12月，冬季");
            case 1 -> System.out.println("你输入的是1月，冬季");
            case 2 -> System.out.println("你输入的是2月，冬季");
            case 3 -> System.out.println("你输入的是3月，春季");
            case 4 -> System.out.println("你输入的是4月，春季");
            case 5 -> System.out.println("你输入的是5月，春季");
            case 6 -> System.out.println("你输入的是6月，夏季");
            case 7 -> System.out.println("你输入的是7月，夏季");
            case 8 -> System.out.println("你输入的是8月，夏季");
            case 9 -> System.out.println("你输入的是9月，秋季");
            case 10 -> System.out.println("你输入的是10月，秋季");
            case 11 -> System.out.println("你输入的是11月，秋季");
            default -> System.out.println("你输入的是错误月份！");
        }*/
    }
}