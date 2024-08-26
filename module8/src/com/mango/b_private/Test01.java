package com.mango.b_private;

public class Test01 {
    public static void main(String[] args) {
        Person person = new Person();
        // person.name = "mango";
        // person.age = 18;
        // System.out.println(person.name);
        // System.out.println(person.age);

        person.setName("mango");
        person.setAge(154);

        String name = person.getName();
        int age = person.getAge();
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }
}
