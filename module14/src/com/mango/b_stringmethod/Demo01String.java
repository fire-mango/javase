package com.mango.b_stringmethod;

public class Demo01String {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String("hello");
        String s3 = "Hello";
        System.out.println(s1 == s2); //  false 比较地址值
        System.out.println(s1.equals(s2)); // true 比较内容
        System.out.println(s1.equalsIgnoreCase(s3)); // true 忽略大小写比较内容
    }
}
