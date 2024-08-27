package com.mango.c_static;

public class Test01 {
    public static void main(String[] args) {
        int[] arr = {10, 2, 30, 4, 5, 6};
        int max = ArraysUtils.getMax(arr);
        System.out.println("max = " + max);
    }
}
