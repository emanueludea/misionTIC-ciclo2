/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2;

import misiontic.ciclo2.semana2.Circle;
import misiontic.ciclo2.semana2.Rectangle;

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
        Rectangle rectangulo1 = new Rectangle();
        System.out.println("Rectángulo 1");
        System.out.println("área: " + rectangulo1.computeArea() + ", height = " + rectangulo1.getHeight());
        rectangulo1.setHeight(2.54);
        rectangulo1.setWidth(2);
        System.out.println("área: " + rectangulo1.computeArea() + ", height = " + rectangulo1.getHeight());
        
        
        Rectangle rectangulo2 = new Rectangle(2, 3);
        System.out.println("\nRectángulo 2");
        System.out.printf("Area: %f, perímetro: %f %n", rectangulo2.computeArea(), rectangulo2.computePerimeter());
        
        //Circle c1 = new Circle(5.25);
        //ystem.out.printf("Area: %f, perímetro: %f %n", c1.computeArea(), c1.computePerimeter());
        
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
