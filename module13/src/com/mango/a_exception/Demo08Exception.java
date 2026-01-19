package com.mango.a_exception;

import java.io.FileNotFoundException;

public class Demo08Exception {
    public static void main(String[] args) {
        String a = "a.txt1";
        try {
            add(a); // 添加
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally执行");
        }
    }

    public static void add(String s) throws FileNotFoundException {
        if (!s.endsWith(".txt")) {
            throw new FileNotFoundException("文件格式错误");
        }
        System.out.println("添加成功！");
    }
}
