package com.mango.b_array.com;

import java.util.Scanner;

public class Demo05Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};
        int data = sc.nextInt();
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                System.out.println("Found at index: " + i);
                flag++;
                break;

            }
        }

        if (flag == 0) {
            System.out.println("Not Found");
        }
    }
}
