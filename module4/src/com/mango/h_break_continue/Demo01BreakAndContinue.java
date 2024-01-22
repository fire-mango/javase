package com.mango.h_break_continue;

public class Demo01BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                // break; //  结束整个循环
                continue; //  结束本次循环，继续下一次循环
            }
            System.out.println("i = " + i);
        }
    }
}
