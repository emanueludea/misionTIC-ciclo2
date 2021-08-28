/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana5;

/**
 *
 * @author emanuel
 */
public class Taxi {
    private boolean enMarcha = false;
    private double totalPasaje = 0.0;
    private int nPasajeros = 0;
    private boolean puertasAseguradas;

    public Taxi() {
    }   
    
    public void aplicarBotonPanico(){
        
    }
    
    public void gestionarMarcha(){
        this.enMarcha = !this.enMarcha;        
    }
    
    public void recogerPasajero(){
        if(this.enMarcha) return;
        this.nPasajeros +=1;
    }
    
    public void dejarPasajero(){
        
    }
    
    public boolean isEnMarcha() {
        return enMarcha;
    }

    public void setEnMarcha(boolean enMarcha) {
        if(!this.puertasAseguradas && !this.enMarcha) return;
        this.enMarcha = enMarcha;
    }

    public double getTotalPasaje() {
        return totalPasaje;
    }

    public void setTotalPasaje(double totalPasaje) {
        this.totalPasaje = totalPasaje;
    }

    public int getnPasajeros() {
        return nPasajeros;
    }

    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    public boolean isPuertasAseguradas() {
        return puertasAseguradas;
    }

    public void setPuertasAseguradas(boolean puertasAseguradas) {
        this.puertasAseguradas = puertasAseguradas;
    }
    
}
