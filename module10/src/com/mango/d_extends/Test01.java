package com.mango.d_extends;

public class Test01 {
    public static void main(String[] args) {
        Father father = new Father();
        father.methodFather();
        father.method("father");
        System.out.println("...........");
        Son son = new Son();
        son.methodFather();
        son.methodSon();
        son.method("son");
    }
}
