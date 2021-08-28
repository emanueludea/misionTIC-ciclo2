/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana7.universidad.mvc;

import misiontic.ciclo2.semana7.universidad.mvc.controlador.ControladorAlumno;
import misiontic.ciclo2.semana7.universidad.mvc.modelo.alumno.Alumno;
import misiontic.ciclo2.semana7.universidad.mvc.modelo.ConexionBD;
import misiontic.ciclo2.semana7.universidad.mvc.modelo.alumno.ConsultasBdAlumno;
import misiontic.ciclo2.semana7.universidad.mvc.vista.gui.alumno.FrameAlumno;

/**
 *
 * @author emanuel
 */
public class MainGUI {
    public static void main(String[] args){
        ConsultasBdAlumno dbAlumno = new ConsultasBdAlumno();
        FrameAlumno vista = new FrameAlumno();
        ControladorAlumno controlador = new ControladorAlumno(dbAlumno, vista);
        controlador.inicializarVista();
    }
}
