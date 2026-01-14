package com.mango.k_exam;

public class NoteBook implements USB {
    // 使用usb设备
    public static void usbUse(USB usb) {
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.open();
            mouse.click();
        } else if (usb instanceof KeyBoard) {
            KeyBoard keyboard = (KeyBoard) usb;
            keyboard.open();
            keyboard.input();
        }
    }

    // 关闭usb设备
    public static void usbClose(USB usb) {
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.close();
        } else if (usb instanceof KeyBoard) {
            KeyBoard keyboard = (KeyBoard) usb;
            keyboard.close();
        }
    }

    // 开机
    public void start() {
        System.out.println("笔记本开机");
        this.open();
    }

    // 关机
    public void stop() {
        System.out.println("笔记本关机");
        this.close();
    }

    // 打开设备
    @Override
    public void open() {
        System.out.println("笔记本USB打开");
        Mouse mouse = new Mouse();
        usbUse(mouse);
        KeyBoard keyboard = new KeyBoard();
        usbUse(keyboard);
    }

    // 关闭设备
    @Override
    public void close() {
        System.out.println("笔记本USB关闭");
        Mouse mouse = new Mouse();
        usbClose(mouse);
        KeyBoard keyboard = new KeyBoard();
        usbClose(keyboard);
    }
}
