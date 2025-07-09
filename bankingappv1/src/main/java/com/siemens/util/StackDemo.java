package com.siemens.util;

import com.github.javafaker.Faker;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Faker faker = new Faker();
        int number=faker.random().nextInt(1,20);
        System.out.println("number: "+number);
        //binary number
        while(number!=0){
            stack.push(number%2);
            number/=2;
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+"\t");
        }


    }
}
