package com.mango.a_array;

import java.util.Arrays;
import java.util.Random;

public class Demo06Array {
    public static void main(String[] args) {
        // 定义一个数组
        int[] arr = new int[3];
        // 输出数组名称
        System.out.println("===========");
        System.out.println(arr); // [I@1b6d3586
        System.out.println(arr[0]); // 0
        System.out.println(arr[1]); // 0
        System.out.println(arr[2]); // 0
        System.out.println("===========");
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        System.out.println(arr[0]); // 10
        System.out.println(arr[1]); // 20
        System.out.println(arr[2]); // 30
        System.out.println("===========");
        System.out.println("arr = " + Arrays.toString(arr)); // arr = [10, 20, 30]
    }
}


