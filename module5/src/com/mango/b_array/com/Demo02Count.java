package com.mango.b_array.com;

import java.util.Arrays;
import java.util.Random;

public class Demo02Count {
    public static void main(String[] args) {
        // 定义一个数组
        int[] arr = new int[20];
        // 随机生成10个元素
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(50);
        }
        // 输出数组
        System.out.println("arr = " + Arrays.toString(arr));

        System.out.println("==========");
        // 统计符合条件的元素个数
        int count = 0;

        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
            // 判断元素是否符合条件
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0 && arr[i] % 7 != 0) {
                // 符合条件，计数器+1
                count++;
            }
        }
        // 统计符合条件的元素
        int[] newArr = new int[count];
        // 定义一个索引
        int index = 0;
        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
            // 判断元素是否符合条件
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0 && arr[i] % 7 != 0) {
                // 符合条件的元素加到新数组中
                newArr[index] = arr[i];
                System.out.println("arr[" + i + "] = " + arr[i]);
                index++;
            }
        }
        // 输出符合条件的元素个数
        System.out.println("count = " + count);
        // 输出符合条件的元素
        System.out.println("newArr = " + Arrays.toString(newArr));
    }
}
