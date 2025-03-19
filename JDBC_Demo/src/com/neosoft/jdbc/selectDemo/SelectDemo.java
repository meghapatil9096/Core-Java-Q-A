package com.neosoft.jdbc.selectDemo;

import java.sql.*;

public class SelectDemo {
    public static void main(String[] args) throws SQLException {
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");

        PreparedStatement ps = con.prepareStatement("select id, name, salary, age, gender from Employee");
        ResultSet rs = ps.executeQuery();
        while (rs.next())
        {
            int id = rs.getInt("Id");
            String name = rs.getString("Name");
            double salary = rs.getDouble("Salary");
            int age = rs.getInt("Age");
            String gender = rs.getString("Gender");

            System.out.println("Id: "+id+",  Name: "+name+",  Salary: "+salary+",  Age: "+age+",  Gender: "+gender);
        }
        System.out.println("Success");


    }
}
