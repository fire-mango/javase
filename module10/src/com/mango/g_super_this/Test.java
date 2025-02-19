package com.mango.g_super_this;

public class Test {
    public static void main(String[] args) {
        Zi zi = new Zi();
        System.out.println("======================");
        Zi zi1 = new Zi(10);
        System.out.println("======================");
        Zi zi2 = new Zi();
        zi2.method();
        /*
        1.概述:代表的是父类引用
        2.作用:可以调用父类中的成员
        3.使用:
          a.调用父类构造方法-> 在子类中的构造中写
            super() -> 调用父类无参构造
            super(实参)  -> 调用父类有参构造

          b.调用父类成员变量:
            super.成员变量名

          c.调用父类成员方法:
            super.成员方法名(实参)
        * */
    }
}
