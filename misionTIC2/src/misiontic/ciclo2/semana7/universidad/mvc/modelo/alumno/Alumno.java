/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana7.universidad.mvc.modelo.alumno;

/**
 *
 * @author emanuel
 */
public class Alumno {

    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private int cedula;
    private int edad;
    private int semestre;

    public Alumno() {
    }

    public Alumno(String primerNombre, String primerApellido, int cedula) {
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.cedula = cedula;
    }

    public Alumno(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, int cedula, int edad, int semestre) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.cedula = cedula;
        this.edad = edad;
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return String.format("\tcédula = %d%n\tprimer nombre = %s%n\tsegundo nombre = %s%n"
                + "\tprimer apellido = %s%n\tsegundo apellido = %s%n\tedad = %d%n\tsemestre = %d%n",
                cedula, primerNombre, segundoNombre, primerApellido, segundoApellido, edad, semestre);
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

}
