package com.mango.i_endless_nest;

public class Demo01Endless {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 10;) {
            count++;
            System.out.println("i = " + count);
        }
       while (true){
            count++;
            System.out.println("i = " + count);
        }
    }
}
