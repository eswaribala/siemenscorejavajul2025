package com.siemens.util;

import com.github.javafaker.Faker;

public class WrapperClassDemo {
    public static void main(String[] args) {
        //primitive
        int salary=new Faker().random().nextInt(10000,1000000);
        //object -- boxing
        Integer salaryObject=salary;

        //unboxing
        int salaryValue=salaryObject;

        String data="384658436";
        int dataValue=Integer.parseInt(data);
        System.out.println("salary:"+salary);




    }
}
