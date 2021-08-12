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
import org.junit.Ignore;

/**
 *
 * @author emanuel
 */
public class RectanguloTest {
    
    public RectanguloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getAncho method, of class Rectangulo.
     */
    @Test
    public void testGetAncho() {
        System.out.println("getAncho");
        Rectangulo instance = new Rectangulo();
        assertEquals(0.0, instance.getAncho(), 0.00000001);
        assertNotEquals(0.1, instance.getAncho());
    }

    /**
     * Test of setAncho method, of class Rectangulo.
     */
    @Test
    // @Ignore //@Disabled
    public void testSetAncho() {
        System.out.println("setAncho");
        Rectangulo instance = new Rectangulo();
        instance.setAncho(5.8);
        assertEquals(instance.getAncho(), 5.8, 0.0001);
    }

    /**
     * Test of getAlto method, of class Rectangulo.
     */
    @Test
    @Ignore
    public void testGetAlto() {
        System.out.println("getAlto");
        Rectangulo instance = new Rectangulo();
        double expResult = 0.0;
        double result = instance.getAlto();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAlto method, of class Rectangulo.
     */
    @Test
    @Ignore
    public void testSetAlto() {
        System.out.println("setAlto");
        double alto = 0.0;
        Rectangulo instance = new Rectangulo();
        instance.setAlto(alto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularPerimetro method, of class Rectangulo.
     */
    @Test
    @Ignore
    public void testCalcularPerimetro() {
        System.out.println("calcularPerimetro");
        Rectangulo instance = new Rectangulo();
        double expResult = 0.0;
        double result = instance.calcularPerimetro();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularArea method, of class Rectangulo.
     */
    @Test
    @Ignore
    public void testCalcularArea() {
        System.out.println("calcularArea");
        Rectangulo instance = new Rectangulo();
        double expResult = 0.0;
        double result = instance.calcularArea();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Rectangulo.
     */
    @Test
    @Ignore
    public void testToString() {
        System.out.println("toString");
        Rectangulo instance = new Rectangulo();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isRectangulo method, of class Rectangulo.
     */
    @Test
    // @Ignore
    public void testIsCuadrado() {
        System.out.println("isRectangulo");
        Rectangulo instance = new Rectangulo(2, 5);
        assertFalse("Esto no es un cuadrado", instance.isCuadrado());
    }    
}
