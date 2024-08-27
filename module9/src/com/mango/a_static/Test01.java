package com.mango.a_static;

public class Test01 {
    public static void main(String[] args) {
        Student.classRoom = "222";
        Student s1 = new Student();
        s1.name = "mango";
        s1.age = 18;
        // s1.classRoom = "001";
        System.out.println(s1.name+","+s1.age+","+Student.classRoom);
        System.out.println("=======================");
        Student s2 = new Student();
        s2.name = "fire";
        s2.age = 17;
        // s2.classRoom = "001";
        System.out.println(s2.name+","+s2.age+","+Student.classRoom);
    }
}
