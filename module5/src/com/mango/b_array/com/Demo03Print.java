package com.mango.b_array.com;

import java.util.Arrays;

public class Demo03Print {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("array = " + Arrays.toString(arr));
        System.out.println("==========");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]+"]");
            } else {
                System.out.print(arr[i]+",");
            }
        }
    }
}
