package com.neosoft.jdbc.selectDemo;

import java.sql.*;

public class SelectDemo3 {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("Select id, name, salary from Employee where city='Pune'");
        while (rs.next())
        {
            int id = rs.getInt("Id");
            String name = rs.getString("Name");
            double salary = rs.getDouble("Salary");

            System.out.println("Id: "+id+" Name: "+name+", Salary: "+salary);
        }
    }
}
