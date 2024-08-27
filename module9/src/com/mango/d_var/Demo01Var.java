package com.mango.d_var;

import java.util.Arrays;

public class Demo01Var {
    public static void main(String[] args) {
        sum(1, 2, 3, 4, 5);
        sum1(1, 2, 3, 4, 5);
    }

    public static void sum(int... arr) {
        /*
        可变参数的本质是一个数组
        参数位置不能写多个可变参数，
        当可变参数和其他参数一起使用时，可变参数要放到参数列表最后
        * */
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("sum = " + sum);
    }

    public static void sum1(int i, int... arr) {
        System.out.println("i = " + i);
        System.out.println("arr = " + Arrays.toString(arr));
    }
}
