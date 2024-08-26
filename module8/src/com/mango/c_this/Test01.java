package com.mango.c_this;

public class Test01 {
    public static void main(String[] args) {
        Person person = new Person();
        // person.name = "mango";
        // person.age = 18;
        // System.out.println(person.name);
        // System.out.println(person.age);

        person.setName("mango");

        String name = person.getName();
        System.out.println("name = " + name);
        System.out.println(person + "..........");
        person.speak("fire");

        Person person2 = new Person();
        person.setName("aaa");
        String name2 = person.getName();
        System.out.println("name2 = " + name2);
        System.out.println(person2 + "==========");
        person2.speak("bbb");


    }
}
