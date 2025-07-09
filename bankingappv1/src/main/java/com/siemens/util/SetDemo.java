package com.siemens.util;

import com.github.javafaker.Faker;

import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        Faker faker = new Faker();
        HashSet<Integer> set1 = new HashSet<>();
        //unique numbers
        for(int i=0;i<10;i++){
            set1.add(faker.random().nextInt(1000,1005));
        }
        System.out.println(set1);
        HashSet<Integer> set2 = new HashSet<>();
        //unique numbers
        for(int i=0;i<10;i++){
            set2.add(faker.random().nextInt(1003,1008));
        }
        System.out.println(set2);

        //union
        set1.addAll(set2);
        System.out.println(set1);
        //intersection
        set1.retainAll(set2);
        System.out.println(set1);
        //minus
        set1.removeAll(set2);
        System.out.println(set1);

    }
}
