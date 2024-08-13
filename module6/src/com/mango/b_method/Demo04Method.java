package com.mango.b_method;

import java.util.Scanner;

/*
在main方法中定义一个数组，把数组传递到方法中，在方法中遍历数组
*/
public class Demo04Method {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        method(arr);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println("arr[" + i + "] 1= " + arr[i]);
        // }
    }

    public static void method(int[] a) {
        // a[1] = 6;
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
