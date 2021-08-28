/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana7.universidad.mvc.controlador;

import java.util.ArrayList;
import misiontic.ciclo2.semana7.universidad.mvc.modelo.alumno.Alumno;
import misiontic.ciclo2.semana7.universidad.mvc.modelo.alumno.ConsultasAlumno;

/**
 *
 * @author emanuel
 */
public class Prueba {
    public static void main(String[] args) {
        ConsultasAlumno consultas = new ConsultasAlumno();
        /*ArrayList<Alumno> listarAlumnos = consultas.listarAlumnos();
        for (Alumno alumno : listarAlumnos) {
        System.out.println(alumno);
        }*/
        /*Alumno al = new Alumno();
        al.setCedula(8888);
        al.setPrimerNombre("Pepito");
        al.setSegundoNombre("Antonio");
        al.setPrimerApellido("Perez");
        al.setSegundoApellido("Montes");
        al.setEdad(56);
        al.setSemestre(6);
        
        consultas.ActualizarAlumno(al);*/
        consultas.EliminarAlumno(8888);
        
        Alumno alumno = consultas.buscarAlumno(8888);
        if(alumno != null){
            System.out.println(alumno);
        }else{
            System.out.println("No hay un alumno con esa cédula");
        }
    }
}
