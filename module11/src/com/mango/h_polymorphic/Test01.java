package com.mango.h_polymorphic;

public class Test01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.lookHome();

        System.out.println("=====================");
        show(dog);

        // Cat cat = new Cat();
        // show(cat); // 接收不了扩展性差
    }

    public static void show(Dog dog) {
        dog.eat();
        dog.lookHome();
    }
}
