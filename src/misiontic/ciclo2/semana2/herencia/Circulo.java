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
public class Circulo extends Figura{
    // Atributo
    private double radio;

    // Constructores
    public Circulo() {
    }
    
    public Circulo(double r){
        this.radio = r;
    }

    // Metodos

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
    
}