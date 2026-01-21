package com.mango.b_stringmethod;

public class Demo09String {
    public static void main(String[] args) {
        String s = "abcdefg";
        // 判断字符串中是否包含某个字符
        System.out.println(s.contains("a"));
        // 判断字符串中是否以某个字符结尾
        System.out.println(s.endsWith("g"));
        // 判断字符串中是否以某个字符开头
        System.out.println(s.startsWith("a"));
        // 转换字符串为小写字母
        System.out.println(s.toLowerCase());
        // 转换字符串为大写字母
        System.out.println(s.toUpperCase());
        // 删除字符串开头和结尾的空格
        String s2 = "  hello  ";
        System.out.println(s2);
        System.out.println(s2.trim());
        System.out.println("==========");
        // 去掉字符串中所有的空格
        String s3 = "  hello world  ";
        System.out.println(s3);
        System.out.println(s3.replace(" ", ""));
    }
}
