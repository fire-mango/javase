package com.mango.b_array.com;

import java.util.Arrays;
import java.util.Random;

public class Demo04Count {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("array = " + Arrays.toString(arr));
        System.out.println("==========");
        System.out.println("Even numbers: " + count);
    }
}
