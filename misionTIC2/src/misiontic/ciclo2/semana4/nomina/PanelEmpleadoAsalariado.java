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
public class PanelEmpleadoAsalariado extends PanelEmpleado{
    
    private JLabel labelSalarioBase;
    private JTextField textSalarioBase;
    
    public PanelEmpleadoAsalariado(){
        inicializarComponentes();
    }
    
    private void inicializarComponentes(){
        labelSalarioBase = new JLabel("Salario base:");
        textSalarioBase = new JTextField();
        
        //LayoutManager layout = getLayout();
        GridLayout layout = (GridLayout)getLayout();
        layout.setRows(3);
        setPreferredSize(new Dimension(300, 90));
        
        add(labelSalarioBase);
        add(textSalarioBase);
    }
    
    public String obtenerSalarioBase(){
        return textSalarioBase.getText();
    }
    
}
