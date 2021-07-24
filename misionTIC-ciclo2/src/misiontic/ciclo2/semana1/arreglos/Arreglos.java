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
public class Arreglos {
    public static void main(String[] args){
        // TIPO nombre[] = new TIPO[TAMAÑO];
        // TIPO[] nombre = new TIPO[TAMAÑO];
        int[] arreglo1 = new int[4];
        boolean arreglo2[] = new boolean[2];  
        
        // Inicializar el arreglo directamente
        float arreglo3[] = {2.5f, 8.593f, 47.87f, 65.2233f};
        
   
        for(int i = 0; i < arreglo1.length; i++)
            System.out.printf("La posicion %d del arreglo1 tiene el valor %d %n", i, arreglo1[i]);
        System.out.println("");
        
        for(int i = 0; i < arreglo2.length; i++)
            System.out.printf("La posicion %d del arreglo2 tiene el valor %b %n", i, arreglo2[i]);
        System.out.println("");
        
        for(int k = 0; k < arreglo3.length; k++)
            System.out.printf("La posicion %d del arreglo3 tiene el valor %f %n", k, arreglo3[k]);
       
    }
}
