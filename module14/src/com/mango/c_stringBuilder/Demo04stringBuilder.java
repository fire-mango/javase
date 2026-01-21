package com.mango.c_stringBuilder;

public class Demo04stringBuilder {
    public static void main(String[] args) {
        // 定义一个数组，以[元素1，元素2，元素3..]的形式输出，用StringBui1der拼接
        String[] arr = {"hello", "world", "java"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0){
                sb.append("[");
            }
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(",");
            }
            if (i == arr.length - 1) {
                sb.append("]");
            }
        }
        System.out.println(sb);
    }
}
