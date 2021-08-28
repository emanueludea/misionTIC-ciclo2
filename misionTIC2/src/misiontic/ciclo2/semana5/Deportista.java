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
        this.edad++;
    }

    public void competir() {
        if(this.lesionado == true) return;
        if(this.edad >= 42) return;
        this.cantidadCompetencias ++;
    }

    public void entrenar() {
       this.cantidadEntrenamientos++;
    }
    
    public double obtenerProbabilidadDeLesion(){
        double probabilidad = 0.0;
        if(this.cantidadEntrenamientos == 0){
            probabilidad += 0.3;
        }
        if(this.cantidadCompetencias > 3){
            probabilidad += ((cantidadCompetencias-3)*0.05);
        }
        
        probabilidad -= (this.cantidadEntrenamientos*0.03);
        if(probabilidad < 0){
            probabilidad = 0.0;
        }
        if(probabilidad > 1){
            probabilidad = 1;
        }
        return probabilidad;
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
