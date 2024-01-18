package com.mango.logic;

public class Demo02Logic {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean result01 = (++a > 100) & (++b > 10);
        System.out.println("a = " + a); // 11
        System.out.println("b = " + b); // 21
        System.out.println("result01 = " + result01); // false
        boolean result02 = (++a > 100) && (++b > 10);
        System.out.println("a = " + a); // 11
        System.out.println("b = " + b); // 21
        System.out.println("result02 = " + result02); // false

        int i = 10;
        int j = 20;
        boolean result03 = (++i > 10) | (++j > 10);
        System.out.println("i = " + i); // 11
        System.out.println("j = " + j); // 21
        System.out.println("result03 = " + result03); // true
        boolean result04 = (++i > 10) || (++j > 10);
        System.out.println("i = " + i); // 12
        System.out.println("j = " + j); // 21
        System.out.println("result04 = " + result04); // true
        int result05 = 10 | 20;
        System.out.println("result05 = " + result05); // 30
    }
}
