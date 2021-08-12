/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana3.interfaces;

/**
 *
 * @author emanuel
 */
public class Persona implements Comparable<Persona>, Mensajeria {

    private int edad;
    private String nombre;
    private double estatura;

    @Override
    public int compareTo(Persona o) {
        return (this.edad > o.edad) ? 10 : (this.edad < o.edad ? -100 : 0);
        /*if(this.edad > o.edad){
            return 10;
        }else{
            if(this.edad < o.edad){
                return -100;
            }else{
                return 0;
            }
        }*/
    }

    @Override
    public String toString() {
        return "edad = " + this.edad + ", nombre = " + this.nombre + ", estatura = " + this.estatura;
    }

    @Override
    public String enviarMensaje() {
        return "Mensaje enviado por " + this.nombre;
    }

}
