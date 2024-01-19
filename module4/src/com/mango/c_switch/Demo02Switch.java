package com.mango.c_switch;

import java.util.Scanner;

public class Demo02Switch {
    public static void main(String[] args) {
        /*
            switch匹配的数据类型
                byte short int char jdk 7.0 jdk 8.0
                jdk 9.0 支持了 String
                jdk 13.0 支持了枚举
                jdk 14.0 支持了基本类型的包装类
        */
        float num = 2.5F;
        switch ((int) num) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}
