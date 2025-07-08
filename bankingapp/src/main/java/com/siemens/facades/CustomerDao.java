package com.siemens.facades;

import com.siemens.models.Customer;

import java.sql.SQLException;

public interface CustomerDao {

    boolean saveCustomer(Customer customer) throws SQLException;
    Customer updateCustomer(long accountNumber,String email, String password) throws SQLException;
    boolean deleteCustomer(long accountNumber) throws SQLException;
    Customer getCustomer(long accountNumber) throws SQLException;
    Customer[] getAllCustomers() throws SQLException;

}
