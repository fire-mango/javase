package com.mango.j_innerclass;

public class Test01 {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        method(mouse);
        System.out.println("=================");
        USB usb = method01(); // USB usb = new Mouse();
        usb.open();
    }

    // 接口作为方法参数，传递实参时，传递的是实现类对象
    public static void method(USB usb) {
        usb.open();
    }

    // 创建对象，并返回 接口作为方法返回值，实际返回的是实现类对象
    public static USB method01() {
        Mouse mouse = new Mouse();
        return mouse;
    }
}
