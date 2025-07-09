package com.siemens;

import com.github.javafaker.Faker;
import com.siemens.facades.OTPGenerator;
import com.siemens.models.BankingAccount;
import com.siemens.models.Customer;

import java.time.ZoneId;
import java.util.Comparator;

/**
 * @author Parameswari
 * @version 1.0
 * @since 07/07/2025
 */

public class BankingApp {
    public static void main(String[] args) {

        System.out.println(args[0]+","+args[1]);
        //local variable--declared inside the method
        Faker faker=new Faker();
        for(int i=0;i<100;i++) {
            //create an object - instance
            Customer customer = new Customer(
                    faker.name().firstName(),
                    faker.name().lastName(),
                    faker.name().username(),
                    faker.internet().emailAddress(),
                    faker.phoneNumber().phoneNumber(),
                    faker.internet().password(),
                    null, faker.bool().bool());
            customer.setPassword(faker.internet().password());
            //static variable


            System.out.println(customer);
        }

        System.out.println("Rate of Interest"+Customer.getRoi());

        //create object for Transaction
        BankingAccount bankingAccount=new BankingAccount(faker.random().nextInt(100000,999999));
        BankingAccount.Transaction transaction=bankingAccount.new Transaction(faker.date().birthday().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());

        transaction.showTransactionDetails();

     // anonymous class
        OTPGenerator otpGenerator=new OTPGenerator(){
            @Override
            public int generateOTP() {
                return faker.random().nextInt(1000,9999);
            }
        };

        System.out.println(otpGenerator.generateOTP());

        Customer customer1=  new Customer(
                faker.name().firstName(),
                faker.name().lastName(),
                faker.name().username(),
                faker.internet().emailAddress(),
                faker.phoneNumber().phoneNumber(),
                faker.internet().password(),
                null, faker.bool().bool());
        Customer customer2=  new Customer(
                faker.name().firstName(),
                faker.name().lastName(),
                faker.name().username(),
                faker.internet().emailAddress(),
                faker.phoneNumber().phoneNumber(),
                faker.internet().password(),
                null, faker.bool().bool());


       //anonymous class
        Comparator<Customer> comparator=new Comparator<Customer>(){
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        };

        System.out.println(customer1.getFirstName());
        System.out.println(customer2.getFirstName());
        int result=comparator.compare(customer1,customer2);
        if(result>0){
            System.out.println("First Name is greater than the second");
        }else if(result<0){
            System.out.println("First Name is less than the second");
        }else {
            System.out.println("First Name is equal to the second");
        }


    }
}