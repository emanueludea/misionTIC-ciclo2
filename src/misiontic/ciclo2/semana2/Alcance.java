/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana2;

/**
 * La clase Alcance demuestra los alcances de los campos y las variables
 * locales.
 *
 * @author emanuel (copiado del libro de deitel & deitel)
 */
public class Alcance {
    // campo accesible para todos los métodos de esta clase

    private static int x = 1;
// el método main crea e inicializa la variable local x
// y llama a los métodos usarVariableLocal y usarCampo

    public static void main(String[] args) {
        int x = 5; // la variable local x del método oculta al campo x
        System.out.printf("la x local en main es %d % n", x);
        usarVariableLocal(); // usarVariableLocal tiene la x localusarCampo(); // usarCampo usa el campo x de la clase Alcance
        usarVariableLocal(); // usarVariableLocal reinicia a la x local
        usarCampo(); // el campo x de la clase Alcance retiene su valor
        System.out.printf("% nla x local en main es % d % n", x
        );
    }// crea e inicializa la variable local x durante cada llamada

    public static void usarVariableLocal() {
        int x = 25; // se inicializa cada vez que se llama a usarVariableLocal
        System.out.printf("%nla x local al entrar al metodo usarVariableLocal es % d % n", x);
        ++x; // modifica la variable x local de este método
        System.out.printf(
                "a x local antes de salir del metodo usarVariableLocal es %d % n", x);
    }
// modifica el campo x de la clase Alcance durante cada llamada

    public static void usarCampo() {
        System.out.printf("%nel campo x al entrar al metodo usarCampo es % d % n", x);
        x *= 10; // modifica el campo x de la clase Alcance
        System.out.printf(
                "el campo x antes de salir del metodo usarCampo es %d % n", x
        );
    }
} // fin de la clase Alcance

