package com.neosoft.jdbc.deleteDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDemo2 {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");

        PreparedStatement ps = con.prepareStatement("delete from employee where age=21");
        int i = ps.executeUpdate();
        if(i>0)
        {
            System.out.println("Successful deleted");
        }
        else {
            System.out.println("Failed deleted");
        }
    }
}
