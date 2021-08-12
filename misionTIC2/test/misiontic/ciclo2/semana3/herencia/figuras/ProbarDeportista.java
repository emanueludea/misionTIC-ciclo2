/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana3.herencia.figuras;

import misiontic.ciclo2.semana5.Deportista;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

/**
 *
 * @author emanuel
 */
public class ProbarDeportista {
    @Test
    public void probarConstructor(){
        Deportista jugador = new Deportista("Juan Camilo Pulgarin", 20);        
        assertEquals("Juan Camilo Pulgarin", jugador.getNombre());
    }
    
    @Test
    public int probarCompetir(){
        Deportista jugador = new Deportista("Juan Camilo Pulgarin", 20);
        jugador.competir();
        assertEquals(jugador.getCantidadCompetencias(), 1);
        
        jugador.setLesionado(true);
        jugador.competir();
        assertEquals(jugador.getCantidadCompetencias(), 1);
        
        jugador.setLesionado(false);
        jugador.competir();
        assertNotEquals(jugador.getCantidadCompetencias(), 1);
        assertEquals(jugador.getCantidadCompetencias(), 2);
    }
}
