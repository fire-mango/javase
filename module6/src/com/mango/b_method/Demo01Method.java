package com.mango.b_method;

import java.util.Scanner;

/*
键盘录入一个整数，传递到方法种，判断该整数是否是偶数，是返回偶数，否返回奇数
*/
public class Demo01Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        String result = method(num);
        System.out.println("result = " + result);
        sc.close();
    }

    public static String method(int a) {
        String str = "";
        if (a % 2 == 0) {
            str = "偶数";
        } else {
            str = "奇数";
        }
        return str;
    }
}
