/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana3.interfaces;

import java.util.Scanner;

/**
 *
 * @author emanuel
 */
public class WhatsApp implements Mensajeria{
    
    private String pedirMensaje(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el mensaje a enviar: ");
        String mensaje = scan.nextLine();
        return mensaje;
    }
    
    @Override
    public String enviarMensaje() {
        return this.pedirMensaje() + "enviado desde WhatsApp";
    }
    
}
