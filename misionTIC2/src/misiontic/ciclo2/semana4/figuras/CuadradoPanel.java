/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana4.figuras;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import misiontic.ciclo2.semana3.herencia.figuras.Cuadrado;
import misiontic.ciclo2.semana3.herencia.figuras.Figura;

/**
 *
 * @author emanuel
 */
public class CuadradoPanel extends FiguraPanel {

    private JLabel lLado;
    private JTextField tLado;
    private Cuadrado figura;

    public CuadradoPanel() {
        initComponents();
    }

    private void initComponents() {
        lLado = new JLabel("Lado:");
        tLado = new JTextField();
        GridLayout layout = new GridLayout(1, 2);
        this.setLayout(layout);
        this.add(lLado);
        this.add(tLado);
    }
    
    @Override
    public double getArea(){
        if(tLado.getText().equals("")){
            return 0.0;
        }
        double lado = Double.parseDouble(tLado.getText());
        this.figura = new Cuadrado(lado);
        return figura.calcularArea();
    }
    
    @Override
    public double getPerimetro(){
        if(tLado.getText().equals("")){
            return 0.0;
        }
        double lado = Double.parseDouble(tLado.getText());
        this.figura = new Cuadrado(lado);
        return figura.calcularPerimetro();
    }
}
