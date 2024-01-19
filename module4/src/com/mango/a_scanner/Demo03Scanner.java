package com.mango.a_scanner;

import java.util.Scanner;

public class Demo03Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        // String str01 = sc.next(); // 遇到空格或回车结束
        // System.out.println("输入的内容是："+str01);
        String str02 = sc.nextLine(); // 遇到回车结束
        System.out.println("输入的内容是："+str02);
    }
}

