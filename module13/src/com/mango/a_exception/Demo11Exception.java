package com.mango.a_exception;

import java.util.Scanner;

public class Demo11Exception {
    public static void main(String[] args)  {
        String usernmae = "admin";

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要登录的用户名：");
        String inputName = sc.next();
        if (inputName.equals(usernmae)) {
            System.out.println("登录成功");
        } else {
            try {
                throw new LoginUserException("用户名输入错误");
            } catch (Exception e) {
                System.out.println(e.toString()); // 获取简短异常信息
                System.out.println(e.getMessage()); // 获取设置异常信息
                e.printStackTrace(); // 获取全部异常信息
            }
        }
    }
}
