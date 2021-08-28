/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana7.universidad.mvc.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author emanuel
 */
public class ConexionBD {
    private final String URL = "jdbc:mysql://localhost/universidad";
    private final String USUARIO = "universidad";
    private final String CLAVE = "Universidad2021";
    
    Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void conectar() throws ClassNotFoundException, SQLException {        
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(URL, USUARIO, CLAVE);
    }
    
    public void cerrarConexion() throws SQLException{
        this.connection.close();
    }
}
