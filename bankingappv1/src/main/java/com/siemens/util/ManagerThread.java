package com.siemens.util;

import com.github.javafaker.Faker;
import com.siemens.models.Customer;
import com.siemens.models.Individual;

public class ManagerThread extends Individual implements Runnable {

    @Override
    public void run() {
        Faker faker=new Faker();
        Customer customer=null;
        while(true){
             System.out.println("Manager Thread");
             try {
                 Thread.sleep(1000);
                 customer = new Customer(
                         faker.random().nextInt(100000, 1000000),
                         faker.name().firstName(),
                         faker.name().lastName(),
                         faker.name().username(),
                         faker.internet().emailAddress(),
                         faker.phoneNumber().phoneNumber(),
                         faker.internet().password(),
                         null, faker.bool().bool());
                 System.out.println(customer);

             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
    }
}
