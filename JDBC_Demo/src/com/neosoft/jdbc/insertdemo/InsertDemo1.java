package com.neosoft.jdbc.insertdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo1 {
    public static void main(String[] args) throws SQLException {
        Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");

        int id = 12;
        String name ="Pushpa";
        int salary = 11000;
        String gender = "F";
        int age = 21;
        String city = "Nagar";
//This is bad for coding, not good practices
        PreparedStatement ps = con.prepareStatement("insert into Employee (id,name,salary,gender,age,city) values ("+id+",'"+name+"',"+salary+",'"+gender+"',"+age+",'"+city+"')");
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
