package com.mango.k_exam;

public class KeyBoard implements USB {
    @Override
    public void open() {
        System.out.println("键盘USB打开");
    }

    @Override
    public void close() {
        System.out.println("键盘USB关闭");
    }

    public void input() {
        System.out.println("键盘输入");
    }
}
