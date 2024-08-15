package com.mango.b_object;

public class Demo03Animal {
    // 成员变量
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.color = "白色";
        animal.kind = "猫";
        animal.eat();
        animal.sleep();
        System.out.println(animal.color);
        System.out.println(animal.kind);
    }
}
