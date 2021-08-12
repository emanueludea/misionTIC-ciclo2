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
        jugador.competir();
        assertEquals(1, jugador.getCantidadCompetencias());
        
        jugador.setLesionado(true);
        jugador.competir();
        assertEquals(1, jugador.getCantidadCompetencias());
        
        jugador.setLesionado(false);
        jugador.competir();
        assertNotEquals(jugador.getCantidadCompetencias(), 1);
        assertEquals(jugador.getCantidadCompetencias(), 2);
        
    }
    
    @Test
    public void testEntrenar() {
        jugador.entrenar();
        assertEquals(jugador.getCantidadEntrenamientos(), 1);
    }
    
}
