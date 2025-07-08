package com.siemens.dao;

import com.siemens.facades.CustomerDao;
import com.siemens.models.Customer;

public class CustomerDaoImpl implements CustomerDao {

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
