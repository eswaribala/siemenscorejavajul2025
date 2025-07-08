package com.siemens.facades;

import com.siemens.models.Customer;

public interface CustomerDao {

    boolean saveCustomer(Customer customer);
    Customer updateCustomer(long accountNumber,String email, String password);
    void deleteCustomer(long accountNumber);
    Customer getCustomer(long accountNumber);
    Customer[] getAllCustomers();

}
