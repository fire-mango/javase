package com.mango.i_endless_nest;

import java.util.Random;
import java.util.Scanner;

public class Demo05Nest {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int rdNumber = rd.nextInt(100) + 1;
        while (true) {
            System.out.println("请输入一个1-100之间的整数：");
            int scNumber = sc.nextInt();
            if (scNumber > rdNumber) {
                System.out.println("猜大了");
            } else if (scNumber < rdNumber) {
                System.out.println("猜小了");
            } else {
                System.out.println("恭喜你猜对了");
                break;
            }
        }
    }
}
