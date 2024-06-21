package com.mango.a_array;

import java.util.Arrays;

public class Demo08ArrayException {
    public static void main(String[] args) {
        // 定义一个数组
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        // 数组索引越界异常
        // arr[3] = 40; // ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        System.out.println(arr[0]); // 10
        System.out.println(arr[1]); // 20
        System.out.println(arr[2]); // 30
        // System.out.println(arr[4]); // ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3
        System.out.println("arr = " + Arrays.toString(arr)); // arr = [10, 20, 30]
        System.out.println("===========");
    }
}