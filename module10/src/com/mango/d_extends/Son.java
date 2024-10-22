package com.mango.d_extends;

public class Son extends Father {
    public void methodSon() {
        System.out.println("我是子");
    }

    @Override
    public void method(String name) {
        System.out.println(name + "我是子类");
    }
    // 1.子类重写父类方法之后，权限必须要大于等于父类权限（权限指的是访问权限）
    // public -> protected -> 默认 -> private
    // 2.子类重写父类方法，方法名和参数列表要一样
    // 3.私有方法不能重写，构造方法不能重写，静态方法不能重写
    // 4.子类重写父类方法之后，返回值类型应该是父类方法返回值类型的子类类型

    // 1
    // @Override
    // private void method01() {
    //     System.out.println("我是子类");
    // }

    //  3
    // @Override
    // public static void method02() {
    //     System.out.println("method02我是子类");
    // }

    //  4
    // @Override
    // public Son method03() {
    //     return null;
    // }
}
