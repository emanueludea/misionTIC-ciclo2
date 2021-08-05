package misiontic.ciclo2.semana3.herencia.figuras;

/**
 *
 * @author emanuel
 */
public class Triangulo extends Figura {
    
    protected double lado1;
    protected double lado2;
    protected double lado3;
    
    public Triangulo(){        
    }
    
    public Triangulo(double l1, double l2, double l3){
        lado1 = l1;
        lado2 = l2;
        lado3 = l3;
    }
    
    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
    
    @Override
    public double calcularArea() {
        double semiP = (this.lado1 + this.lado2 + this.lado3) / 2;
        // Aplicar formula de Herón (https://www.neurochispas.com/wiki/area-de-un-triangulo-escaleno/)
        return Math.sqrt(semiP * (semiP - lado1) * (semiP - lado2) * (semiP - lado3));
    }
    
    @Override
    public String toString(){
        return String.format("Lado1: %f, lado2: %f, lado3: %f", lado1, lado2, lado3);
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
