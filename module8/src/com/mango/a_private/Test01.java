package com.mango.a_private;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        /*
        将实现toString功能的代码封装到方法中，对外提供一个公共接口，
        供外界使用
        */
        System.out.println(Arrays.toString(arr));
    }
}
