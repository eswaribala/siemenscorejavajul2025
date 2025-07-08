package com.siemens.util;

import com.github.javafaker.Faker;

public class ReverseName {

    public static void main(String[] args) {

        Faker faker=new Faker();
        StringBuilder sb=null;
        for(int i=0;i<5;i++){
            sb=new StringBuilder(faker.name().fullName());
            System.out.println(sb+","+sb.reverse());
        }
    }
}
