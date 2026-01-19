package com.mango.a_exception;

public class Demo10Exception {
    /*
     * 如果父类的方法声明了 throws Exception，子类重写该方法时，可抛可不抛
     * 如果父类方法没有 throws Exception，子类重写该方法时，不能抛出 Exception
     * */
    public static void main(String[] args) {

    }

    class A {
        public void method() throws Exception {

        }
    }

    class B extends A {
        @Override
        public void method() throws Exception {

        }
    }
}
