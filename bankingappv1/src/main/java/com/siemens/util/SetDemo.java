package com.siemens.util;

import com.github.javafaker.Faker;

import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        Faker faker = new Faker();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<100;i++){
            set.add(faker.random().nextInt(1,50));
        }
        System.out.println(set);
    }
}
