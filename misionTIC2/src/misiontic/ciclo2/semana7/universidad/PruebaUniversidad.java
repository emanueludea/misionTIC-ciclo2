/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana7.universidad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emanuel
 */
public class PruebaUniversidad {

    Connection connection;

    public void crearConnection() {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            // Connect to a database
            connection = DriverManager.getConnection("jdbc:mysql://localhost/universidad", "universidad", "Universidad2021");
            System.out.println("Database connected");
        } catch (SQLException ex) {
            Logger.getLogger(PruebaUniversidad.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PruebaUniversidad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cerrarConnection() {
        try {
            // Close the connection
            this.connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(PruebaUniversidad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void listarAlumnos() throws SQLException {
        // Create a statement
        Statement statement = this.connection.createStatement();
        // Execute a statement
        ResultSet resultSet = statement.executeQuery("SELECT * FROM Alumno");
        // Iterate through the result and print the student names
        while (resultSet.next()) {
            System.out.println(resultSet.getString(1) + "\t"
                    + resultSet.getString(2) + "\t" + resultSet.getString(3) + "\t"
                    + resultSet.getString(4) + "\t" + resultSet.getString(5) + "\t"
                    + resultSet.getString(6) + "\t" + resultSet.getString(7));
        }
    }

    public void insertarAlumno(Alumno alumno) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("insert into Alumno ("
                + "primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, cedula, edad, semestre) "
                + "values (?, ?, ?, ?, ?, ?, ?)");
        preparedStatement.setString(1, alumno.getPrimerNombre());
        preparedStatement.setString(2, alumno.getSegundoNombre());
        preparedStatement.setString(3, alumno.getPrimerApellido());
        preparedStatement.setString(4, alumno.getSegundoApellido());
        preparedStatement.setInt(5, alumno.getCedula());
        preparedStatement.setInt(6, alumno.getEdad());
        preparedStatement.setInt(7, alumno.getSemestre());

        preparedStatement.execute();
    }

    public void actualizarAlumno() throws SQLException {
        Statement st = connection.createStatement();
        String query = "UPDATE Alumno SET segundo_apellido = 'Perico' WHERE primer_nombre = 'Pedro' and primer_apellido = 'Perez'";
        st.executeUpdate(query);
    }

    public void eliminarAlumno() throws SQLException {
        Statement st = connection.createStatement();
        String query = "DELETE FROM Alumno WHERE primer_apellido = 'Caballo'";
        st.executeUpdate(query);
    }
}
