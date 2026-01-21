package com.mango.b_stringmethod;

import java.util.Objects;

public class Demo03String {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = null;
        main(s1);
        main(s2);
        method(s1, s2);
    }

    public static void main(String s) {
        // 可以预防空指针异常
        if ("hello".equals(s)) {
            System.out.println("是hello");
        } else {
            System.out.println("不是hello");
        }
    }

    public static void method(String s1, String s2) {
        if (Objects.equals(s1, s2)) {
            System.out.println("是hello");
        } else {
            System.out.println("不是hello");
        }
    }
}
