/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana1.arreglos;

import misiontic.ciclo2.semana2.herencia.acceso.Clase1;

/**
 *
 * @author emanuel
 */
public class PruebaMatrizClase1 {
    
    int a = 20;
    
    private void nada(){
        
    }
    
    public static void main(String[] args){
        Clase1 vC1[] = {new Clase1(), new Clase1(50, "Pedro")};
        vC1[0].setCantidad(200);
        System.out.println("vC1[0] = " + vC1[0].getCantidad());
        
        Clase1 mC1[][] = new Clase1[2][3];
    }
}
