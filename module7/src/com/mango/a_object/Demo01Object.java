package com.mango.a_object;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Demo01Object {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.next();
        System.out.println("data = " + data);
        System.out.println("==================");
        Random rd = new Random();
        int num = rd.nextInt();
        System.out.println("num = " + num);
        System.out.println("==================");
        int[] arr = {1, 2, 3, 4, 5};
        /*System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ",");
            }
        }*/
        System.out.println(Arrays.toString(arr));
    }
}
