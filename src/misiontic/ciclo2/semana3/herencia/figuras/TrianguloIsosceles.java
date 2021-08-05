/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana3.herencia.figuras;

/**
 *
 * @author emanuel
 */
public class TrianguloIsosceles extends Triangulo {

    public TrianguloIsosceles(double ladoIgual, double ladoDiferente) {
        super(ladoIgual, ladoIgual, ladoDiferente);
    }


    @Override
    public double calcularArea() {
        double altura = Math.sqrt(Math.pow(lado1, 2) - Math.pow(lado3 / 2, 2));
        return lado3 * altura / 2;
    }
}
