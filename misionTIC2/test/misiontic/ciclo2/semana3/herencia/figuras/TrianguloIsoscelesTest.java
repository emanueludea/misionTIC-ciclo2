/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana3.herencia.figuras;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author emanuel
 */
public class TrianguloIsoscelesTest {
    
    public TrianguloIsoscelesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcularArea method, of class TrianguloIsosceles.
     */
    @Test
    public void testCalcularArea() {
        System.out.println("calcularArea");
        TrianguloIsosceles instance = null;
        double expResult = 0.0;
        double result = instance.calcularArea();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
