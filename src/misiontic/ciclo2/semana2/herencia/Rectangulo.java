/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana2.herencia;

/**
 *
 * @author emanuel
 */
public class Rectangulo extends Figura {

    //Atributos
    private double ancho;
    private double alto;

    // Constructor
    public Rectangulo() {
        this.alto = 1;
        this.ancho = 2;
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
    public double calcularArea() {
        return this.alto * this.ancho;
    }

    public double calcularPerimetro() {
        return 2 * this.alto + 2 * this.ancho;
    }
}
