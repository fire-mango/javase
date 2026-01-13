package com.mango.b_interface;

public class Test01 {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.open();
        String s = mouse.close();
        System.out.println("s = " + s);
    }
}
