/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana4.nomina;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author emanuel
 */
public class PanelEmpleadoPorComision extends PanelEmpleado{
    
    private JLabel labelVentas,
            labelPorcentaje;
    protected JTextField textVentas,
            textPorcentaje;
    
    public PanelEmpleadoPorComision(){
        inicializarComponentes();
    }
    
    private void inicializarComponentes(){
        labelVentas = new JLabel("Ventas:");
        labelPorcentaje = new JLabel("Porcentaje:");
        textVentas = new JTextField();
        textPorcentaje = new JTextField();
        
        ((GridLayout)getLayout()).setRows(4);
        setPreferredSize(new Dimension(300, 120));
        
        add(labelVentas);
        add(textVentas);
        add(labelPorcentaje);
        add(textPorcentaje);
    }
    
    public String getVentas(){
        return textVentas.getText();
    }
    
    public String getPorcentaje(){
        return textPorcentaje.getText();
    }
}
