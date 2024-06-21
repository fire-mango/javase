package com.mango.a_array;

import java.util.Arrays;

public class Demo09ArrayException {
    public static void main(String[] args) {
        // 定义一个数组
        int[] arr = new int[3];
        System.out.println(arr.length); // [I@1b6d3586
        // 空指针异常
        // arr = null;
        // System.out.println(arr.length); // NullPointerException
    }
}