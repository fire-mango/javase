package com.mango.f_super_this;

public class Zi extends Fu {
    public Zi() {
        // super();
        System.out.println("我是子类中的无参构造");
    }

    public Zi(int i) {
        System.out.println("我是子类中的有参构造" + i);
    }
}
