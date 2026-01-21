package com.mango.c_stringBuilder;

public class Demo02stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = sb.append("hello");
        System.out.println(sb);
        System.out.println(sb1);
        System.out.println(sb == sb1);
        System.out.println("============");
        sb.append("world").append("java");
        System.out.println(sb);
        System.out.println("============");
        sb.reverse();
        System.out.println(sb);
        System.out.println("============");
        String s = sb.toString();
        System.out.println(s);
    }
}
