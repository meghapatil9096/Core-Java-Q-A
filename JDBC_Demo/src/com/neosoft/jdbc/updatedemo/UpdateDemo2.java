package com.neosoft.jdbc.updatedemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDemo2 {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");

        PreparedStatement ps = con.prepareStatement("update employee set id = 2 where age = 24");
        int i = ps.executeUpdate();
        if(i>0)
        {
            System.out.println("Successful Updated");
        }
        else {
            System.out.println("Failed Updated");
        }
    }
}
