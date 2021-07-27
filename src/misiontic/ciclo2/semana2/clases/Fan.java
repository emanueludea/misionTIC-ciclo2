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
public class Fan {
    
    // Atributos de clase
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    
    // Atributos de instancia
    private int speed;
    private boolean on;
    private float radius;
    private String color;
    //private static int num; //static private int num;
    
    // Constructores
    Fan(){
        speed = SLOW;
        radius = 5;
        color = "blue";
        on = false;
        //num++;
    }
    Fan(int speed, float radius, boolean on, String color){
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.on = on;
        //num++;
    }

    // Métodos
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //public static int getNum() {
    //    return num;
    //}
    
}
