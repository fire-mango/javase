package com.mango.g_polymorphic;

public class Test01 {
    public static void main(String[] args) {
        Fu fu = new Zi();
        System.out.println(fu.num);
        fu.method();
        System.out.println("===========");
        Zi zi = new Zi();
        System.out.println(zi.num);
        zi.method();
        zi.show();
        zi.ziShow();
        System.out.println("===========");
        Fu fu1 = new Fu();
        System.out.println(fu1.num);
        fu1.method();
    }
}
