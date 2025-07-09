package com.siemens;

import com.github.javafaker.Faker;
import com.siemens.exceptions.AgeException;
import com.siemens.exceptions.FirstNameException;
import com.siemens.exceptions.LastNameException;
import com.siemens.models.Gender;
import com.siemens.models.Individual;

import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {

        Faker faker=new Faker();
        Individual individual=Individual.builder()

                .middleName(faker.name().username())
                .email(faker.internet().emailAddress())
                .contactNo(faker.phoneNumber().phoneNumber())
                .password(faker.internet().password())

                .gender(generateGender()).build();
        try {
            individual.setDob(faker.date().birthday(10, 15).toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            individual.setFirstName(faker.name().firstName());
            individual.setLastName(faker.name().lastName());
        }catch (FirstNameException| LastNameException| AgeException e){
            System.out.println(e.getMessage());
        }
        System.out.println(individual);

    }
    public static Gender generateGender(){
        int length=Gender.values().length;
        return Gender.values()[length-1];
    }

}