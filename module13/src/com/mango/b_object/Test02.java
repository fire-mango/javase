package com.mango.b_object;

import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        Person p1 = new Person("张三", 20);
        Person p2 = new Person("张三", 20);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        System.out.println("=========================");
        ArrayList<String> objects = new ArrayList<>();
        System.out.println(p1.equals(objects));
        System.out.println("=========================");
        System.out.println(p1.equals(null));
        System.out.println("=========================");
        System.out.println(p1.equals(p1));
        System.out.println("=========================");
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
