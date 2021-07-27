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
public class Cuadrado extends Rectangulo {
    
    public Cuadrado(){       
    }

    public Cuadrado(double lado) {
        this.setAlto(lado);
        this.setAncho(lado);
    }
    
}
