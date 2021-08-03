/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana3.herencia.figuras;

import misiontic.ciclo2.semana3.interfaces.Miembros;

/**
 *
 * @author emanuel
 */
public class Cuadrado extends Rectangulo implements Comparable<Cuadrado>{
    
    public Cuadrado(){    
        super();
    }

    public Cuadrado(double lado) {
        super(lado, lado);
    }    

    @Override
    public int compareTo(Cuadrado o) {
        double thisArea = this.calcularArea();
        double oArea = o.calcularArea();
        if(thisArea < oArea){
            return -1;
        }else if(thisArea == oArea){
            return 0;
        }else{
            return 1;
        }
    }

   
}
