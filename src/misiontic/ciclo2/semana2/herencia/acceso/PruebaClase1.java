/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana2.herencia.acceso;

/**
 *
 * @author emanuel
 */
public class PruebaClase1 {

    public static void main(String[] args) {
        //Accedemos al atributo estatico
        System.out.println("" + Clase1.numStatic);
        
        //Queremos acceder a un método que no es estático
        Clase1 c1 = new Clase1();
        //System.out.println("" + c1.getCantidad());
        System.out.println("" + Clase1.numStatic);
        System.out.println("" + c1.numStatic);
        Clase1 c2 = new Clase1();
        System.out.println("Clase1.numStatic: " + Clase1.numStatic);
        System.out.println("c2.numStatic: " + c2.numStatic);
        
        
        Clase1 c3 = new Clase1(56, "Emanuel");
        System.out.println("c3.numStatic: "  + c3.numStatic);
        System.out.println("c3: "+ c3.getCantidad() + c3.getNombre());
        System.out.println("c2: "+ c2.getCantidad() + c2.getNombre());
    }
}
