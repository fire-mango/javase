package com.mango.b_object;

public class Demo02Phone {
    // 成员变量
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand = "mango";
        phone.color = "白色";
        phone.price = 5000;
        phone.call("小明");
        phone.playGame();
        String message = phone.sendMessage();
        System.out.println(message);
        System.out.println(phone.brand);
        System.out.println(phone.color);
        System.out.println(phone.price);
    }
}
