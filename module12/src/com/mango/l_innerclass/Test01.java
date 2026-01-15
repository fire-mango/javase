package com.mango.l_innerclass;

public class Test01 {
    public static void main(String[] args) {
        new USB() {
            @Override
            public void open() {
                System.out.println("匿名打开");
            }

            @Override
            public void close() {
                System.out.println("匿名关闭");
            }
        }.open();
        new USB() {
            @Override
            public void open() {
                System.out.println("匿名打开");
            }

            @Override
            public void close() {
                System.out.println("匿名关闭");
            }
        }.close();

        System.out.println("======================");
        USB usb = new USB() {
            @Override
            public void open() {
                System.out.println("打开");
            }

            @Override
            public void close() {
                System.out.println("关闭");
            }
        };
        usb.open();
        usb.close();
    }
}
