package com.mango.h_polymorphic;

public class Test02 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
        System.out.println("=====================");
        animal = new Cat();
        animal.eat();
        System.out.println("=====================");
        Dog dog = new Dog();
        show(dog); //  Animal animal = new Dog();
        System.out.println("=====================");
        Cat cat = new Cat();
        show(cat); //  Animal animal = new Cat();
    }

    public static void show(Animal animal) {
        animal.eat();
    }
}
