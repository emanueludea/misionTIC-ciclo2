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

    private int cedula;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private int edad;
    private int semestre;

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
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

    @Override
    public String toString() {
        return String.format(
                "Cédula: %d%n"
                + "Primer nombre: %s%n"
                + "Segundo nombre: %s%n"
                + "Primer apellido: %s%n"
                + "Segundo apellido: %s%n"
                + "Edad: %d%n"
                + "Semestre: %d%n",
                this.cedula,
                this.primerNombre,
                this.segundoNombre,
                this.primerApellido,
                this.segundoApellido,
                this.edad,
                this.semestre);
    }
}
