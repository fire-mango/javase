package com.mango.e_final_var;

public class Test02 {
    public static void main(String[] args) {
        // Person p1 = new Person("张三", 20);
        // System.out.println(p1); // 地址值
        // p1 = new Person("李四", 21);
        // System.out.println(p1); // 地址值

        final Person p1 = new Person("张三", 20);
        System.out.println(p1); // 地址值
        // p1 = new Person("李四", 21); // 报错
        // System.out.println(p1); // 地址值

        p1.setName("李四");
        p1.setAge(21);
        System.out.println(p1); // 地址值
        System.out.println("name = " + p1.getName());
        System.out.println("age = " + p1.getAge());

        Student s1 = new Student();
        System.out.println(s1.getName());
    }
}
