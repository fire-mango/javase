package com.mango.a_extends;

public class Test01  {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "小明";
        teacher.age = 18;
        System.out.println(teacher.name + "..." + teacher.age);
        teacher.work();
        // teacher.eat(); // 子类继承父类之后不能使用父类私有成员，只能使用父类的非私有成员
        Manager manager = new Manager();
        manager.name = "小红";
        manager.age = 18;
        System.out.println(manager.name + "..." + manager.age);
        manager.work();
        // manager.eat();
    }
}
