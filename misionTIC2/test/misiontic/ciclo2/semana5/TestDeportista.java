/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana5;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author emanuel
 */
public class TestDeportista {
    
    Deportista jugador;
    
    @Before
    public void setUp(){
        jugador = new Deportista("Andres", 20);
    }
    
    @Test
    public void testCompetir(){  
        int competenciasIniciales = 10;
        jugador.setCantidadCompetencias(competenciasIniciales);
        jugador.setLesionado(true);
        jugador.competir();
        int cantidad = jugador.getCantidadCompetencias();
        assertEquals(cantidad, competenciasIniciales);
        
        jugador.setLesionado(false);
        jugador.competir();
        assertEquals(jugador.getCantidadCompetencias(), competenciasIniciales+1);
        
        jugador.setEdad(80);
        jugador.competir();
        assertEquals(jugador.getCantidadCompetencias(), competenciasIniciales+1);
    }
    
    @Test
    public void testEntrenar() {
        jugador.entrenar();
        assertEquals(jugador.getCantidadEntrenamientos(), 1);
    }
    
    @Test
    public void testCumplirAnios(){
        int edadInicial = 30;
        jugador.setEdad(edadInicial);
        jugador.cumplirAnios();
        assertEquals(jugador.getEdad(), edadInicial+1);
    }
    
    @Test
    public void testObtenerProbabilidadDeLesion(){
        double error = 0.0001;
        assertEquals(jugador.obtenerProbabilidadDeLesion(), 0.3, error);
        
        jugador.entrenar();
        double valor = jugador.obtenerProbabilidadDeLesion();
        System.out.println("1 "+ valor);
        assertEquals("Un entrenamiento",valor, 0, error);
        
        jugador.entrenar();
        assertEquals(jugador.obtenerProbabilidadDeLesion(), 0, error);
        
        jugador.setCantidadCompetencias(4);
        valor = jugador.obtenerProbabilidadDeLesion();
        System.out.println("2 "+ valor);
        assertTrue(valor >= 0.05);
        
        jugador.setCantidadEntrenamientos(0);
        valor = jugador.obtenerProbabilidadDeLesion();
        System.out.println("3 "+ valor);
        assertTrue(valor >= 0.35);
    }
}
