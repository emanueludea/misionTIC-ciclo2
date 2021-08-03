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
public class Clase2Especifica extends Clase2 {

    public Clase2Especifica() {
        super("ssafdsd");
    }
    
    public Clase2Especifica(String s, int sd, double asd){
        super(s);
        
    }
    
    public void metodoA(){
        System.out.println("" + super.getA() + "....." + super.a);
    }
}
