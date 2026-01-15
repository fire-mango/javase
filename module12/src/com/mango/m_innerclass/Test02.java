package com.mango.m_innerclass;

public class Test02 {
    public static void main(String[] args) {
        // 创建对象
        USB usb = method01();
        usb.open();
    }

    public static USB method01() {
        return new USB() {
            @Override
            public void open() {
                System.out.println("打开");
            }
        };
    }
}
