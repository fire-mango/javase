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
        // 1.键盘录入学生信息
        System.out.println("请您输入学生学号：");
        int id = sc.nextInt();
        // 检查学号是否已存在
        while (ArrayUtils.findIndexById(students, id, count) != -1) {
            System.out.println("当前学号已存在，请重新输入");
            id = sc.nextInt();
        }
        System.out.println("请您输入学生姓名：");
        String name = sc.next();
        System.out.println("请您输入学生年龄：");
        int age = sc.nextInt();
        System.out.println("请您输入学生性别：");
        String sex = sc.next();
        // 2.将学生信息封装到Student对象中
        Student student = new Student(id, name, age, sex);
        // 3.将封装好的Student对象放到students数组中
        students[count] = student;
        // 4.count++记录存储了多少个对象
        count++;
        System.out.println("添加成功");
    }

    /*
     查看学生
     * */
    private void findAllStudent() {
        System.out.println("学号" + "\t" + "姓名" + "\t" + "年龄" + "\t" + "性别");
        // 如果count为0，没有添加过学生
        if (count == 0) {
            System.out.println("当前班级没有学生");
        } else {
            // 按学号冒泡排序,防止删除后再次添加相同学号对应学生产生乱序情况
            for (int i = 0; i < count - 1; i++) {
                for (int j = 0; j < count - 1 - i; j++) {
                    if (students[j].getId() > students[j + 1].getId()) {
                        Student temp = students[j];
                        students[j] = students[j + 1];
                        students[j + 1] = temp;
                    }
                }
            }
            for (int i = 0; i < count; i++) {
                System.out.println(students[i].getId() + "\t" + students[i].getName() + "\t" + students[i].getAge() + "\t" + students[i].getSex());
            }
        }
    }

    /*
     修改学生
     * */
    private void updateStudent() {
        // 1.录入要修改的学生学号
        System.out.println("请您输入学生学号：");
        int id = sc.nextInt();
        // 2.修改对应数据
        /*
        修改完成不能将id当成索引存储,id和学生在数组中的索引不是对应的
        根据id查询数据的正确索引位置
        * */
        int updateIndex = ArrayUtils.findIndexById(students, id, count);
        if (updateIndex != -1) {
            while (true) {
                System.out.println("-----------------修改学生信息-----------------");
                System.out.println("1 修改学号");
                System.out.println("2 修改姓名");
                System.out.println("3 修改年龄");
                System.out.println("4 修改性别");
                System.out.println("5 退出修改");
                System.out.println("请输入你的选择：");
                int num = sc.nextInt();
                System.out.println("--------------------------------------------");
                switch (num) {
                    case 1 -> {
                        System.out.println("请您输入学生学号：");
                        int newId = sc.nextInt();
                        students[updateIndex].setId(newId);
                    }
                    case 2 -> {
                        System.out.println("请您输入学生姓名：");
                        String name = sc.next();
                        students[updateIndex].setName(name);
                    }
                    case 3 -> {
                        System.out.println("请您输入学生年龄：");
                        int age = sc.nextInt();
                        students[updateIndex].setAge(age);
                    }
                    case 4 -> {
                        System.out.println("请您输入学生性别：");
                        String sex = sc.next();
                        students[updateIndex].setSex(sex);
                    }
                    case 5 -> {
                        System.out.println("欢迎下次使用");
                        return;
                    }
                    default -> System.out.println("请输入已有功能");
                }
            }
        } else {
            System.out.println("抱歉，未查找到对应学生！");
        }
    }

    /*
    删除学生
    * */
    private void deleteStudent() {
        // 1.录入要删除的学生学号
        System.out.println("请您输入学生学号：");
        int id = sc.nextInt();
        // 2.删除对应数据
        /*
        修改完成不能将id当成索引存储,id和学生在数组中的索引不是对应的
        根据id查询数据的正确索引位置
        * */
        int updateIndex = ArrayUtils.findIndexById(students, id, count);
        if (updateIndex != -1) {
            System.out.println("updateIndex = " + updateIndex);
        } else {
            System.out.println("抱歉，未查找到对应学生！");
        }
    }


}
