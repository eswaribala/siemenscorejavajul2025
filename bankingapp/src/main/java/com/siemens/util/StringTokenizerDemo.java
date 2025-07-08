package com.siemens.util;

import com.github.javafaker.Faker;

import java.util.StringTokenizer;

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

        System.out.println("Only the first line..........");
        StringTokenizer st=new StringTokenizer(sb.toString(),"\n");
        while(st.hasMoreTokens()){
            String line=st.nextToken();
            StringTokenizer st2=new StringTokenizer(line,",");
            System.out.println("Name="+st2.nextToken());
            System.out.println("Age="+st2.nextToken());
        }
    }
}
