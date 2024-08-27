package com.mango.f_array;

import java.util.Arrays;

public class Demo01Reverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        for (int min = 0, max = arr.length - 1; min < max; min++, max--) {
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
        }

        System.out.println("arr = " + Arrays.toString(arr));
    }
}
