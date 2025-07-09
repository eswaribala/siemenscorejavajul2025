package com.siemens.dao;

import com.siemens.facades.CustomerDao;
import com.siemens.models.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

    private List<Customer> customers;

    public CustomerDaoImpl() {
        this.customers = new ArrayList<Customer>();
    }

    @Override
    public void saveCustomer(Customer customer) {
        this.customers.add(customer);

    }

    @Override
    public Customer updateCustomer(long accountNumber, String email, String password) {
        Customer customer = getCustomer(accountNumber);
        customer.setPassword(password);
        customer.setEmail(email);
        return customer;
    }

    @Override
    public boolean deleteCustomer(long accountNumber) {
        Customer customer = getCustomer(accountNumber);
        return customers.remove(customer);
    }

    @Override
    public Customer getCustomer(long accountNumber) {
        return customers.stream()
                .filter(c->c.getAccountNumber()==accountNumber)
                .findFirst().orElse(null);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customers;
    }
}
