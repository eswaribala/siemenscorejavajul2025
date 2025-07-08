package com.siemens.util;

import com.github.javafaker.Faker;
import com.siemens.models.Gender;
import com.siemens.models.Individual;

import java.time.LocalDate;

public class InheritanceDemo {
    public static void main(String[] args) {

        Faker faker=new Faker();
        Individual individual=Individual
                .builder()
                .firstName(faker.name().firstName())
                .lastName(faker.name().lastName())
                .middleName(faker.name().username())
                .email(faker.internet().emailAddress())
                .gender(Gender.MALE)
                .contactNo(faker.phoneNumber().phoneNumber())
                .password(faker.internet().password())
                .dob(LocalDate.now())
                .gender(Gender.FEMALE).build();

        System.out.println(individual);


    }
}
