package com.mango.d_private;


public class Test01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("mango");
        person.setAge(18);
        String name = person.getName();
        int age = person.getAge();
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }
}
