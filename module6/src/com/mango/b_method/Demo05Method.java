package com.mango.b_method;

/*
定义一个方法返回数组
*/
public class Demo05Method {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int[] arr = method(a, b);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] method(int a, int b) {
        int sum = a + b;
        int sub = a - b;
        int[] arr = {sum, sub};
        return arr;
    }
}
