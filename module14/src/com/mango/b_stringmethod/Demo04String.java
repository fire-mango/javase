package com.mango.b_stringmethod;

public class Demo04String {
    public static void main(String[] args) {
        String s1 = "hello";
        System.out.println(s1.length()); // 获取字符串的长度
        System.out.println(s1.concat("world")); // 连接字符串
        System.out.println(s1.charAt(0)); // 获取指定索引位置的字符
        System.out.println(s1.indexOf('l')); // 获取指定字符的索引位置
        System.out.println(s1.indexOf("ll")); // 获取指定字符串的索引位置
        System.out.println(s1.lastIndexOf('l')); // 获取指定字符的索引位置
        System.out.println(s1.lastIndexOf("ll")); // 获取指定字符串的索引位置
        System.out.println(s1.substring(1)); // 获取子串
        System.out.println(s1.substring(1, 3)); // 获取子串 含开始索引位置，不包含结束索引位置
    }
}
