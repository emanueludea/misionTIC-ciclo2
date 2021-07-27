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
public class Triangulo extends Figura {

    private double base;
    private double altura;

    //@Override
    public double calcularArea() {
        return this.base * this.altura / 2;
    }

    
}
