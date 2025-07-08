package com.siemens.util;

import com.github.javafaker.Faker;
import com.siemens.dao.CustomerDaoImpl;
import com.siemens.facades.CustomerDao;
import com.siemens.models.Customer;

import java.sql.SQLException;

public class CustomerDBApp {
    public static void main(String[] args){
        Faker faker=new Faker();
        try {
            CustomerDao customerDao = new CustomerDaoImpl();
            //insert operation
            Customer customer = new Customer(
                    faker.name().firstName(),
                    faker.name().lastName(),
                    faker.name().username(),
                    faker.internet().emailAddress(),
                    faker.phoneNumber().phoneNumber(),
                    faker.internet().password(),
                    null, faker.bool().bool());
          if(customerDao.saveCustomer(customer))
              System.out.println("Customer saved successfully");
          else
              System.out.println("Customer not saved");
          for(Customer c : customerDao.getAllCustomers())
              System.out.println(c);


        }catch (ClassNotFoundException | SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}
