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
public class PruebaVector {
    
    public static void main(String[] args) {
        int[] vector = {2,9,8,7,635,12,654,45,32,2,45,65};
        Vector vec = new Vector();
        int parte1[] = vec.copiar(vector, 0, vector.length/2);
        int parte2[] = vec.copiar(vector, parte1.length, vector.length - parte1.length);
        vec.ordenar(parte1);
        vec.ordenarDesc(parte2);
        vec.imprimirVector(parte2);
        // actualizar valores del vector original
        for (int i = 0; i < parte2.length; i++) {
            vector[i+parte1.length] = parte2[i];
        }
        vec.imprimirVector(vector);
    }
}
