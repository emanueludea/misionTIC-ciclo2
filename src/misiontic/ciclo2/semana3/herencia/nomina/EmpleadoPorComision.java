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
public class EmpleadoPorComision extends Empleado {

    private double ventas;
    private double porcentaje;

    public EmpleadoPorComision() {
    }

    public EmpleadoPorComision(String nombre, String codigo, double ventas, double porcentaje) {
        super(nombre, codigo);
        this.ventas = ventas;
        this.porcentaje = porcentaje / 100;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public double getPorcentaje() {
        return porcentaje * 100;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje / 100;
    }

    @Override
    public double calcularSalario() {
        return this.ventas * this.porcentaje;
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format("%n Ventas: $%,.2f%n Porcentaje: %,.2f%s", this.getVentas(), getPorcentaje(), "%");
    }
}
