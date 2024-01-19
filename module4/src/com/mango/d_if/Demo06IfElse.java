package com.mango.d_if;

import java.util.Scanner;

public class Demo06IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        //     输入年份输出当年2月份的天数
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("闰年2月29天");
        } else {
            System.out.println("平年2月28天");
        }
    }
}
