package com.mango.a_scanner;

import java.util.Scanner;

public class Demo01Scanner {
    public static void main(String[] args) {
        // 1. 导入包
        // 2. 创建对象
        Scanner sc = new Scanner(System.in);
        // 3. 使用对象调用方法获取输入的数据
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        System.out.println("您输入的整数是：" + num);

        System.out.println("请输入一个字符串：");
        String str = sc.next();
        System.out.println("您输入的字符串是：" + str);
        // 4. 关闭资源
         sc.close();
    }
}

