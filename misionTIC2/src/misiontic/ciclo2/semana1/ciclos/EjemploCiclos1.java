/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana1.ciclos;

/**
 * Comparación entre while y for básicos
 * @author emanuel
 */
public class EjemploCiclos1 {

    public static void main(String[] args) {
        
        System.out.println("Ciclos while");
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i = i + 1;
        }

        System.out.println("Ciclos for");
        for (int j = 0; j< 10; j++){
            System.out.println(j);
        }

        System.out.println("Otro ciclo for");
        for (int j = 0; j< 10; System.out.println(j++)){
        }
    }
}
