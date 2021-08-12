/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana1.ciclos;

import java.util.Scanner;

/**
 * Comparación entre while y do-while
 * @author emanuel
 */
public class EjemploCiclos3 {

    public static void main(String[] args) {
        String key = "1234", guess;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ciclo while");
        System.out.println("¿Cuál es la clave?");
        guess = scan.nextLine();
        while (!guess.equals(key)) { // Puede que se repita cero o más veces
            System.out.println("¿Cuál es la clave?");
            guess = scan.nextLine();
        }
        System.out.println("¡Felicitaciones, lo has logrado!");
        
        System.out.println("\nCiclo do-while");
        do{
        System.out.println("¿Cuál es la clave?");
        guess = scan.nextLine();
        }while (!guess.equals(key));
        System.out.println("¡Felicitaciones, lo has logrado!");
    }
}
