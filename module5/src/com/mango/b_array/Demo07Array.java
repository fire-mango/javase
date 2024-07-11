package com.mango.b_array;

public class Demo07Array {
    public static void main(String[] args) {
        // 定义老数组
        int[] oldArr = {10, 20, 30, 40, 50};
        // 定义新数组
        int[] newArr = new int[10];

        // 将老数组中的元素复制到新数组
        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
        }

        // 将新数组的地址值给老数组
        oldArr = newArr;

        System.out.println("oldArr.length = " + oldArr.length);

        for (int i = 0; i < oldArr.length; i++) {
            System.out.println("oldArr = " + oldArr[i]);
        }
    }
}
