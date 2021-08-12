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
 *The code marked @Before is executed before each test, while @BeforeClass runs 
 * once before the entire test fixture. If your test class has ten tests, 
 * @Before code will be executed ten times, but @BeforeClass will be executed only once.

In general, you use @BeforeClass when multiple tests need to share the same 
* computationally expensive setup code. Establishing a database connection falls 
* into this category. You can move code from @BeforeClass into @Before, but your 
* test run may take longer. Note that the code marked @BeforeClass is run as 
* static initializer, therefore it will run before the class instance of your 
* test fixture is created.

In JUnit 5, the tags @BeforeEach and @BeforeAll are the equivalents of @Before 
* and @BeforeClass in JUnit 4. Their names are a bit more indicative of when 
* they run, loosely interpreted: 'before each tests' and 'once before all tests'.

* tomado de ( https://stackoverflow.com/questions/20295578/difference-between-before-beforeclass-beforeeach-and-beforeall )
 * @author emanuel
 */
public class CuadradoTest {
    
    public CuadradoTest() {
    }
    
    @BeforeClass // @BeforeAll en JUint 5
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before  // @BeforeEach en JUnit 5
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of compareTo method, of class Cuadrado.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Cuadrado c1 = new Cuadrado(5);
        Cuadrado c2 = new Cuadrado(3);
        Cuadrado c3 = new Cuadrado(5);
        assertEquals(c1.compareTo(c3), 0, 0);
        assertNotEquals(c1.compareTo(c2), 0);
    }    
}
