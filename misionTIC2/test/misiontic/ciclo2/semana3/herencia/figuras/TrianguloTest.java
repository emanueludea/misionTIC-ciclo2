/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana3.herencia.figuras;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author emanuel
 */
public class TrianguloTest {
    
    public TrianguloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcularPerimetro method, of class Triangulo.
     */
    @Test
    public void testCalcularPerimetro() {
        System.out.println("calcularPerimetro");
        Triangulo instance = new Triangulo();
        double expResult = 0.0;
        double result = instance.calcularPerimetro();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularArea method, of class Triangulo.
     */
    @Test
    public void testCalcularArea() {
        System.out.println("calcularArea");
        Triangulo instance = new Triangulo();
        double expResult = 0.0;
        double result = instance.calcularArea();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Triangulo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Triangulo instance = new Triangulo();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
