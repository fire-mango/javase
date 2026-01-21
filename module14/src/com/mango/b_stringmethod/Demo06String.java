package com.mango.b_stringmethod;

import java.io.UnsupportedEncodingException;

public class Demo06String {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s1 = "hello";
        char[] charArray = s1.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
        System.out.println("==========");
        byte[] bytes = s1.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("==========");
        System.out.println(s1.replace('l', 'w'));
        System.out.println("==========");
        byte[] bytes1 = "你好".getBytes("utf-8");
        for (int i = 0; i < bytes1.length; i++) {
            System.out.println(bytes1[i]);
        }
    }
}
