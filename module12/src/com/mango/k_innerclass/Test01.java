package com.mango.k_innerclass;

public class Test01 {
    public static void main(String[] args) {
        USB usb = method();
        usb.open();
        System.out.println(USB.title);
        System.out.println(usb.title);
    }

    public static USB method() {
        // 局部内部类
        class Mouse implements USB {
            String title = "鼠标";
            @Override
            public void open() {
                System.out.println("鼠标开始工作");
            }
        }

        return new Mouse();
    }
}
