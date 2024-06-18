package com.mango.a_array;

import java.util.Arrays;

public class Demo03Array {
    public static void main(String[] args) {
        // 定义一个数组
        int[] arr = new int[3];
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        // 输出数组名称
        System.out.println("===========");
        System.out.println("arr = " + Arrays.toString(arr));

        String[] arr1 = new String[3];
        arr1[0] = "hello";
        arr1[1] = "world";
        arr1[2] = "java";
        System.out.println("===========");
        System.out.println("arr1 = " + Arrays.toString(arr1));
    }
}
