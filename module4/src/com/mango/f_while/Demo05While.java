package com.mango.f_while;

public class Demo05While {
    public static void main(String[] args) {
/*        int mountain = 0;
        int paper = 1;
        while (paper <= 88444300) {
            mountain += 1;
            paper = paper * 2;
        }
        System.out.println("mountain = " + mountain);*/
        int mountain = 8844430;
        double paper = 0.1;
        int count = 0;
        while (paper < mountain) {
            paper *= 2;
            count++;
        }
        System.out.println("count = " + count);
    }
}
