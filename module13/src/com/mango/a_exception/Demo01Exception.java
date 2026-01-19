package com.mango.a_exception;

import java.text.SimpleDateFormat;

public class Demo01Exception {
    public static void main(String[] args) {
        // 错误Error StackOverflowError
        // method();

        // 运行时异常RuntimeException ArrayIndexOutOfBoundsException
        int[] arr = new int[3];
        // System.out.println(arr[4]);

        /*
         * 编译时期异常：当调用方法时，该方法抛出异常，没有处理异常，则编译器会报错
         * */
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        String time = "2000-10-10 10:10:10";
        // Date date = sdf.parse(time);
        // System.out.println(date);
    }

    public static void method() {
        method();
    }
}
