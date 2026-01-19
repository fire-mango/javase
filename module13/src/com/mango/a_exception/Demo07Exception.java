package com.mango.a_exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo07Exception {
    public static void main(String[] args) {
        String a = null;
        try {
            add(a); // 添加
        } /*catch (FileNotFoundException e) {
            System.out.println(e);
        } */ /*catch (IOException e) {
            System.out.println(e);
        } */catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
        delete(a); // 删除
        update(a); // 修改
        find(a); // 查找
    }

    public static void add(String s) throws FileNotFoundException, IOException {
        if (s == null) {
            throw new IOException("文件不存在");
        }
        if (!s.endsWith(".txt")) {
            throw new FileNotFoundException("文件格式错误");
        }
        System.out.println("添加成功！");
    }

    public static void delete(String s) {
        System.out.println("删除成功！");
    }

    public static void update(String s) {
        System.out.println("修改成功！");
    }

    public static void find(String s) {
        System.out.println("查找成功！");
    }
}
