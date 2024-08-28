package com.mango.f_array;

import java.util.Arrays;

public class Demo02Bubble {
    public static void main(String[] args) {
        int[] arr = {8, 7, 6, 5, 4, 3, 2, 1};
        int[] arr2 = bubble(arr);
        System.out.println("arr2 = " + Arrays.toString(arr2));
    }

    // 冒泡排序
    public static int[] bubble(int[] arr) {
        // 外层比较n-1次
        for (int i = 0; i < arr.length - 1; i++) {
            // 内层比较n-1-i次
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
