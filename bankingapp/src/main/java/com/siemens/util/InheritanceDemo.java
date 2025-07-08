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
                .dob(LocalDate.now())
                .gender(Gender.FEMALE).build();


    }
}
