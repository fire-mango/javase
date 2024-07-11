package com.mango.d_array;

public class Demo05Array {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8},{9}};
        System.out.println(arr1.length);

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.println("arr1[i][j] = " + arr1[i][j]);
            }
        }
    }
}
