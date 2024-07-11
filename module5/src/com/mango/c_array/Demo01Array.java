package com.mango.c_array;

public class Demo01Array {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr); // [I@776ec8df
        System.out.println(arr[1]); // 0
        arr[1] = 100;
        System.out.println(arr[1]); // 100
    }
}
