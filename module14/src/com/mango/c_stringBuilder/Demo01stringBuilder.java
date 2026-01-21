package com.mango.c_stringBuilder;

public class Demo01stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        // 扩容16*2+2  超过34 扩容实际容量
        sb.append("12345678912345678912345678912345");
    }
}
