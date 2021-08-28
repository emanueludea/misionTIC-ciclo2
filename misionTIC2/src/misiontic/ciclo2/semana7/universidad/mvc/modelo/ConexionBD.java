/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana7.universidad.mvc.modelo;

import misiontic.ciclo2.semana7.universidad.mvc.modelo.alumno.Alumno;
import misiontic.ciclo2.semana7.universidad.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author emanuel
 */
public class ConexionBD {

    private final String url = "jdbc:mysql://localhost/universidad";
    private final String usuarioBd = "universidad";
    private final String claveBd = "Universidad2021";

    public Connection crearConnection() throws SQLException {
        Connection connection = null;
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            // Connect to a database
            connection = DriverManager.getConnection(url, usuarioBd, claveBd);
            System.out.println("Database connected");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos");
            throw ex;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }

}
