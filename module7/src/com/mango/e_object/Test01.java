package com.mango.e_object;

public class Test01 {
    public static void main(String[] args) {
        Citizen c = new Citizen();
        c.name = "mango";
        c.idCard = "123456789";
        // c.birthday = new MyDate();
        c.birthday.day = 1;
        c.birthday.month = 1;
        c.birthday.year = 2000;
        System.out.println(c.name);
        System.out.println(c.idCard);
        System.out.println(c.birthday.year);
        System.out.println(c.birthday.month);
        System.out.println(c.birthday.day);
    }
}
