package com.mango.d_if;
public class Demo07IfElse {
    public static void main(String[] args) {
        boolean num1 = false;
        boolean num2 = true;
        int i = 1;
        /*
            num1 = false
            num2 = true
            num1 = num2 -> true
        */
        if (num1 = num2) {
            i++;
            System.out.println("i1 = " + i);
        }
        if (false){
            --i;
            System.out.println("i2 = " + i);
        }
    }
}
