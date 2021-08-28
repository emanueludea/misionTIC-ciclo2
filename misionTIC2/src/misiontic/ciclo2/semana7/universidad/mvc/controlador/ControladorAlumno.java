/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana7.universidad.mvc.controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import misiontic.ciclo2.semana7.universidad.mvc.modelo.alumno.Alumno;
import misiontic.ciclo2.semana7.universidad.mvc.modelo.alumno.ConsultasBdAlumno;
import misiontic.ciclo2.semana7.universidad.mvc.vista.gui.PanelBotones;
import misiontic.ciclo2.semana7.universidad.mvc.vista.gui.alumno.FrameAlumno;
import misiontic.ciclo2.semana7.universidad.mvc.vista.gui.alumno.PanelAlumno;

/**
 *
 * @author emanuel
 */
public class ControladorAlumno implements ActionListener, KeyListener {

    // modelo;
    ConsultasBdAlumno alumno;
    FrameAlumno vista;

    public ControladorAlumno(ConsultasBdAlumno alumno, FrameAlumno vista) {
        this.alumno = alumno;
        this.vista = vista;

        this.vista.panelBotones.getBtnListar().addActionListener(this);
        this.vista.panelBotones.getBtnCrear().addActionListener(this);
        this.vista.panelBotones.getBtnActualizar().addActionListener(this);
        this.vista.panelBotones.getBtnEliminar().addActionListener(this);
        
        this.vista.panelAlumno.getTextCedula().addKeyListener(this);
    }

    public void inicializarVista() {
        this.vista.setTitle("Gestión de alumnos");
        this.vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        PanelBotones pb = this.vista.panelBotones;
        if (e.getSource() == pb.getBtnListar()) {
            this.listarAlumnos();
        } else if (e.getSource() == pb.getBtnCrear()) {
            System.out.println("Quiero crear");
        } else if (e.getSource() == pb.getBtnActualizar()) {
            System.out.println("Quiero actualizar");
        } else if (e.getSource() == pb.getBtnEliminar()) {
            System.out.println("Quiero eliminar");
        }        
    }
    
    private void listarAlumnos() {
        System.out.println("Quiero listar");
        ArrayList<Alumno> listaAlumnos = this.alumno.listarAlumnos();
        if (listaAlumnos == null) {
            return;
        }
        for (Alumno al : listaAlumnos) {
            System.out.println(al);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {        
        PanelAlumno pa = this.vista.panelAlumno;
        if(e.getSource() == pa.getTextCedula()){
            if(e.getKeyChar()< '0' || e.getKeyChar() > '9' || pa.getTextCedula().getText().length() >= 3){
                pa.getTextCedula().setBackground(Color.red);
                e.consume();
            }else{
                pa.getTextCedula().setBackground(Color.WHITE);
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

}
