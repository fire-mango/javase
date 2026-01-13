package com.mango.e_interface;

public interface InterfaceB {
    public abstract void method();

    public default void methodDef() {
        System.out.println("我是B");
    }
    public default void methodDefSame() {
        System.out.println("我是B-Same");
    }
}
