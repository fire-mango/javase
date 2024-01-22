package com.mango.f_while;

public class Demo04While {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                sum += 1;
            }
            i++;
        }
        System.out.println("sum = " + sum);
    }
}
