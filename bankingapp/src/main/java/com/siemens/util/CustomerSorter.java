package com.siemens.util;

import com.github.javafaker.Faker;
import com.siemens.dao.CustomerStore;
import com.siemens.models.Customer;

public class CustomerSorter {

    public static void main(String[] args) {

        Faker faker = new Faker();
        Customer customer=null;
        int size=faker.random().nextInt(10,100);
        CustomerStore customerStore=new CustomerStore(size);
        for(int i=0;i<size;i++) {
            //create an object - instance
           customer = new Customer(
                    faker.name().firstName(),
                    faker.name().lastName(),
                    faker.name().username(),
                    faker.internet().emailAddress(),
                    faker.phoneNumber().phoneNumber(),
                    faker.internet().password(),
                    null, faker.bool().bool());

            customerStore.addCustomer(customer,i);
        }

        //print all the customers
        for(Customer c:customerStore.getAllSortedCustomers()){
            System.out.println(c);
        }

    }
}
