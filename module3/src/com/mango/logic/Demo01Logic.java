package com.mango.logic;

public class Demo01Logic {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k = 10;
        boolean result01 = (i > j) && (i == k); // 逻辑与 如果前为假，后不判断
        System.out.println("result01: " + result01); // false

        boolean result02 = (i > j) || (i == k); //  逻辑或 如果前为真，后不判断
        System.out.println("result02: " + result02); // true

        boolean result03 = (i > j) ^ (i == k); // 逻辑异或 相同为假，不同为真
        System.out.println("result03: " + result03); // true

        boolean result04 = !(i > j); // 逻辑非 取反，前为真，后为假；前为假，后为真
        System.out.println("result04: " + result04); // true
    }
}
