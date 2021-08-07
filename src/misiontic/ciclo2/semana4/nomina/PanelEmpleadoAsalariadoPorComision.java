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
public class PanelEmpleadoAsalariadoPorComision extends PanelEmpleadoPorComision{
    private JLabel labelSalarioBase;
    private JTextField textSalarioBase;
    
    public PanelEmpleadoAsalariadoPorComision(){
        labelSalarioBase= new JLabel("Salario base:");
        textSalarioBase = new JTextField();
        
        ((GridLayout)getLayout()).setRows(5);
        setPreferredSize(new Dimension(300, 150));
        
        add(labelSalarioBase);
        add(textSalarioBase);
    }
    
    public String getSalarioBase(){
        return textSalarioBase.getText();
    }
}
