/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana5;

/**
 *
 * @author emanuel
 */
public class Deportista {

    private String nombre;
    private boolean lesionado;
    private int edad;
    private int cantidadCompetencias;
    private int cantidadDescansos;
    private int cantidadEntrenamientos;

    public Deportista(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos adicionales
    public void cumplirAnios() {

    }

    public void competir() {
        if (lesionado) {
            return;
        }
        //if (!lesionado) {
        cantidadCompetencias += 1;
        double propabilidadDeLesion = 0.0;
        if (cantidadEntrenamientos == 0) {
            propabilidadDeLesion += 0.3;
        }
        if (cantidadCompetencias > 3) {
            propabilidadDeLesion += 0.05 * (cantidadCompetencias - 3);
        }

        if (propabilidadDeLesion > 0.7) {
            propabilidadDeLesion = 0.7;
        }
        //}
    }

    public void entrenar() {
       this.cantidadEntrenamientos++;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCantidadCompetencias() {
        return cantidadCompetencias;
    }

    public void setCantidadCompetencias(int cantidadCompetencias) {
        this.cantidadCompetencias = cantidadCompetencias;
    }

    public int getCantidadDescansos() {
        return cantidadDescansos;
    }

    public void setCantidadDescansos(int cantidadDescansos) {
        this.cantidadDescansos = cantidadDescansos;
    }

    public int getCantidadEntrenamientos() {
        return cantidadEntrenamientos;
    }

    public void setCantidadEntrenamientos(int cantidadEntrenamientos) {
        this.cantidadEntrenamientos = cantidadEntrenamientos;
    }
}
