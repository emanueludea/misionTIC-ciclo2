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
public class Clase1 {
    // Atributos
    private int cantidad;
    private String nombre;
    
    public static int numStatic;
    
    // Constructores
    public Clase1(){
        numStatic ++;
    }

    public Clase1(int cantidad, String nombre) {
        this.cantidad = cantidad;
        this.nombre = nombre;
        numStatic ++;
    }
    
    
    // metodos

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
