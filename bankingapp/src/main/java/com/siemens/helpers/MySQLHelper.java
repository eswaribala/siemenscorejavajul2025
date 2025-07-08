package com.siemens.helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class MySQLHelper {

    private static ResourceBundle resourceBundle;
    private static DriverManager driverManager;


    public static Connection getConnectionUrl() throws ClassNotFoundException, SQLException {
         resourceBundle = ResourceBundle.getBundle("db");
        String url=resourceBundle.getString("url");
        String username=resourceBundle.getString("userName");
        String password=resourceBundle.getString("password");
        String driver=resourceBundle.getString("driverClassName");
        Class.forName(driver);
        return DriverManager.getConnection(url,username,password);
    }
}
