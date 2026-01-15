package com.mango.a_permission;

public class MyClass {
    /*
    * 在同类中public\protected\default\private修饰符 都可以访问
    * 在同包不同类中public\protected\default修饰符 可以访问 private修饰符 不可以访问
    * 在不同包子父类中public\protected修饰符 可以访问 default\private修饰符 不可以访问
    * 在不同包非子父类中public修饰符 可以访问 protected\default\private修饰符 不可以访问
    * */
    public String name;

    public void method() {
        System.out.println(name);
    }
}
