package com.mango.a_method;

public class Demo01Method {
    public static void main(String[] args) {
        farmer();
        cook();
        me();
    }

    // 定义一个方法
    public static void farmer() {
        System.out.println("播种");
        System.out.println("施肥");
        System.out.println("除草");
        System.out.println("浇水");
        System.out.println("收割");
    }

    public static void cook() {
        System.out.println("洗菜");
        System.out.println("切菜");
        System.out.println("炒菜");
        System.out.println("装盘");
        System.out.println("上菜");
    }

    public static void me() {
        System.out.println("吃菜");
    }
}
