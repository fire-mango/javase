package com.mango.a_exception;

public class Demo09Exception {
    /*
     * try...catch...finally执行顺序：
     * 1.try代码块执行，如果try代码块没有异常，则直接执行finally代码块，并返回结果
     * 2.try代码块执行，如果try代码块有异常，则进入catch代码块，并返回结果
     * 3.try代码块执行，如果try代码块有异常，则进入catch代码块，并执行finally代码块，并返回结果
     * */
    public static void main(String[] args) {
        int result = method();
        System.out.println(result);
    }

    public static int method() {
        try {
            String s = "123456";
            System.out.println(s.length()); // 空指针异常
            // int[] a = {1, 2, 3, 4, 5};
            // System.out.println(a.length);
            return 2;
        } catch (Exception e) {
            return 1;
        } finally {
            System.out.println("finally执行了");
            return 3;
        }
    }
}
