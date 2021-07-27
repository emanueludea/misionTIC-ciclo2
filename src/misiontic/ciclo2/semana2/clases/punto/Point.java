/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana2.clases.punto;

/**
 *
 * @author emanuel
 */
public class Point {

    // Atributos
    private double x;
    private double y;

    //Constructores
    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Constructor copia
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    //Métodos
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double computeDistance(float x, float y) {
        double d;
        d = Math.sqrt(Math.pow(this.x - x, 2)
                + Math.pow(this.y - y, 2));
        return d;
    }

    // Sobrecarga de método
    public double computeDistance(Point p) {
        double d;
        d = Math.sqrt(Math.pow(this.x - p.x, 2)
                + Math.pow(this.y - p.y, 2));
        return d;
    }

    public Point getMid(Point b) {
        Point p = new Point();
        double x = (this.x + b.x) / 2;
        double y = (this.x + b.y) / 2;
        p.setX(x);
        p.setY(y);
        return p;
    }

    /*@Override
    public String toString() {
        return " x = " + this.x + ", y = " + this.y; //To change body of generated methods, choose Tools | Templates.
    }*/
}
