/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana1.ciclos;

/**
 * Ciclos infinitos (con condiciones de parada que son siempre verdaderas)
 * @author emanuel
 */
public class EjemploCiclos2 {
    public static void main(String[] args){
        System.out.println("Ciclo while");
        int i = 0;
        while(true){ // podría ser cualquier expresión que se evalúe como verdadera (true). Por ejemplo: 4 > 3 
             if(i >= 10) // Si quitamos el break, el ciclo queda infinito
                 break;  // No está entre llaves porque es solo una instrucción
            System.out.println(i);
            i++;
        }
        
        System.out.println("\nCiclo for");
        for(int j= 0;; j++){ //La expresión de la mitad es la condición. Si no se especifica, se evalúa como true siempre
             if(j >= 10) // Si quitamos el break, el ciclo queda infinito
                 break;  
            System.out.println(j);
        }
        // System.out.println("" + j); // j no existe afuera del ciclo for
    }
}
