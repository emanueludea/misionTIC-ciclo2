/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana1.ciclos;

/**
 * For declarando y actualizando varias cosas
 *
 * @author emanuel
 */
public class EjemploCiclos4 {

    public static void main(String[] args) {
        System.out.println("Ejemplo1");
        for (int i = 0, j = 20; i < 10; i++, j--){
            System.out.printf("i = %d, j = %d %n", i, j);
        }
        
        System.out.println("\nEjemplo2");
        for (int i = 0, j = 20; i < 10; i++, j--, System.out.printf("i = %d, j = %d %n", i, j));
    }
}
