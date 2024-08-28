package com.mango.f_array;

public class Demo03Binary {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = bubble(arr, 30);
        System.out.println("key = " + key);
    }

    // 二分查找
    public static int bubble(int[] arr, int data) {
        // 最小索引
        int min = 0;
        // 最大索引
        int max = arr.length - 1;
        // 中间索引
        int mid = 0;
        while (min <= max) {
            mid = (min + max) / 2;
            if (data > arr[mid]) {
                mid += 1;
                min = mid;
            } else if (data < arr[mid]) {
                mid -= 1;
                max = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
