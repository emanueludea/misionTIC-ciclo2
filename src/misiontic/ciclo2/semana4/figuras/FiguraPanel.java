/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana4.figuras;

import javax.swing.JPanel;
import misiontic.ciclo2.semana3.herencia.figuras.Figura;

/**
 *
 * @author emanuel
 */
public abstract class FiguraPanel extends JPanel{
    protected Figura figura;
    abstract public double getArea();
    abstract double getPerimetro();
}
