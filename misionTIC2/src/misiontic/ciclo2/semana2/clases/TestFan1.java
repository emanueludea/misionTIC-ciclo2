/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana2.clases;


/**
 *
 * @author emanuel
 */
public class TestFan1 {    
    
    public static void main(String[] ar){
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        
        //System.out.println("Se han creado: "+Fan.getNum());
        Fan fan2 = new Fan(Fan.MEDIUM, 5, false, "blue");
        
        //System.out.println("Se han creado: "+Fan.getNum());
        
        System.out.println("" + fan1.getSpeed()  + " " + fan1.getRadius() + " " + fan1.isOn() + " " + fan1.getColor());
        System.out.println("" + fan2.getSpeed()  + " " + fan2.getRadius() + " " + fan2.isOn() + " " + fan2.getColor());
    }
}
