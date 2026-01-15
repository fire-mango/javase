package com.mango.e_final_var;

public class Test01 {
    public static void main(String[] args) {
        final int a = 10;
        //a = 20; // 被final修饰的变量不能被二次赋值

        final int b;
        b = 20;
        // b = 30;
    }
}
