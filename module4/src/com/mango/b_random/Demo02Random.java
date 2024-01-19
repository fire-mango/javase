package com.mango.b_random;

import java.util.Random;

public class Demo02Random {
    public static void main(String[] args) {
        Random ra = new Random();
        int num1 = ra.nextInt(10); // 生成一个0-9的随机数
        System.out.println("num1 = " + num1);
        int num2 = ra.nextInt(10) + 1; // 生成一个1-10的随机数
        System.out.println("num2 = " + num2);
        int num3 = ra.nextInt(100) + 1; // 生成一个1-100的随机数
        System.out.println("num3 = " + num3);
        int num4 = ra.nextInt(900) + 100; // 生成一个100-999的随机数
        System.out.println("num4 = " + num4);
    }
}
