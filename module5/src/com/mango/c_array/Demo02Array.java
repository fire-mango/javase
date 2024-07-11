package com.mango.c_array;

public class Demo02Array {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        System.out.println(arr1); // [I@776ec8df
        System.out.println(arr1[1]); // 0
        arr1[1] = 100;
        
        int[] arr2 = new int[3];
        System.out.println(arr2); // [I@4eec7777
        System.out.println(arr2[1]); // 0
        arr2[1] = 200;

        System.out.println(arr1[1]); // 100
        System.out.println(arr2[1]); // 200
    }
}
