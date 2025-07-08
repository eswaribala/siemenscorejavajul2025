package com.siemens.util;

import com.github.javafaker.Faker;
import com.siemens.models.Gender;
import com.siemens.models.Individual;

import java.time.LocalDate;
import java.time.ZoneId;

public class InheritanceDemo {
    public static void main(String[] args) {

        Faker faker=new Faker();
        Individual individual=Individual
                .builder()
                .firstName(faker.name().firstName())
                .lastName(faker.name().lastName())
                .middleName(faker.name().username())
                .email(faker.internet().emailAddress())
                .contactNo(faker.phoneNumber().phoneNumber())
                .password(faker.internet().password())
                .dob(faker.date().birthday(10,70).toInstant().atZone(ZoneId.systemDefault()).toLocalDate())
                .gender(generateGender()).build();
        System.out.println(individual);

    }

    public static Gender generateGender(){
        int length=Gender.values().length;
        return Gender.values()[length-1];
    }
}
