package com.mango.e_interface;

public class InterfaceImpl implements InterfaceA, InterfaceB {
    @Override
    public void method() {
        System.out.println("重写一次");
    }

    @Override
    public void methodDef() {
        System.out.println("重写方法");
    }
}
