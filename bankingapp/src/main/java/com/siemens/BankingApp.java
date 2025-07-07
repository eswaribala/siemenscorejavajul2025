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
        Customer customer=new Customer();
        Faker faker=new Faker();
        customer.setAccountNumber(faker.number().numberBetween(10000,1000000));
        customer.setFirstName(faker.name().firstName());
        customer.setLastName(faker.name().lastName());
        customer.setMiddleName(faker.name().username());
        customer.setEmail(faker.internet().emailAddress());
        customer.setContactNo(faker.phoneNumber().phoneNumber());
        customer.setPassword(faker.internet().password());
        customer.setActive(faker.bool().bool());

        System.out.println(customer);


    }
}