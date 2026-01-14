package com.mango.j_polymorphic;

public class Test01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        show(dog);

        System.out.println("==================");
        Cat cat = new Cat();
        show(cat);
    }

    public static void show(Animal animal) {
        // animal.eat();
        /*
        类型转换异常：ClassCastException
        原因：调用method()方法时，animal对象类型是Cat，
             将cat对象的animal对象转换成Dog对象
             等号两边类型不一致，转换异常
        */
        // Dog dog = (Dog) animal;
        // dog.lookHome();
        // 解决方法
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.eat();
            dog.lookHome();
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.eat();
            cat.catchMouse();
        }
    }
}
