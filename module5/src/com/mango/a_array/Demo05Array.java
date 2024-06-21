package com.mango.a_array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Demo05Array {
    public static void main(String[] args) {
        // 定义一个随机整数数组
        int[] arr = new int[3];
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(10);
        }
        // 输出数组名称
        System.out.println("===========");
        System.out.println("arr = " + Arrays.toString(arr));
    }
}


