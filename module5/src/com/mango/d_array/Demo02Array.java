package com.mango.d_array;

import java.util.Arrays;

public class Demo02Array {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8}, {9}};
        System.out.println(arr1.length);

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("args = " + Arrays.toString(arr1[i]));
        }
    }
}
