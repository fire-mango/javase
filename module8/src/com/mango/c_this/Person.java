package com.mango.c_this;

public class Person {
    private String name;

    public void setName(String xingMing) {
        name = xingMing;
    }

    public String getName() {
        return name;
    }

    public void speak(String name) {
        System.out.println(this);
        System.out.println(this.name+"你好，我是"+name);
    }
}
