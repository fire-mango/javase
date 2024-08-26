package com.mango.f_javabean;
/*
类名——>表名
属性名——>列名
对象——>表中每一行数据
属性值——>表中单元格中的数据
*/
public class Student {
    private int sid;
    private String sname;

    public Student() {
    }

    public Student(int sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSname() {
        return sname;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getSid() {
        return sid;
    }
}
