/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana7.universidad.mvc.modelo.alumno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import misiontic.ciclo2.semana7.universidad.mvc.modelo.ConexionBD;

/**
 *
 * @author emanuel
 */
public class ConsultasBdAlumno extends ConexionBD {

    public ArrayList<Alumno> listarAlumnos() {
        ArrayList<Alumno> lista = null;
        try {
            Connection con = this.crearConnection();
            if (con == null) {
                return null;
            }
            // Create a statement
            Statement statement = con.createStatement();
            // Execute a statement
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Alumno");
            lista = new ArrayList<>();
            // Iterate through the result and print the student names
            while (resultSet.next()) {
                Alumno alumno = new Alumno();
                alumno.setCedula(resultSet.getInt("cedula"));
                alumno.setPrimerNombre(resultSet.getString("primer_nombre"));
                alumno.setSegundoNombre(resultSet.getString("segundo_nombre"));
                alumno.setPrimerApellido(resultSet.getString("primer_apellido"));
                alumno.setSegundoApellido(resultSet.getString("segundo_apellido"));
                alumno.setEdad(resultSet.getInt("edad"));
                alumno.setSemestre(resultSet.getInt("semestre"));
                lista.add(alumno);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error listando los alumnos");
            // Logger.getLogger(misiontic.ciclo2.semana7.universidad.Alumno.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public void insertarAlumno(Alumno alumno) throws SQLException {
        Connection con = this.crearConnection();
        if (con == null) {
            return;
        }
        PreparedStatement preparedStatement = con.prepareStatement("insert into Alumno ("
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
        Connection con = this.crearConnection();
        if (con == null) {
            return;
        }
        Statement st = con.createStatement();
        String query = "UPDATE Alumno SET segundo_apellido = 'Perico' WHERE primer_nombre = 'Pedro' and primer_apellido = 'Perez'";
        st.executeUpdate(query);
    }

    public void eliminarAlumno() throws SQLException {
        Connection con = this.crearConnection();
        if (con == null) {
            return;
        }
        Statement st = con.createStatement();
        String query = "DELETE FROM Alumno WHERE primer_apellido = 'Caballo'";
        st.executeUpdate(query);
    }
}
