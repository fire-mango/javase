package com.mango.ternary;

public class Demo03Ternary {
    public static void main(String[] args) {
        int man01 = 70;
        int man02 = 80;
        int man03 = 90;
        int max = (man01 > man02) ? man01 : man02;
        max = (max > man03) ? max : man03;// 找出最大值
        String maxName = (man01 > man02) ? "man01" : "man02";
        maxName = (maxName.equals("man01")) ? "man01" : "man02";
        maxName = (max > man03) ? maxName : "man03";// 找出最大值的人
        System.out.println("最高年龄是：" + maxName + " 为：" + max);
    }
}
