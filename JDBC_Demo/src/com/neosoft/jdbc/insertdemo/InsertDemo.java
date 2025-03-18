package com.neosoft.jdbc.insertdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo {
    public static void main(String[] args) throws SQLException {
        Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");

        PreparedStatement ps = con.prepareStatement("delete from employee order by id limit 1");
        int i = ps.executeUpdate();

        if(i>0)
        {
            System.out.println("Successful delete");
        }
        else
        {
            System.out.println("failed to delete");
        }


    }
}
