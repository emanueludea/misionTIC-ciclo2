/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana1.condicionales;

import java.util.Scanner;

/**
 *
 * @author emanuel
 */
public class EjemploCondicionales {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        String nombre;

        System.out.print("¿En que ciclo vas?: ");
        byte num = lector.nextByte();

        System.out.println("Con if-else if- else");
        if (num == 1 || num == 2) {
            System.out.println("Estas empezando");
        } else if (num == 3 || num == 4) {
            System.out.println("Vas adelante");
        } else if (num == 5) {
            System.out.println("Sos un duro");
        } else {
            System.out.println("Sos un un mentiroso");
        }

        System.out.println("Con switch");
        switch (num) {
            case 1:
            case 2:
                System.out.println("Estas empezando");
                break;
            case 3:
            case 4:
                System.out.println("Vas adelante");
                break;
            case 5:
                System.out.println("Sos un duro");
                break;
            default:
                System.out.println("Sos un un mentiroso");
        }
    }

}
