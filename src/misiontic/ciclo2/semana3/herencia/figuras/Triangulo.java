package misiontic.ciclo2.semana3.herencia.figuras;

/**
 *
 * @author emanuel
 */
public class Triangulo extends Figura {

    private double lado1;
    private double lado2;
    private double lado3;

    @Override
    public double calcularPerimetro() {
        return lado1+ lado2 + lado3;
    }

    @Override
    public double calcularArea() {
        return 0.0;
    }
  
}


/*
Descripcion del problema:
    Sistema de calificaciones para una institucion educativa

- Determinar los sustantivos -> Clases
    Profesores
    Alumnos
    Directivos
    Notas
    Materias
    Materias especiales

- Identificar verbos (acciones) -> Métodos
    Calificar
    Supervisar
    Reclama


*/