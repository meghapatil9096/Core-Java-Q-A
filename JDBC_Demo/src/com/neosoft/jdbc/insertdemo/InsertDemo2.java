package com.neosoft.jdbc.insertdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo2 {
    public static void main(String[] args) throws SQLException {
        Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");

        int id = 12;
        String name ="Pushpa";
        int salary = 14000;
        String gender = "F";
        int age = 24;
        String city = "Kolhapur";

        PreparedStatement ps = con.prepareStatement("insert into Employee (id,name,salary,gender,age,city) values (?,?,?,?,?,?)");
        ps.setInt(1,id);
        ps.setString(2,name);
        ps.setInt(3,salary);
        ps.setString(4,gender);
        ps.setInt(5,age);
        ps.setString(6,city);

        int i = ps.executeUpdate();

        if(i>0)
        {
            System.out.println("Successful insert");
        }
        else
        {
            System.out.println("failed to insert");
        }


    }
}
