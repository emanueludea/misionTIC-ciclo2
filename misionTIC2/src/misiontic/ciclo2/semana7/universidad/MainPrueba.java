/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana7.universidad;

import java.sql.SQLException;

/**
 *
 * @author emanuel
 */
public class MainPrueba {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        PruebaUniversidad prueba = new PruebaUniversidad();
        prueba.crearConnection();
        prueba.listarAlumnos();
        System.out.println("***********Listar*************");
        
        prueba.eliminarAlumno();
        prueba.listarAlumnos();
        System.out.println("***********Eliminar*************");
        
        //prueba.insertarAlumno();
        prueba.listarAlumnos();
        System.out.println("************Insertar************");
        
        prueba.actualizarAlumno();
        prueba.listarAlumnos();
        System.out.println("************Actualizar************");
        prueba.cerrarConnection();
    }
}
