package com.mango.e_recursion;

public class Demo01Recursion {
    // 递归必须有出口，否则会栈溢出
    public static void main(String[] args) {
        method();
    }

    public static void method(){
      method();
    };
}
