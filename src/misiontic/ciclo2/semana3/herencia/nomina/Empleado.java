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
public abstract class Empleado {
    private String nombre;
    private String codigo;
    private double salarioBase;

    public Empleado(){
        
    }
    
    public Empleado(String nombre, String codigo){
        this.nombre = nombre;
        this.codigo = codigo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public abstract double calcularSalario();
    
    @Override
    public String toString(){
        return String.format("Nombre: %s%n Código: %s", getNombre(), getCodigo());
    }
}
