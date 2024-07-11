package com.mango.b_array;

import java.util.Arrays;

public class Demo08Array {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        
        int[] arr2 = {60, 70, 80, 90, 100};
        
        int[] newArr = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }
      
        for (int i = 0; i < arr2.length; i++) {
            newArr[arr1.length + i] = arr2[i];
        }

        System.out.println("args = " + Arrays.toString(newArr));
    }
}
