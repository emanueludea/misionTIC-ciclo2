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
public class Clase2 {
    protected int a;
    private Clase1 b;
    
    public Clase2(){
        
    }
    
    public Clase2(int a){
        this.a = a;
        this.b = new Clase1();
    }
    
    public Clase2(String st){
        
    }
    
    public Clase2(Clase2 obj){
        this.a = obj.a;
        this.b = new Clase1(obj.b);
    }
    
    public int getA(){
        return a;
    }
}

class Clase3{
    private int a;
    
}