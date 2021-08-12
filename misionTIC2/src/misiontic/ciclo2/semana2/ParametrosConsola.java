/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana2;

import java.util.Scanner;

/**
 *
 * @author emanuel
 */
public class ParametrosConsola {
    public static void main(String[] args){
        for (String arg : args) {
            System.out.println("arg = " + arg);
        }
        
        TestStatic.saludar(TestStatic.pedirNombre());
    }
}

class TestStatic{
    public static void saludar(String nombre){
        System.out.println("¡Hola, "+ nombre + "!");
    }
    
    public static String pedirNombre(){
        Scanner scan  = new Scanner(System.in);
        System.out.println("¿Cuál es "+
                " tu nombre ? ");
        return scan.nextLine();
    }
}
