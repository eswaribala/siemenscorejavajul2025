package com.siemens;

import com.github.javafaker.Faker;
import com.siemens.models.Customer;

/**
 * @author Parameswari
 * @version 1.0
 * @since 07/07/2025
 */

public class BankingApp {
    public static void main(String[] args) {

        //System.out.println(args[0]+","+args[1]);
        //local variable--declared inside the method
        Faker faker=new Faker();
        Customer customer=new Customer(faker.number().numberBetween(10000,10000),
                faker.name().firstName(),
                faker.name().lastName(),
                faker.name().username(),
                faker.internet().emailAddress(),
                faker.phoneNumber().phoneNumber(),
                faker.internet().password(),
                null,faker.bool().bool());
        System.out.println(customer);


    }
}