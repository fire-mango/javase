package com.mango.c_stringBuilder;

import java.util.Scanner;

public class Demo03stringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String s1 = sc.next();
        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();
        String s2 = sb.toString();
        System.out.println(s1.equals(s2));
        System.out.println("============");
        if (s1.equals(s2)){
            System.out.println("回文");
        }else{
            System.out.println("不是回文");
        }
    }
}
