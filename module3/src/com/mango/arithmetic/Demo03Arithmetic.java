package com.mango.arithmetic;

public class Demo03Arithmetic {
    public static void main(String[] args) {
        int i = 10;
        // i++;
        ++i;
        System.out.println("i = " + i);//11

        System.out.println("========================");
        int j = 100;
        int result01 = ++j;
        System.out.println("result01 = " + result01);//101
        System.out.println("j = " + j);//101


        System.out.println("========================");
        int k = 10;
        int result02 = k++;
        System.out.println("result02 = " + result02);//10
        System.out.println("k = " + k);//11

        System.out.println("========================");
        int x = 10;
        int y = 20;
        int result03 = x++ + --y + ++x;
        System.out.println("x = " + x);//12
        System.out.println("y = " + y);//19
        System.out.println("result03 = " + result03);//41

        System.out.println("========================");
        int c = 10;
        c = c++;
        System.out.println("c = " + c);//10
    }
}
