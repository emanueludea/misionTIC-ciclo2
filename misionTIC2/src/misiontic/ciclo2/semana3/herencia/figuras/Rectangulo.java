/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana3.herencia.figuras;

import misiontic.ciclo2.semana3.interfaces.Miembros;

/**
 *
 * @author emanuel
 */
public class Rectangulo extends Figura{

    //Atributos
    private double ancho;
    private double alto;

    // Constructor
    public Rectangulo() {
    }

    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    @Override
    public double calcularPerimetro(){
        return 2 * this.alto + 2 * this.ancho;
    }
    
    @Override
    public double calcularArea(){
        return this.alto * this.ancho;
    }
    
    @Override
    public String toString(){
        return "ancho = " + this.ancho + ", alto = " + this.alto;
    }
    
   /*@Override
    public void mostrarAtributos() {
        System.out.println("mostrarAtributos");
    }

    @Override
    public void mostrarMetodos() {
        System.out.println("mostrarMetodos");
    }*/
    
    public boolean isCuadrado(){
        return alto == ancho;
    }

}
