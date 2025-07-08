package com.siemens.dao;

import com.siemens.facades.CustomerDao;
import com.siemens.helpers.MySQLHelper;
import com.siemens.models.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class CustomerDaoImpl implements CustomerDao {

    private Connection connection;
    private ResourceBundle resourceBundle;

    private PreparedStatement preparedStatement;

    public CustomerDaoImpl() throws SQLException, ClassNotFoundException {
        connection = MySQLHelper.getConnection();
        resourceBundle = ResourceBundle.getBundle("db");
        if(connection==null){
            System.out.println("Connection not created....");
        }else {
            System.out.println("Connection created....");
        }

    }

    @Override
    public boolean saveCustomer(Customer customer) throws SQLException {
        String query=resourceBundle.getString("addcustomer");

        preparedStatement=connection.prepareStatement(query);
        preparedStatement.setLong(1,customer.getAccountNumber());
        preparedStatement.setString(2,customer.getFirstName());
        preparedStatement.setString(3,customer.getLastName());
        preparedStatement.setString(4,customer.getMiddleName());
        preparedStatement.setString(5,customer.getEmail());
        preparedStatement.setString(6,customer.getPassword());
        preparedStatement.setString(7,customer.getContactNo());
        preparedStatement.setBoolean(8,customer.isActive());

        int rows=  preparedStatement.executeUpdate();
        return rows > 0;
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
