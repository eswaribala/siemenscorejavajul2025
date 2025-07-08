package com.siemens.util;

import com.siemens.dao.CustomerDaoImpl;
import com.siemens.facades.CustomerDao;

import java.sql.SQLException;

public class CustomerDBApp {
    public static void main(String[] args){
        try {
            CustomerDao customerDao = new CustomerDaoImpl();

        }catch (ClassNotFoundException | SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}
