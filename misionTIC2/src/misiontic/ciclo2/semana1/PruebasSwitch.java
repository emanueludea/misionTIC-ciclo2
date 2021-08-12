/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana1;

/**
 *
 * @author emanuel
 */
public class PruebasSwitch {

    static int N = 2;

    public static void main(String[] args) {
        PruebasSwitch ps = new PruebasSwitch();
        ps.saludar("Emanuel");
    }
    
    private void saludar(String nombre){
        System.out.println("Hola " + nombre);
    }
}
