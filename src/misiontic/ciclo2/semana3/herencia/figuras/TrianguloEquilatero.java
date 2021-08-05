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
public class TrianguloEquilatero extends Triangulo {

    public TrianguloEquilatero(double lado) {
        super(lado, lado, lado);
    }

    @Override
    public double calcularArea() {
        return Math.sqrt(3) * lado1 / 2;
    }

}
