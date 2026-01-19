package com.mango.a_exception;

public class Demo03Exception {
    public static void main(String[] args) {
        String a = "a.txt";
        String b = "a.txlt";
        method(a);
        method(b);
    }

    public static void method(String s) {
        if (!s.endsWith(".txt")) {
            // 创建异常
            throw new NullPointerException("文件格式错误");
        }
        System.out.println("文件格式正确");
    }
}
