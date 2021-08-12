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
public class Matrices {
    public static void main(String[] args){
        /* 
         TIPO nombre[][]...[] = new TIPO[TAM1][TAM2]...[TAMn];
         TIPO[][]...[] nombre = new TIPO[TAM1][TAM2]...[TAMn];
         TIPO[][]...[] nombre;
         nombre = {valores iniciales}
         nombre = new TIPO[TAM1][TAM2]...[TAMn];
        */
        String matriz2[][] = new String[2][2];
        int matriz1[][] = {{1,2},{3, 4},{5, 6}}; //[3][2]
        
        System.out.println("Matriz de String");
        for(int i = 0; i < matriz2.length; i++){
            for(int j = 0; j < matriz2[i].length; j++){
                System.out.println(""+matriz2[i][j]);
            }
        }
        
        System.out.println("Matriz de números");
        for(int i = 0; i < matriz1.length; i++){
            System.out.println(""+ matriz1[i]);
            for(int j = 0; j < matriz1[i].length; j++){
                System.out.println(""+matriz1[i][j]);
            }
        }
    }
}
