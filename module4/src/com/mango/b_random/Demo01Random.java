package com.mango.b_random;

import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {
        Random ra = new Random();
        int num = ra.nextInt();
        System.out.println("num = " + num);
    }
}
