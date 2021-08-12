/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2;

import misiontic.ciclo2.semana3.herencia.figuras.Circulo;
import misiontic.ciclo2.semana3.herencia.figuras.Rectangulo;

/**
 *
 * @author emanuel
 */
public class MisionTICCiclo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo rectangulo1 = new Rectangulo();
        System.out.println("Rectángulo 1");
        System.out.println("área: " + rectangulo1.calcularArea()+ ", height = " + rectangulo1.getAlto());
        rectangulo1.setAlto(2.54);
        rectangulo1.setAncho(2);
        System.out.println("área: " + rectangulo1.calcularArea()+ ", height = " + rectangulo1.getAlto());
        
        
        Rectangulo rectangulo2 = new Rectangulo(2, 3);
        System.out.println("\nRectángulo 2");
        System.out.printf("Area: %f, perímetro: %f %n", rectangulo2.calcularArea());
        
        //Circulo c1 = new Circulo(5.25);
        //System.out.printf("Area: %f, perímetro: %f %n", c1.computeArea(), c1.computePerimeter());
        
    }
    
}

    
/*class Circle {

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
}*/
