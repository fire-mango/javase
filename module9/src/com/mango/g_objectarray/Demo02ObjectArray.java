package com.mango.g_objectarray;

public class Demo02ObjectArray {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        arr[0] = new Student("小明", 80);
        arr[1] = new Student("小刚", 100);
        arr[2] = new Student("小红", 90);
        Student[] arr2 = loopGarde(arr);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i].getName() + "-" + arr2[i].getScore());
        }
    }

    public static Student[] loopGarde(Student[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                int a = arr[j].getScore();
                int b = arr[j + 1].getScore();
                if (a < b) {
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
