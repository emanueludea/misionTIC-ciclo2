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
import org.junit.Ignore;

/**
 *
 * @author emanuel
 */
public class TaxiTest {

    Taxi miTaxi;

    public TaxiTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void inicializar() {
        this.miTaxi = new Taxi();
    }
    
    // @After

    /**
     * Test of aplicarBotonPanico method, of class Taxi.
     */
    public void testAplicarBotonPanico() {
        System.out.println("aplicarBotonPanico");
        miTaxi.aplicarBotonPanico();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gestionarMarcha method, of class Taxi.
     */
    @Test
    public void testGestionarMarcha() {
        System.out.println("gestionarMarcha");
        miTaxi.gestionarMarcha(); // =true
        assertTrue(miTaxi.isEnMarcha());

        miTaxi.aplicarBotonPanico();
        miTaxi.gestionarMarcha();
        assertTrue(miTaxi.isEnMarcha() == false);
    }

    /**
     * Test of recogerPasajero method, of class Taxi.
     */
    @Test
    public void testRecogerPasajero() {
        System.out.println("recogerPasajero");
        miTaxi.recogerPasajero(); // nPasajeros = 1
        assertEquals(miTaxi.getnPasajeros(), 1);

        miTaxi.setEnMarcha(true);
        int cantidad = 500;
        miTaxi.setnPasajeros(cantidad);

        miTaxi.recogerPasajero(); // No puede recogerlo porque está en marcha
        assertEquals(miTaxi.getnPasajeros(), cantidad);
    }

    /**
     * Test of dejarPasajero method, of class Taxi.
     */
    @Test
    public void testDejarPasajero() {
        System.out.println("dejarPasajero");
        Taxi miTaxi = new Taxi(); // nPasajeros = 0
        miTaxi.dejarPasajero();
        assertEquals(miTaxi.getnPasajeros(), 0);
    }

    /**
     * Test of isEnMarcha method, of class Taxi.
     */
    @Test
    public void testIsEnMarcha() {
        System.out.println("isEnMarcha");
        Taxi instance = new Taxi();
        boolean expResult = false;
        boolean result = instance.isEnMarcha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEnMarcha method, of class Taxi.
     */
    @Test
    public void testSetEnMarcha() {
        System.out.println("setEnMarcha");
        miTaxi.setPuertasAseguradas(true);
        miTaxi.setEnMarcha(true);
        assertTrue(miTaxi.isEnMarcha() == true);
        
        miTaxi.setEnMarcha(false);
        miTaxi.setPuertasAseguradas(false);
        miTaxi.setEnMarcha(true);
        assertFalse(miTaxi.isEnMarcha());
        
    }

    /**
     * Test of getTotalPasaje method, of class Taxi.
     */
    @Test
    public void testGetTotalPasaje() {
        System.out.println("getTotalPasaje");
        Taxi instance = new Taxi();
        double expResult = 0.0;
        double result = instance.getTotalPasaje();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalPasaje method, of class Taxi.
     */
    @Test
    public void testSetTotalPasaje() {
        System.out.println("setTotalPasaje");
        double totalPasaje = 0.0;
        Taxi instance = new Taxi();
        instance.setTotalPasaje(totalPasaje);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getnPasajeros method, of class Taxi.
     */
    @Test
    public void testGetnPasajeros() {
        System.out.println("getnPasajeros");
        Taxi instance = new Taxi();
        int expResult = 0;
        int result = instance.getnPasajeros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setnPasajeros method, of class Taxi.
     */
    @Test
    public void testSetnPasajeros() {
        System.out.println("setnPasajeros");
        int nPasajeros = 0;
        Taxi instance = new Taxi();
        instance.setnPasajeros(nPasajeros);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPuertasAseguradas method, of class Taxi.
     */
    @Test
    public void testIsPuertasAseguradas() {
        System.out.println("isPuertasAseguradas");
        Taxi instance = new Taxi();
        boolean expResult = false;
        boolean result = instance.isPuertasAseguradas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPuertasAseguradas method, of class Taxi.
     */
    @Test
    public void testSetPuertasAseguradas() {
        System.out.println("setPuertasAseguradas");
        boolean puertasAseguradas = false;
        Taxi instance = new Taxi();
        instance.setPuertasAseguradas(puertasAseguradas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
