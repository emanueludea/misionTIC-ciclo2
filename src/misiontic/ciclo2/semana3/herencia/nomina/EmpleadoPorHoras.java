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
public class EmpleadoPorHoras extends Empleado {

    private int horas;
    private double valorHora;

    public EmpleadoPorHoras() {
    }

    public EmpleadoPorHoras(String nombre, String codigo, int horas, double valorHora) {
        super(nombre, codigo);
        this.horas = horas;
        this.valorHora = valorHora;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        double pago = this.horas * valorHora;
        if (horas > 40) {
            pago += (this.horas - 40) * 0.5;
        }
        return pago;
    }

    @Override
    public String toString() {
        return super.toString() + 
                String.format("%n Horas trabajadas: %d%n Valor hora: $%,.2f", this.getHoras(), this.getValorHora());
    }
}
