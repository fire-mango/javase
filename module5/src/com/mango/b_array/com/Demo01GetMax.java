package com.mango.b_array.com;

public class Demo01GetMax {
    public static void main(String[] args) {
        // 定义一个数组
        int[] arr = {5, 15, 18, 66, 21, 56};
        // 定义一个变量，用于保存最大值
        int max = arr[0];
        // 遍历数组，获取除第一个元素外的其他元素
        for (int i = 1; i < arr.length; i++) {
            // 判断元素是否大于max
            if (arr[i] > max) {
                // 替换max
                max = arr[i];
            }
        }
        // 输出最大值
        System.out.println("最大值：" + max);
    }
}
