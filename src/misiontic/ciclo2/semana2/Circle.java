/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana2;

/**
 *
 * @author emanuel
 */
public class Circle {
    // Atributo
    private double r;

    // Constructores
    public Circle() {
    }
    
    public Circle(double radio){
        this.r = radio;
    }

    // Metodos
    public double computeArea() {
        return Math.PI * this.r * this.r;
    }

    public double computePerimeter() {
        return 2 * Math.PI * this.r;
    }
}
