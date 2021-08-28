/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana7.excepciones;

/**
 *
 * @author emanuel
 */
public class EjemplosExcepciones {

    public static void main(String[] args) {
        String a = "12";
        int b;
        try {
            b = Integer.parseInt(a);
            System.out.println(a + "--" + b);
            // cerrar
        } catch (NumberFormatException nEx) {
            System.out.println("No se pudo convertir " + a + " a número");
        } catch (Exception e) {
            System.out.println("Se presentó una excepcion desconocida");
        } finally {
            System.out.println("terminamos!");
        }
    }
}
