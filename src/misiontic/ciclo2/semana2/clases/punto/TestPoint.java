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
public class TestPoint {

    public static void main(String[] args) {
        Point p1 = new Point();
        Point a = new Point(2, 3);
        Point b = new Point(-3, 1),
                c = new Point(-1.5, -2.5);
        System.out.println(p1);
        System.out.println("Distancia entre a  y b: "+ a.computeDistance(b));
        System.out.println("Distancia entre c  y origen: "+ c.computeDistance(0, 0));
    }
}
