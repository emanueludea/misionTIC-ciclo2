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
public class Rectangle extends FiguraGeometrica{

    //Atributos
    private double height;
    private double width;

    // Constructor
    public Rectangle() {
    }
    
    public Rectangle(double alto, double ancho) {
        this.height = alto;
        this.width = ancho;
        //Circle c1 = new Circle(this.height);
        //System.out.printf("Circulo Area: %f, perímetro: %f %n", c1.computeArea(), c1.computePerimeter());
    }
    
    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    public void setHeight(double alto) {
        this.height = alto;
    }

    public void setWidth(double ancho) {
        this.width = ancho;
    }

    public double computeArea() {
        return this.height * this.width;
    }

    public double computePerimeter() {
        return 2 * this.height + 2 * this.width;
    }
}
