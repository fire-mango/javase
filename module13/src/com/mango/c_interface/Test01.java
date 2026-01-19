package com.mango.c_interface;

public class Test01 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 20);
        Student s3 = new Student("王五", 22);
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int j = 0; j < students.length - 1; j++) {
            for (int i = 0; i < students.length - 1 - j; i++) {
                // 升序
                if (students[i].compareTo(students[i + 1]) > 0) {
                    Student temp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = temp;
                }
            }
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
