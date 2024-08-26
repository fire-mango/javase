package com.mango.f_javabean;

public class Test01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setSname("aaa");
        student.setSid(1);
        System.out.println(student.getSname());
        System.out.println(student.getSid());

        Student student1 = new Student(2, "bbb");
        System.out.println(student1.getSname());
        System.out.println(student1.getSid());
    }
}
