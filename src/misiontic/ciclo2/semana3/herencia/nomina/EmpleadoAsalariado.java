/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana3.herencia.nomina;

/**
 *
 * @author emanuel
 */
public class EmpleadoAsalariado extends Empleado{

    private double salarioBase;

    public EmpleadoAsalariado(){
        
    }
    
    public EmpleadoAsalariado(String nombre, String documento, double salarioBase) {
        super(nombre, documento);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase(){
        return this.salarioBase;
    }
    
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    @Override
    public String toString(){
        return super.toString()+ String.format("%n Salario base: $%,.2f", this.getSalarioBase());
    }
    
    @Override
    public double calcularSalario() {
        return this.getSalarioBase();
    }
    
}
