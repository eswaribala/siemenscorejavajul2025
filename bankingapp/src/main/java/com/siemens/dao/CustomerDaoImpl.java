package com.siemens.dao;

import com.siemens.facades.CustomerDao;
import com.siemens.helpers.MySQLHelper;
import com.siemens.models.Customer;

import java.sql.*;
import java.util.ResourceBundle;

public class CustomerDaoImpl implements CustomerDao {

    private Connection connection;
    private ResourceBundle resourceBundle;

    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    private Statement statement;

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

    public int getCustomerCount() throws SQLException {
        int count=0;
        String query=resourceBundle.getString("selectallcustomers");
        statement=connection.createStatement();
        resultSet= statement.executeQuery(query);
        while(resultSet.next()){
            count++;
        }
        return count;
    }

    @Override
    public Customer[] getAllCustomers() throws SQLException {
        String query=resourceBundle.getString("selectallcustomers");
       int count=getCustomerCount();
       System.out.println("Total rows: "+count);
       Customer[] customers=new Customer[count];
       int i=0;
        statement=connection.createStatement();
        resultSet= statement.executeQuery(query);
       while(resultSet.next()){
           customers[i]=new Customer(
                   resultSet.getString("first_name"),
                   resultSet.getString("last_name"),
                   resultSet.getString("middle_name"),
                   resultSet.getString("email"),
                   resultSet.getString("password"),
                   resultSet.getString("contact_no"),
                   null,
                   resultSet.getBoolean("active")
           );
           //System.out.println(customers[i]);
           i++;
       }
       return customers;

    }
}
