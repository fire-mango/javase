package com.mango.a_array;

import java.util.Arrays;

public class Demo07Array {
    public static void main(String[] args) {
        // 定义一个数组
        int[] arr = new int[3];
        // 输出数组名称
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
        System.out.println("arr = " + Arrays.toString(arr)); // arr = [10, 20, 30]
        System.out.println("===========");

        String[] arr2 = new String[3];
        System.out.println(arr2); // [Ljava.lang.String;@1b6d3586
        System.out.println(arr2[0]); // null
        System.out.println(arr2[1]); // null
        System.out.println(arr2[2]); // null
        System.out.println("===========");
        arr2[0] = "hello";
        arr2[1] = "world";
        arr2[2] = "java";
        System.out.println(arr2[0]); // hello
        System.out.println(arr2[1]); // world
        System.out.println(arr2[2]); // java
        System.out.println("arr2 = " + Arrays.toString(arr2)); // arr2 = [hello, world, java]
        System.out.println("===========");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        System.out.println("===========");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2[" + i + "] = " + arr2[i]);
        }
        /*
        快捷键
        数组名.fori
        */
    }
}