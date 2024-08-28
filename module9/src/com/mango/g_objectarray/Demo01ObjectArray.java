package com.mango.g_objectarray;

import java.util.Arrays;

public class Demo01ObjectArray {
    public static void main(String[] args) {
        /*
        1.定义一个存储int型的数组：int[]
        2.定义一个存储double型的数组：double[]
        3.定义一个存储String型的数组：String[]
        4.定义一个存储Person型的数组：Person[]
        * */
        // 定义数组
        Person[] arr = new Person[3];
        Person p1 = new Person("mango", 18);
        Person p2 = new Person("fire", 18);
        Person p3 = new Person("xxx", 18);

        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("================");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName() + "--" + arr[i].getAge());
        }
    }
}
