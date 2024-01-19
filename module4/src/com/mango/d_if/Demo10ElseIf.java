package com.mango.d_if;

import java.util.Scanner;

public class Demo10ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        if (age >= 0 && age <= 6) {
            System.out.println("婴幼儿");
        } else if (age >= 7 && age <= 12) {
            System.out.println("少儿");
        } else if (age >= 13 && age <= 17) {
            System.out.println("青少年");
        } else if (age >= 18 && age <= 45) {
            System.out.println("青年");
        } else if (age >= 46 && age <= 69) {
            System.out.println("中年");
        } else if (age >= 70 && age <= 150) {
            System.out.println("老年");
        } else {
            System.out.println("没有这样的人");
        }

    }
}
