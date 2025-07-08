package com.siemens.util;

import com.github.javafaker.Faker;
import com.siemens.dao.CustomerDaoImpl;
import com.siemens.facades.CustomerDao;
import com.siemens.models.Customer;

import java.sql.SQLException;
import java.util.Scanner;

public class CustomerDBApp {
    public static void main(String[] args){
        Faker faker=new Faker();
        Scanner scanner=new Scanner(System.in);
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
       /*
          System.out.println("Enter account number to fetch customer details:");
          long accountNumber=scanner.nextLong();
          scanner.nextLine();
         System.out.println( customerDao.getCustomer(accountNumber));
*/
            System.out.println(  customerDao.updateCustomer(10193198L,
                    "Test@wipro.com","Test@12345"));

            System.out.println(customerDao.deleteCustomer(10193198L));

        }catch (ClassNotFoundException | SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}
