package com.siemens.dao;

import com.siemens.models.Customer;

import java.util.Arrays;
import java.util.Comparator;

public class CustomerStore {

    private Customer[] customers;

    public CustomerStore(int size){
        customers = new Customer[size];
    }

    public void addCustomer(Customer customer, int pos){
        customers[pos]=customer;

    }

    public Customer[] getCustomers(){
        return customers;
    }

    public Customer[] getAllSortedCustomers(){
        //anonymous class
        Comparator<Customer> customerComparator=new Comparator<Customer>(){
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        };
        Arrays.sort(customers,customerComparator);
        return customers;

    }

}
