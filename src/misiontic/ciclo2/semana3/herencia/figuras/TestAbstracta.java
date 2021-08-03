package misiontic.ciclo2.semana3.herencia.figuras;

/**
 *
 * @author
 */
public class TestAbstracta {
    public static void main(String[] args) {
        Figura f1 = new Cuadrado(2.5);
        System.out.println("area = " + f1.calcularArea());
        f1 = new Rectangulo(2.5, 4.5);
        f1 = new Triangulo();
        f1.saludar();
        // f1.mostrarAtributos(); //Da error si la clase Figura no implementa la interface Miembros
        
        Cuadrado c1 = new Cuadrado();
        Cuadrado c2 = new Cuadrado(2);
        c1.mostrarAtributos();
        System.out.println(""+ c1.compareTo(c2));
        // f1 = new Figura(); //No puedo crear un objeto de la clase abstracta
    }
}
