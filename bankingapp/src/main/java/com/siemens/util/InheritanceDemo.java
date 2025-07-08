package com.siemens.util;

import com.github.javafaker.Faker;
import com.siemens.models.*;

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

        Corporate corporate= Corporate
                .builder()
                .firstName(faker.name().firstName())
                .lastName(faker.name().lastName())
                .middleName(faker.name().username())
                .email(faker.internet().emailAddress())
                .contactNo(faker.phoneNumber().phoneNumber())
                .password(faker.internet().password())
                .companyType(generateCompanyType())
                .build();
        System.out.println(corporate);

        //Runt time polymorphism

        //abstract class instantiation not possible
      /*
       Customer customer1 = new Customer(
                faker.name().firstName(),
                faker.name().lastName(),
                faker.name().username(),
                faker.internet().emailAddress(),
                faker.phoneNumber().phoneNumber(),
                faker.internet().password(),
                null, faker.bool().bool());

        //but anonymous object
        Customer customer = new Customer(){

            @Override
            public int generateOTP() {
                return 0;
            }
        };

*/

        //Individual individual1=customer;
        //System.out.println(individual1);



    }

    public static Gender generateGender(){
        int length=Gender.values().length;
        return Gender.values()[length-1];
    }
    public static CompanyType generateCompanyType(){
        int length=CompanyType.values().length;
        return CompanyType.values()[length-1];
    }
}
