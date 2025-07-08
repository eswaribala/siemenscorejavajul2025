package com.siemens.dao;

import com.siemens.facades.CustomerDao;
import com.siemens.helpers.MySQLHelper;
import com.siemens.models.Customer;

import java.sql.Connection;
import java.sql.SQLException;

public class CustomerDaoImpl implements CustomerDao {

    private Connection connection;
    public CustomerDaoImpl() throws SQLException, ClassNotFoundException {
        connection = MySQLHelper.getConnection();
        if(connection==null){
            System.out.println("Connection not created....");
        }else {
            System.out.println("Connection created....");
        }

    }

    @Override
    public boolean saveCustomer(Customer customer) {
        return false;
    }

    @Override
    public Customer updateCustomer(long accountNumber, String email, String password) {
        return null;
    }

    @Override
    public void deleteCustomer(long accountNumber) {

    }

    @Override
    public Customer getCustomer(long accountNumber) {
        return null;
    }

    @Override
    public Customer[] getAllCustomers() {
        return new Customer[0];
    }
}
