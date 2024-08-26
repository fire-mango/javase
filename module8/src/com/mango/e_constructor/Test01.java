package com.mango.e_constructor;

public class Test01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("aaa");
        person.setAge(18);
        System.out.println(person.getName());
        System.out.println(person.getAge());
        Person person2 = new Person("name", 18);
        System.out.println(person2.getName());
        System.out.println(person2.getAge());
    }
}
