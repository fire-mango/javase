package com.mango.a_array;

import java.util.Arrays;

public class Demo01Array {
    public static void main(String[] args) {
        // 动态初始化
        int[] arr1 = new int[3];
        String[] arr2 = new String[3];
        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));

        // 静态初始化
        // int[] arr3 = new int[]{1, 2, 3};
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // String[] arr4 = new String[]{"a", "b", "c"};
        String[] arr4 = {"苹果", "芒果", "香蕉"};
        System.out.println("arr3 = " + Arrays.toString(arr3));
        System.out.println("arr4 = " + Arrays.toString(arr4));
    }
}
