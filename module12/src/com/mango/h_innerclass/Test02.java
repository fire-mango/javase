package com.mango.h_innerclass;

public class Test02 {
    public static void main(String[] args) {
        Student.Heart h = new Student().new Heart();
        h.display("mango");
    }
}
