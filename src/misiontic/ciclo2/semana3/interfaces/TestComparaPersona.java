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
public class TestComparaPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        System.out.println("" + p1.compareTo(p2));
        System.out.println(""+ p1);
        System.out.println(p1.enviarMensaje());
        
        WhatsApp wa = new WhatsApp();
        String msg = wa.enviarMensaje() + ".....";
        System.out.println(msg);
        //String v = (1 > 3) ? "Verdad": "Mentira";
        /*if(4>3){
            v = "Verdad";
        }else{
            v = "Mentira";
        }*/
        //System.out.println(""+ v);
    }
}
