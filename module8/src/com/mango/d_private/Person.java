package com.mango.d_private;

public class Person {
    private String name;
    private int age;

    // 为name提供get/set方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 为age提供get/set方法
    public void setAge(int name) {
        if (name < 0 || name > 150) {
            System.out.println("年龄超标啦");
        } else {
            this.age = name;
        }
    }

    public int getAge() {
        return age;
    }
}
