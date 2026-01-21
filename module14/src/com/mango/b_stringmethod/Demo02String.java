package com.mango.b_stringmethod;

import java.util.Scanner;

public class Demo02String {
    public static void main(String[] args) {
        // 1.String() -> 利用String的无参构造方法创建String对象
        String username = "admin";
        String password = "admin";
        // 2.创建Scanner对象，键盘输入用户名和密码,校验三次
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String name = sc.next();
            System.out.println("请输入密码：");
            String pwd = sc.next();
            // 3. 判断用户输入的用户名和密码是否和保存的用户名和密码一致
            if (username.equals(name) && password.equals(pwd)) {
                System.out.println("登录成功");
                break;
            } else {
                if (i < 2) {
                    System.out.println("登录失败");
                } else {
                    System.out.println("登录失败，已超过三次");
                }
            }
        }
    }
}
