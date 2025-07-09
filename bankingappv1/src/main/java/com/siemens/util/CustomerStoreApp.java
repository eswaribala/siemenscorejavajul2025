package com.siemens.util;

import com.github.javafaker.Faker;
import com.siemens.dao.CustomerDaoImpl;
import com.siemens.facades.CustomerDao;
import com.siemens.models.Customer;

import java.util.Iterator;

public class CustomerStoreApp {
    public static void main(String[] args){

        Faker faker = new Faker();
        Customer customer=null;
        int size=faker.random().nextInt(10,100);
        CustomerDao customerDao = new CustomerDaoImpl();
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
          customerDao.saveCustomer(customer);
        }

        //read customer details
        Iterator<Customer> itr=customerDao.getSortedCustomers().iterator();
        while(itr.hasNext()){
            Customer c=itr.next();
            System.out.println(c.toString());
        }



    }
}
