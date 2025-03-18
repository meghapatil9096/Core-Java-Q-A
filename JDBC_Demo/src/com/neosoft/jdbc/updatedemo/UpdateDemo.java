package com.neosoft.jdbc.updatedemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDemo {
    public static void main(String[] args) throws SQLException {
/*  Create connection with DataBase
    Connection is Interface ==> its provide connection to the database
    DriverManager is Class ==> its manages database connections
    getConnection is a method
   */
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");

/*  create instances of Statement/PreparedStatement to execute sql queries
    PreparedStatement is a Interface ==> execute sql queries
    prepareStatement() is a method
     */
        PreparedStatement ps = con.prepareStatement("update employee set salary = 13000 where id = 12");

/*  execute the query & process the result   */
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
