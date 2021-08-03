package misiontic.ciclo2.semana3.arrayList;

import java.util.ArrayList;
import misiontic.ciclo2.semana3.herencia.figuras.Cuadrado;
import misiontic.ciclo2.semana3.herencia.figuras.Figura;
import misiontic.ciclo2.semana3.herencia.figuras.Rectangulo;

/**
 * ArrayList<TIPO> nombre = new ArrayList<TIPO>();
 * @author emanuel
 */
public class PruebaArrayList {
    public static void main(String[] args) {
        ArrayList<Figura>  lista1;
        lista1 = new ArrayList();
        
        System.out.println("tamaño actual: " + lista1.size());
        lista1.add(new Cuadrado()); // append de python
        lista1.add(new Rectangulo(6, 4));
        System.out.println("tamaño actual: " + lista1.size()); 
        Figura c1 = lista1.get(1); // lista1[1] en python
        Cuadrado c3 = new Cuadrado();
        System.out.println(""+ c1.calcularArea());
        boolean contains = lista1.contains(c1);
        System.out.println("" + contains);
        lista1.remove(0);
        System.out.println("tamaño actual: " + lista1.size()); 
        
        ArrayList<Boolean> lista2;
    }
}
