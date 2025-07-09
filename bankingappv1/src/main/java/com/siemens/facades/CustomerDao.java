package com.siemens.facades;

import com.siemens.models.Customer;

import java.util.List;


public interface CustomerDao {

    void saveCustomer(Customer customer);
    Customer updateCustomer(long accountNumber,String email, String password);
    boolean deleteCustomer(long accountNumber);
    Customer getCustomer(long accountNumber);
    List<Customer> getAllCustomers();

}
