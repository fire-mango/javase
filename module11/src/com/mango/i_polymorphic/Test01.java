package com.mango.i_polymorphic;

public class Test01 {
    public static void main(String[] args) {
        // 多态-向上转型
        Animal animal = new Dog();
        animal.eat();
        // animal.lookHome(); // 多态不能调用子类特有功能
        // 多态-向下转型
        Dog dog = (Dog) animal;
        dog.lookHome();
    }
}
