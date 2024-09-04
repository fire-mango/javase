package com.mango.studentmanager;

import java.util.Scanner;

public class StudentView {
    /*
    键盘录入
    * */ Scanner sc = new Scanner(System.in);
    /*
    班级人数数组：长度为50
    * */ Student[] students = new Student[50];

    /*
    定义一个变量记录存了多少个学生信息
    * */ int count = 0;

    /*
    新数组，删除元素时，需要将删除剩下的元素复制到新数组中，
    因为数组定长，不能直接在原来的数组基础上随意改变长度
    由于一次删一个，新数组长度为老数组长度-1
    * */ Student[] newStudents = new Student[students.length - 1];

    /*
    start方法用于展示页面以及调用对应功能
    * */
    public void start() {
        while (true) {
            System.out.println("-----------------学生管理系统-----------------");
            System.out.println("1 添加学生");
            System.out.println("2 修改学生");
            System.out.println("3 删除学生");
            System.out.println("4 查看学生");
            System.out.println("5 退出系统");
            System.out.println("请输入你的选择：");

            int num = sc.nextInt();
            System.out.println("--------------------------------------------");

            switch (num) {
                case 1 -> addStudent();
                case 2 -> updateStudent();
                case 3 -> deleteStudent();
                case 4 -> findAllStudent();
                case 5 -> {
                    System.out.println("欢迎下次使用");
                    return;
                }
                default -> System.out.println("请输入已有功能");
            }
        }
    }

    /*
    添加学生
    * */
    private void addStudent() {
        System.out.println("添加学生");
    }

    /*
     修改学生
     * */
    private void updateStudent() {
        System.out.println("修改学生");
    }

    /*
    删除学生
    * */
    private void deleteStudent() {
        System.out.println("删除学生");
    }

    /*
     查看学生
     * */
    private void findAllStudent() {
        System.out.println("查看学生");
    }
}
