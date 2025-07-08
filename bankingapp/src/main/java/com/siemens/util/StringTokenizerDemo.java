package com.siemens.util;

import com.github.javafaker.Faker;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        Faker faker=new Faker();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<5;i++){
            sb.append(faker.name().firstName());
            sb.append(",");
            sb.append(faker.random().nextInt(1,70));
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
