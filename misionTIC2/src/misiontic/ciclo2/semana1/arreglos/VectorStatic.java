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
public class VectorStatic {
    
    public static void imprimirVector(int[] v){
        for (int i = 0; i < v.length; i++) {
            System.out.print(" "+ v[i]);
        }
        System.out.println("");
    }
    
    
    public static void ordenar(int[] v){
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length -1; j++) {
                //System.out.println("j="+j);
                if(v[j] > v[j+1]){
                    int aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
            }
        }
    }
    
    
    public static void ordenarDesc(int[] v){
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length -1; j++) {
                //System.out.println("j="+j);
                if(v[j] < v[j+1]){
                    int aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
            }
        }
    }
    
    public static int[] copiar(int[] v, int inicio, int num){
        int[] nuevo = new int[num];
        for (int i = 0; i < num; i++) {
            nuevo[i] = v[i+inicio];
        }
        return nuevo;
    }
    
    /*public static void main(String[] args) {
        int[] vector = {2,9,8,7,635,12,654,45,32,2,45,65};
        // Partir el vector en 2
        int[] parte1 = copiar(vector, 0, vector.length/2);
        imprimirVector(parte1);
        int[] parte2 = copiar(vector, parte1.length, vector.length - parte1.length);
        imprimirVector(parte2);
        
        // ordenar parte 1
        ordenar(parte1);
        imprimirVector(parte1);
        // actualizar valores del vector original
        for (int i = 0; i < parte1.length; i++) {
            vector[i] = parte1[i];
        }
        // ordenar parte 2
        ordenarDesc(parte2);
        imprimirVector(parte2);
        // actualizar valores del vector original
        for (int i = 0; i < parte2.length; i++) {
            vector[i+parte1.length] = parte2[i];
        }
        imprimirVector(vector);
    }*/
}
