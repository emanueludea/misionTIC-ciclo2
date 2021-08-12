/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana1.arreglos;

/**
 *
 * @author emanuel
 */
public class PruebaVectorStatic {
    
    public static void main(String[] args) {
        int[] vector = {2,9,8,7,635,12,654,45,32,2,45,65};
        // Partir el vector en 2
        int[] parte1;
        parte1 = VectorStatic.copiar(vector, 0, vector.length/2);
        VectorStatic.imprimirVector(parte1);
        int[] parte2 = VectorStatic.copiar(vector, parte1.length, vector.length - parte1.length);
        VectorStatic.imprimirVector(parte2);
        
        // ordenar parte 1
        VectorStatic.ordenar(parte1);
        VectorStatic.imprimirVector(parte1);
        // actualizar valores del vector original
        for (int i = 0; i < parte1.length; i++) {
            vector[i] = parte1[i];
        }
        // ordenar parte 2
        VectorStatic.ordenarDesc(parte2);
        VectorStatic.imprimirVector(parte2);
        // actualizar valores del vector original
        for (int i = 0; i < parte2.length; i++) {
            vector[i+parte1.length] = parte2[i];
        }
        VectorStatic.imprimirVector(vector);
    }
}
