package com.mango.a_exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo05Exception {
    /*
    throws
    作用：
    当方法内部调用其他方法时，如果方法内部调用的这个方法可能抛出异常，那么必须在方法内部处理这个异常
    或者把异常抛给方法调用者
    throws：把异常抛给方法的调用者
    抛出异常：可以直接抛出父类，也可以直接抛出Exception
     */
    public static void main(String[] args) throws /*FileNotFoundException,*//*IOException,*/ Exception {
        String a = null;
        add(a); // 添加
        delete(a); // 删除
        update(a); // 修改
        find(a); // 查找
    }

    public static void add(String s) throws /*FileNotFoundException,*//*IOException,*/ Exception {
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
