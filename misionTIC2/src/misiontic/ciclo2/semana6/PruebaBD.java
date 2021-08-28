/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author emanuel
 */
public class PruebaBD {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // Load the JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");
        // Connect to a database
        //Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/sakila", "misiontic", "misionTIC2021");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/universidad", "misiontic", "misionTIC2021");
        System.out.println("Database connected");
        // Create a statement
        Statement statement = connection.createStatement();
        // Execute a statement
        ResultSet resultSet = statement.executeQuery("SELECT primer_nombre, segundo_nombre, primer_apellido FROM Alumno");
        // Iterate through the result and print the student names
        while (resultSet.next()) {
            System.out.println(resultSet.getString(1) + "\t"
                    + resultSet.getString(2) + "\t" + resultSet.getString(3));
        }
        // Close the connection
        connection.close();
    }
}
