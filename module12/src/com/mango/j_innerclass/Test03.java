package com.mango.j_innerclass;

public class Test03 {
    public static void main(String[] args) {
        Person p1 = new Person();
        method01(p1);
        System.out.println("===============");
        Person p2 = method02();
        p2.eat();
    }

    public static void method01(Person person) {
        person.eat();
    }

    public static Person method02() {
        return new Person();
    }
}
