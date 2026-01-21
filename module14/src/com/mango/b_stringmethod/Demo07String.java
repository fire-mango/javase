package com.mango.b_stringmethod;

import java.util.Scanner;

public class Demo07String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String s1 = sc.next();
        int big = 0;
        int small = 0;
        int num = 0;
        byte[] s2 = s1.getBytes();
        for (int i = 0; i < s2.length; i++) {
            if (s2[i] >= 65 && s2[i] <= 90)
                small++;
            else if (s2[i] >= 97 && s2[i] <= 122)
                big++;
            else if (s2[i] >= 48 && s2[i] <= 57)
                num++;
        }
        System.out.println("小写的个数：" + small);
        System.out.println("大写的个数：" + big);
        System.out.println("数字的个数：" + num);
    }
}
