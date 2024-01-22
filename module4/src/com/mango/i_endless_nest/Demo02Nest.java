package com.mango.i_endless_nest;

public class Demo02Nest {
    public static void main(String[] args) {
        for (int minutes = 0; minutes < 60; minutes++) {
            for (int seconds = 0; seconds < 60; seconds++) {
                // System.out.println(minutes+ ":" + seconds);
                // 输出当前分钟和秒数 如果为个位数 打印前加上0 列：minutes = 1 打印 01
                System.out.printf("%02d:%02d\n", minutes, seconds);
                // 输出当前分钟和秒数 如果为个位数 打印前加上0 列：minutes = 1 打印 01
                // System.out.println(String.format("%02d:%02d", minutes, seconds));
                // 输出当前分钟和秒数 如果为个位数 打印前加上0 列：minutes = 1 打印 01
                // System.out.printf("%02d:%02d\n", minutes, seconds);
            }
        }

    }
}
