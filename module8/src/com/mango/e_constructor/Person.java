package com.mango.e_constructor;

public class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("我是无参构造");
    }

    public Person(String name, int age) {
        System.out.println("我是有参构造");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
