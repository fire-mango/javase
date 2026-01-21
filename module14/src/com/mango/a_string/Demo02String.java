package com.mango.a_string;

import java.io.UnsupportedEncodingException;

public class Demo02String {
    public static void main(String[] args) {
        // 1.String() -> 利用String的无参构造方法创建String对象
        String s1 = new String();
        System.out.println(s1);
        System.out.println("==========");
        // 2.String(String s) -> 根据字符串创建String对象
        String s2 = new String("hello");
        System.out.println(s2);
        System.out.println("==========");
        // 3.String(char[] ch) -> 根据char数组创建String对象
        char[] ch = {'h', 'e', 'l', 'l', 'o'};
        String s3 = new String(ch);
        System.out.println(s3);
        System.out.println("==========");
        // 4.String(byte[] b) -> 通过使用平台的默认字符串集解码指定的byte数组来创建新的String
        byte[] b = new byte[]{104, 101, 108, 108, 111};
        String s4 = new String(b);
        System.out.println(s4);
        System.out.println("==========");
        // 5.String(byte[] b, int start, int len) -> 通过使用指定的字符串集解码指定的byte数组来创建新的String
        byte[] b2 = new byte[]{104, 101, 108, 108, 111};
        String s5 = new String(b2, 0, 3);
        System.out.println(s5);
        System.out.println("==========");
        // 6.String(byte[] b, String charsetName) -> 通过使用指定的字符串集解码指定的byte数组来创建新的String
        byte[] b3 = new byte[]{104, 101, 108, 108, 111};
        String s6 = null;
        String s7 = null;
        try {
            s6 = new String(b3, "GBK");
            s7 = new String(b3, 0, 3);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        System.out.println(s6);
        System.out.println(s7);
    }
}
