/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author emanuel
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Test
    public void miPrueba(){
        
    }

    /**
     * Test of sumar method, of class Calculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        // Entradas para el método
        int a;
        int b;
        
        // Salida esperada
        int expResult;
        
        // Crear objeto de la clase
        Calculadora instance = new Calculadora();
        
        // Llamar al método
        int result;
        
        int[][] pruebas = {
            {1,2,3},
            {10,20,30},
            {11,22,33}
        };
        
        for (int i = 0; i < pruebas.length; i++){
            int[] p = pruebas[i];
            a = p[0];
            b = p[1];
            expResult = p[2];
            result = instance.sumar(a, b);
            assertEquals(expResult, result);
        }        
    }
    
}
