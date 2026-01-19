package com.mango.b_object;

import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
        Person p1 = new Person("张三", 20);
        System.out.println(p1); // 地址值
        System.out.println(p1.toString()); // 地址值
        /*
         * 如果没有重写toString()方法，默认调用toString方法，打印对象的地址值
         * */
        System.out.println("============================");
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        System.out.println(list);
        System.out.println(list.toString());
    }
}
