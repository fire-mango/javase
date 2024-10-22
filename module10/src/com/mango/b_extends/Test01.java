package com.mango.b_extends;

public class Test01 {
    public static void main(String[] args) {
        Father father = new Father();
        System.out.println(father.numFather); // 父类直接调用
        // System.out.println(father.numSon); // 父类不能直接调用子类特有的成员
        System.out.println(father.num); // 父类可以调用父类特有成员
        System.out.println("++++++++++++");
        Son son = new Son();
        System.out.println(son.numFather); // 子类直接调用父类非私有成员
        System.out.println(son.numSon); // 子类直接调用
        System.out.println(son.num); // 子类覆盖父类的同名成员
        System.out.println("++++++++++++");
        // 成员变量：等号左边是谁，先调用谁中的成员，子类没有找父类
        Father f = new Son();
        System.out.println(f.num);
    }
}
