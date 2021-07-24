package misiontic.ciclo2.semana1;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emanuel
 */
public class Entradas {
    public  static void main(String[] parametros){
        // https://www.javatpoint.com/Scanner-class
        Scanner scan = new Scanner(System.in);
        float nota;
        byte b;
        int edad;
        String nombre;
        System.out.print("Ingrese la nota: ");
        nota = scan.nextFloat();
        System.out.print("Ingresa tu edad: ");
        edad = scan.nextInt();
        scan.nextLine(); // Para limpiar lo que haya quedado en el buffer de entrada
        System.out.print("Ingrese su nombre: ");
        nombre = scan.nextLine();
        
        System.out.print("nombre: " + nombre);
        System.out.print(", edad: " + edad);
        System.out.println(", Nota: " + nota);
    }
}
