package com.mango.d_var;

public class Demo02Var {
    public static void main(String[] args) {
        String c1 = concat("fire", "mango");
        System.out.println("c1 = " + c1);
        String c2 = concat2("-", "fire", "mango");
        System.out.println("c2 = " + c2);
    }

    // 练习一，多个字符串拼接
    public static String concat(String... arr) {
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
        }
        return str;
    }

    // 练习二，多个字符串用特定符号拼接
    public static String concat2(String i, String... arr) {
        String str = "";
        for (int j = 0; j < arr.length; j++) {
            if (j == 0) {
                str += arr[j];
            } else {
                str += i + arr[j];
            }
        }
        return str;
    }
}
