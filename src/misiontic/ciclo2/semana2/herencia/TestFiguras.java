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
public class TestFiguras {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(2.35);
        double area = c1.calcularArea();
        System.out.println("area del circulo: " + area);
        
        Rectangulo r1 = new Rectangulo();
        System.out.println("area de este rectangulo: " + r1.calcularArea());
        
        Cuadrado cuad1 = new Cuadrado(5);
        System.out.println("area del cuadrado: " + cuad1.calcularArea());
    }
}
