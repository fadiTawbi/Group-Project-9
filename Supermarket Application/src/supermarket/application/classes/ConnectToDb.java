/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.application.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author scorp
 */
public class ConnectToDb {
       public void ConnectToDB() throws ClassNotFoundException, SQLException {
        String host = "localhost";
        String username = "root";
        String rootPassword = "";

        // Load the JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");

        // Establish a connection
        Connection connection = DriverManager
                .getConnection("jdbc:mysql://" + host + "/local_database?"
                        + "user=" + username + "&password=" + rootPassword);

        System.out.println("Database connected");

           // Prepare a statement
           Statement statement = connection.createStatement();
        
        
        String query = "Select Name From Product ";
        ResultSet result =statement.executeQuery(query);
        
        result.get
        
        
        connection.close();
        
        System.out.println("Connection to database closed");
    }
    
}
