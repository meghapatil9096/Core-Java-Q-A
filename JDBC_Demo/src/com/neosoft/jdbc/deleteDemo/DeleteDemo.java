package com.neosoft.jdbc.deleteDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDemo {
    public static void main(String[] args) throws SQLException {
/*  Create connection with DataBase   */
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");

/*  create instances of Statement/PreparedStatement to execute sql queries */
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
