package com.mango.e_recursion;

public class Demo03Recursion {
    public static void main(String[] args) {
        int num = method(3);
        System.out.println("num = " + num);
    }

    public static int method(int n) {
        if (n == 1) {
            return 1;
        }
        return n * method(n - 1);
    }
}
