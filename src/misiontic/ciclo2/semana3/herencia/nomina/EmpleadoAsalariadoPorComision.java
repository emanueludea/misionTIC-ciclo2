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
public class EmpleadoAsalariadoPorComision extends EmpleadoPorComision {

    private double salarioBase;

    public EmpleadoAsalariadoPorComision() {
    }

    public EmpleadoAsalariadoPorComision(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public EmpleadoAsalariadoPorComision(String nombre, String codigo, double salarioBase, double ventas, double porcentaje) {
        super(nombre, codigo, ventas, porcentaje);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + this.getSalarioBase();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%nSalario base: $%,.2f", this.getSalarioBase());
    }

    
}
