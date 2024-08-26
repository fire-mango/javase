package com.mango.b_private;

public class Person {
    private String name;
    private int age;

    // 为name提供get/set方法
    public void setName(String xingMing) {
        name = xingMing;
    }

    public String getName() {
        return name;
    }

    // 为age提供get/set方法
    public void setAge(int nianLing) {
        if (nianLing < 0 || nianLing > 150) {
            System.out.println("年龄超标啦");
        } else {
            age = nianLing;
        }
    }

    public int getAge() {
        return age;
    }
}
