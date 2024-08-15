package com.mango.b_object;

public class Phone {
    String brand;
    String color;
    int price;

    public void call(String name) {
        System.out.println(color + brand + "正在给" + name + "打电话");
    }

    public String sendMessage() {
        return color + brand + "正在发送短信";
    }

    public void playGame() {
        System.out.println(color + brand + "正在玩游戏" + price);
    }
}
