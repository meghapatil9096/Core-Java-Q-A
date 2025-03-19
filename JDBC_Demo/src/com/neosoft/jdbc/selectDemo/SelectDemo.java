package com.neosoft.jdbc.selectDemo;

import java.sql.*;

public class SelectDemo {
    public static void main(String[] args) throws SQLException {
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");

        PreparedStatement ps = con.prepareStatement("select * from Employee");
        ResultSet i = ps.executeQuery();

        System.out.println("Success");

    }
}
