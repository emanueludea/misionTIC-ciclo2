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
public class Vector {

    public void imprimirVector(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(" " + v[i]);
        }
        System.out.println("");
    }

    public void ordenar(int[] v) {
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length - 1; j++) {
                //System.out.println("j="+j);
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
    }

    public void ordenarDesc(int[] v) {
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length - 1; j++) {
                //System.out.println("j="+j);
                if (v[j] < v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
    }

    public int[] copiar(int[] v, int inicio, int num) {
        int[] nuevo = new int[num];
        for (int i = 0; i < num; i++) {
            nuevo[i] = v[i + inicio];
        }
        return nuevo;
    }

}
