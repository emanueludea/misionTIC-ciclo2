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
import javax.swing.JOptionPane;
import misiontic.ciclo2.semana7.universidad.mvc.modelo.alumno.Alumno;
import misiontic.ciclo2.semana7.universidad.mvc.modelo.alumno.ConsultasAlumno;
import misiontic.ciclo2.semana7.universidad.mvc.vista.gui.alumno.FrameAlumno;

/**
 *
 * @author emanuel
 */
public class ControladorAlumno implements ActionListener, KeyListener {

    private ConsultasAlumno modelo;
    private FrameAlumno vista;

    public ControladorAlumno(ConsultasAlumno modelo, FrameAlumno vista) {
        this.modelo = modelo;
        this.vista = vista;

        this.vista.getPanelBotonesAlumno().getBtnBuscar().addActionListener(this);
        this.vista.getPanelBotonesAlumno().getBtnCrear().addActionListener(this);
        this.vista.getPanelBotonesAlumno().getBtnLimpiar().addActionListener(this);
        this.vista.getPanelBotonesAlumno().getBtnActualizar().addActionListener(this);
        this.vista.getPanelBotonesAlumno().getBtnEliminar().addActionListener(this);
        this.vista.getPanelBotonesAlumno().getBtnListar().addActionListener(this);

        this.vista.getPanelAlumno().getTextCedula().addKeyListener(this);
        this.vista.getPanelAlumno().getTextEdad().addKeyListener(this);
        this.vista.getPanelAlumno().getTextSemestre().addKeyListener(this);
    }

    public void mostrarGUI() {
        this.vista.setTitle("Alumno con MVC");
        this.vista.getjScrollPane1().setVisible(false);
        this.vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.vista.getPanelBotonesAlumno().getBtnBuscar()) {
            this.manejaBtnBuscar();
        } else if (e.getSource() == this.vista.getPanelBotonesAlumno().getBtnCrear()) {
            this.manejaBtnCrear();
        } else if (e.getSource() == this.vista.getPanelBotonesAlumno().getBtnActualizar()) {
            this.manejaBtnActualizar();
        } else if (e.getSource() == this.vista.getPanelBotonesAlumno().getBtnEliminar()) {
            this.manejaBtnEliminar();
        } else if (e.getSource() == this.vista.getPanelBotonesAlumno().getBtnListar()) {
            this.manejaListar();
        } else if (e.getSource() == this.vista.getPanelBotonesAlumno().getBtnLimpiar()) {
            this.manejaBtnLimpiar();
        }

    }

    private void manejaListar() {
        ArrayList<Alumno> listaAlumnos = modelo.listarAlumnos();
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }
        if(listaAlumnos.size() > 0){
            this.vista.getjScrollPane1().setVisible(true);
            this.mostrarAlumnoVista(listaAlumnos.get(0));
        }
    }

    private void manejaBtnEliminar() {
        String textCedula = this.vista.getPanelAlumno().getTextCedula().getText();
        if (textCedula.isEmpty()) {
            this.vista.getPanelAlumno().getTextCedula().setBackground(Color.red);
            return;
        }
        int cedula = Integer.parseInt(textCedula);
        this.modelo.EliminarAlumno(cedula);
        this.vista.getPanelAlumno().limpiar();

    }

    private void manejaBtnActualizar() {
        this.modelo.ActualizarAlumno(crearAlumno());
        this.vista.getPanelAlumno().limpiar();
    }

    private void manejaBtnBuscar() {
        System.out.println("Le dimos a buscar");
        String textCedula = this.vista.getPanelAlumno().getTextCedula().getText();
        if (textCedula.isEmpty()) {
            this.vista.getPanelAlumno().getTextCedula().setBackground(Color.red);
            return;
        }

        try {
            int cedula = Integer.parseInt(textCedula);
            Alumno alumno = this.modelo.buscarAlumno(cedula);
            if (alumno != null) {
                mostrarAlumnoVista(alumno);
            } else {
                JOptionPane.showConfirmDialog(vista, "No hay un alumno con esa cédula");
            }
        } catch (NumberFormatException nEx) {
            JOptionPane.showConfirmDialog(vista, "No es una cédula válida");
            return;
        }
    }

    private void manejaBtnCrear() {
        System.out.println("Quieren crear un alumno");

        this.modelo.CrearAlumno(crearAlumno());
        this.vista.getPanelAlumno().limpiar();

    }

    private void manejaBtnLimpiar() {
        this.vista.getPanelAlumno().limpiar();
    }

    private void mostrarAlumnoVista(Alumno alumno) {
        this.vista.getPanelAlumno().getTextCedula().setText("" + alumno.getCedula());
        this.vista.getPanelAlumno().getTextPrimerNombre().setText(alumno.getPrimerNombre());
        this.vista.getPanelAlumno().getTextSegundoNombre().setText(alumno.getSegundoNombre());
        this.vista.getPanelAlumno().getTextPrimerApellido().setText(alumno.getPrimerApellido());
        this.vista.getPanelAlumno().getTextSegundoApellido().setText(alumno.getSegundoApellido());
        this.vista.getPanelAlumno().getTextEdad().setText("" + alumno.getEdad());
        this.vista.getPanelAlumno().getTextSemestre().setText("" + alumno.getSemestre());
    }

    private Alumno crearAlumno() {
        Alumno alumno = new Alumno();

        String textCedula = this.vista.getPanelAlumno().getTextCedula().getText();
        int cedula = Integer.parseInt(textCedula);
        alumno.setCedula(cedula);

        alumno.setPrimerNombre(this.vista.getPanelAlumno().getTextPrimerNombre().getText());
        alumno.setSegundoNombre(this.vista.getPanelAlumno().getTextSegundoNombre().getText());

        alumno.setPrimerApellido(this.vista.getPanelAlumno().getTextPrimerApellido().getText());
        alumno.setSegundoApellido(this.vista.getPanelAlumno().getTextSegundoApellido().getText());

        String textEdad = this.vista.getPanelAlumno().getTextEdad().getText();
        int edad = Integer.parseInt(textEdad);
        alumno.setEdad(edad);

        String textSemestre = this.vista.getPanelAlumno().getTextSemestre().getText();
        int semestre = Integer.parseInt(textSemestre);
        alumno.setSemestre(semestre);
        return alumno;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("se está escribien en el campo de cedula");
        if (e.getKeyChar() > '9' || e.getKeyChar() < '0') {
            System.out.println("No es valido");
            // this.vista.getPanelAlumno().getTextCedula().setBackground(Color.red);
            e.consume();
        } else {
            // this.vista.getPanelAlumno().getTextCedula().setBackground(Color.white);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
