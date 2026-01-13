package com.mango.e_interface;

public interface InterfaceA {
    public abstract void method();
    public default void methodDef() {
        System.out.println("我是A");
    }
    public default void methodDefSame(int a) {
        System.out.println("我是A-Same" + a);
    }
}
