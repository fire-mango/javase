package com.mango.e_recursion;

public class Demo02Recursion {
    public static void main(String[] args) {
        method(3);
    }

    public static void method(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        n--;
        method(n);
    }
}
