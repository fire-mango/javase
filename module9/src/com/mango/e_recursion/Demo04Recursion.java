package com.mango.e_recursion;

public class Demo04Recursion {
    public static void main(String[] args) {
        int num = method(12);
        System.out.println("num = " + num);
    }

    public static int method(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return method(n - 1) + method(n - 2);
    }
}
