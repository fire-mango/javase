package com.mango.b_object;

public class Test03 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("张三", 18);
        Object p2 = p1.clone(); // 克隆一个属性值一样的新对象
        Person p3 = (Person) p2;
        System.out.println(p1 == p3);
        System.out.println(p1.equals(p3));
    }
}
