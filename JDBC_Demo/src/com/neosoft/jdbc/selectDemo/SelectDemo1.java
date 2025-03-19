package com.neosoft.jdbc.selectDemo;

import java.sql.*;

public class SelectDemo1 {
    public static void main(String[] args) throws SQLException {
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
       String query = "select Id, Name, Salary from Employee where age > 20 ";

       Statement st = con.createStatement();
       ResultSet rs = st.executeQuery(query);

       while (rs.next())
       {
           int id = rs.getInt("Id");
           String name = rs.getString("Name");
           double salary = rs.getDouble("Salary");

           System.out.println("Id : "+id+", Name : "+name+", Salary : "+salary);
       }

       rs.close();
       st.close();
       con.close();
        System.out.println("success");

    }
}
