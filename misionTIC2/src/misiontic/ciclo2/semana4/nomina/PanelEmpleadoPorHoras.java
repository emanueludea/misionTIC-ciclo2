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
public class PanelEmpleadoPorHoras extends PanelEmpleado{
    
    private JLabel labelHoras;
    private JTextField textHoras;
    
    private JLabel labelValorHora;
    private JTextField textValorHora;
    
    public PanelEmpleadoPorHoras(){
        inicializarComponentes();
    }
    
    private void inicializarComponentes(){
        labelHoras = new JLabel("Horas trabajadas:");
        textHoras = new JTextField();
        
        labelValorHora = new JLabel("Valor hora:");
        textValorHora = new JTextField();
        
        ((GridLayout)getLayout()).setRows(4);
        setPreferredSize(new Dimension(300, 120));
        
        add(labelHoras);
        add(textHoras);
        
        add(labelValorHora);
        add(textValorHora);
    }
    
    public String getValorHora(){
        return textValorHora.getText();
    }
    public String getHoras(){
        return textHoras.getText();
    }
}
