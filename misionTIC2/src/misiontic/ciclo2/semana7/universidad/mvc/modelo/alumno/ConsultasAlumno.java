/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana7.universidad.mvc.modelo.alumno;

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
public class ConsultasAlumno {

    public ArrayList<Alumno> listarAlumnos() {
        ArrayList<Alumno> lista = new ArrayList<>();
        try {
            ConexionBD conexion = new ConexionBD();
            conexion.conectar();

            Statement statement = conexion.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(
                    "SELECT cedula, primer_nombre, segundo_nombre, primer_apellido, "
                    + "segundo_apellido, edad, semestre FROM Alumno");

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
            conexion.cerrarConexion();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showConfirmDialog(null, "Error con la clase SQL");
            Logger.getLogger(ConsultasAlumno.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error de SQL ");
            Logger.getLogger(ConsultasAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public Alumno buscarAlumno(int cedula) {
        Alumno alumno = null;
        try {
            ConexionBD conexion = new ConexionBD();
            conexion.conectar();

            PreparedStatement statement = conexion.getConnection().prepareStatement(
                    "SELECT cedula, primer_nombre, segundo_nombre, primer_apellido, "
                    + "segundo_apellido, edad, semestre FROM Alumno WHERE cedula = ?");
            statement.setInt(1, cedula);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setCedula(rs.getInt("cedula"));
                alumno.setPrimerNombre(rs.getString("primer_nombre"));
                alumno.setSegundoNombre(rs.getString("segundo_nombre"));
                alumno.setPrimerApellido(rs.getString("primer_apellido"));
                alumno.setSegundoApellido(rs.getString("segundo_apellido"));
                alumno.setEdad(rs.getInt("edad"));
                alumno.setSemestre(rs.getInt("semestre"));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConsultasAlumno.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alumno;
    }

    public void CrearAlumno(Alumno alumno) {

        try {
            ConexionBD conexion = new ConexionBD();
            conexion.conectar();

            PreparedStatement statement = conexion.getConnection().prepareStatement(
                    "INSERT INTO Alumno (cedula, primer_nombre, segundo_nombre, primer_apellido, "
                    + "segundo_apellido, edad, semestre) VALUES (?, ?, ?, ?, ?, ?, ?)");
            statement.setInt(1, alumno.getCedula());
            statement.setString(2, alumno.getPrimerNombre());
            statement.setString(3, alumno.getSegundoNombre());
            statement.setString(4, alumno.getPrimerApellido());
            statement.setString(5, alumno.getSegundoApellido());
            statement.setInt(6, alumno.getEdad());
            statement.setInt(7, alumno.getSemestre());
            
            statement.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConsultasAlumno.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ActualizarAlumno(Alumno alumno) {
        try {
            ConexionBD conexion = new ConexionBD();
            conexion.conectar();

            PreparedStatement statement = conexion.getConnection().prepareStatement(
                    "UPDATE Alumno "
                            + "set "
                            + "cedula = ?, "
                            + "primer_nombre = ?, "
                            + "segundo_nombre = ?, "
                            + "primer_apellido = ?, "
                            + "segundo_apellido = ?, "
                            + "edad = ?, "
                            + "semestre = ? "
                            + "WHERE cedula = ? ");
            statement.setInt(1, alumno.getCedula());
            statement.setString(2, alumno.getPrimerNombre());
            statement.setString(3, alumno.getSegundoNombre());
            statement.setString(4, alumno.getPrimerApellido());
            statement.setString(5, alumno.getSegundoApellido());
            statement.setInt(6, alumno.getEdad());
            statement.setInt(7, alumno.getSemestre());
            statement.setInt(8, alumno.getCedula());
            
            statement.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConsultasAlumno.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void EliminarAlumno(int cedula) {
        try {
            ConexionBD conexion = new ConexionBD();
            conexion.conectar();

            PreparedStatement statement = conexion.getConnection().prepareStatement(
                    "DELETE FROM Alumno "
                            + "WHERE cedula = ? ");
            statement.setInt(1, cedula);
            
            statement.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConsultasAlumno.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
