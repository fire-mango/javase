package com.mango.a_array;

import java.util.Arrays;
import java.util.Scanner;

public class Demo04Array {
    public static void main(String[] args) {
        // 定义一个数组
        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个元素:");
            arr[i] = sc.nextInt();
        }

        // 输出数组名称
        System.out.println("===========");
        System.out.println("arr = " + Arrays.toString(arr));
    }
}


