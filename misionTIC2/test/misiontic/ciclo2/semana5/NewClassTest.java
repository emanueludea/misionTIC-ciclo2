/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author emanuel
 */
public class NewClassTest {
    
    NewClass instance;
    
    public NewClassTest() {
    }
    
    @Test
    public void m1(){
        
    }
    
    @BeforeClass
    public static void setUpClass() {
        // Se ejecuta 1 sola vez, antes de todo
        System.out.println("setUpClass");
    }
    
    @AfterClass
    public static void tearDownClass() {
        // Se ejecuta 1 sola vez, despues de todo
        System.out.println("tearDownClass");
    }
    
    @Before // Antes de cada método  // JUnit 5 esto se llama @BeforeEach
    public void metodo1(){
        System.out.println("Llamando al metodo1");
        instance = new NewClass();
    }
    
    
    @After
    public void tearDown() {
        System.out.println("Llamando a tearDown, entonces ya terminó un método de prueba");
    }


    
    /**
     * Test of getUno method, of class NewClass.
     */
    @Test
    public void testGetUno() {
        System.out.println("getUno");
        int expResult = 0;
        int result = instance.getUno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUno method, of class NewClass.
     */
    @Test
    public void testSetUno() {
        System.out.println("setUno");
        int uno = 0;
        instance.setUno(uno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDos method, of class NewClass.
     */
    @Test
    public void testGetDos() {
        System.out.println("getDos");
        int expResult = 0;
        int result = instance.getDos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDos method, of class NewClass.
     */
    @Test
    public void testSetDos() {
        System.out.println("setDos");
        int dos = 0;
        instance.setDos(dos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
