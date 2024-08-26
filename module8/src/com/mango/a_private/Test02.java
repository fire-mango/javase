package com.mango.a_private;

public class Test02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        /*
        将实现toString功能的代码封装到方法中，对外提供一个公共接口，
        供外界使用
        */
        method(arr);
    }

    public static void method(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ",");
            }
        }
    }
}
