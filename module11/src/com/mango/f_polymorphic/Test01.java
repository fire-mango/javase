package com.mango.f_polymorphic;

public class Test01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.lookHome();

        Cat cat = new Cat();
        cat.eat();
        cat.catchMouse();

        System.out.println("=================");
        // 多态
        Animal animal = new Dog();
        animal.eat(); // 重写的animal接收的是dog对象，所以调用的是dog中的eat
        // animal.lookHome(); // 多态前提下，不能直接调用子类特有成员

        Animal animall = new Cat();
        animall.eat();
    }
}
