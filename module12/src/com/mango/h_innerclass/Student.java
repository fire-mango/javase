package com.mango.h_innerclass;

public class Student {
    String name = "张三";

    class Heart {
        String name = "李四";

        public void display(String name) {
            System.out.println(name); // 内部类的局部变量
            System.out.println(this.name); // 内部类的成员变量
            System.out.println(Student.this.name); // 外部类的成员变量
        }
    }
}
