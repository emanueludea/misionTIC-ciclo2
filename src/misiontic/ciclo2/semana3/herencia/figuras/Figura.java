package misiontic.ciclo2.semana3.herencia.figuras;

/**
 * No puedo crear objetos de una clase abstracta (solo puedo crearlos de una
 * clase "concreta", que herede de ella) Una clase abstracta no necesariamente
 * debe tener métodos abstractos Si hay un método abstracto, la clase debe ser
 * abstracta
 *
 * @author
 */
public abstract class Figura {

    public abstract double calcularPerimetro();

    public abstract double calcularArea();

    public void saludar() {
        System.out.println("Hola!!");
    }

}
