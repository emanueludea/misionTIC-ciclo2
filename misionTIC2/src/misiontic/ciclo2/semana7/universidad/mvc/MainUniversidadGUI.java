/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana7.universidad.mvc;

import misiontic.ciclo2.semana7.universidad.mvc.controlador.ControladorAlumno;
import misiontic.ciclo2.semana7.universidad.mvc.modelo.alumno.ConsultasAlumno;
import misiontic.ciclo2.semana7.universidad.mvc.vista.gui.alumno.FrameAlumno;

/**
 *
 * @author emanuel
 */
public class MainUniversidadGUI {
    public static void main(String[] args) {
        FrameAlumno vista = new FrameAlumno();
        ConsultasAlumno modelo = new ConsultasAlumno();
        ControladorAlumno controlador = new ControladorAlumno(modelo, vista);
        controlador.mostrarGUI();
    }
}
