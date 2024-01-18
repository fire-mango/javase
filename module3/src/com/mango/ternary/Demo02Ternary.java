package com.mango.ternary;

public class Demo02Ternary {
    public static void main(String[] args) {
        int man01 = 70;
        int man02 = 80;
        int max = (man01 > man02) ? man01 : man02;
        String maxName = (man01 > man02) ? "man01" : "man02";
        System.out.println("最高年龄是：" + maxName + " 为：" + max);
    }
}
