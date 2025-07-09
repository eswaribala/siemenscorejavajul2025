package com.siemens.util;

import com.github.javafaker.Faker;

import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        Faker faker = new Faker();
        HashSet<Integer> set1 = new HashSet<>();
        //unique numbers
        for(int i=0;i<100;i++){
            set1.add(faker.random().nextInt(1000,1050));
        }
        System.out.println(set1);
        HashSet<Integer> set2 = new HashSet<>();
        //unique numbers
        for(int i=0;i<100;i++){
            set2.add(faker.random().nextInt(1000,1050));
        }
        System.out.println(set2);
    }
}
