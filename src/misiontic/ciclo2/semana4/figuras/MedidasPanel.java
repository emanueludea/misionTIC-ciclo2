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

/**
 *
 * @author emanuel
 */
public class MedidasPanel extends JPanel {

    private JLabel lArea;
    private JLabel lPerimetro;
    private JTextField tArea;
    private JTextField tPerimetro;

    public MedidasPanel(){
        initComponents();
    }

    private void initComponents() {
        GridLayout layout = new GridLayout(2, 2);
        setLayout(layout);
        lArea = new JLabel("Area:");
        lPerimetro = new JLabel("Perímetro:");
        tArea = new JTextField();
        tPerimetro = new JTextField();
        this.add(lArea);
        add(tArea);
        add(lPerimetro);
        add(tPerimetro);
    }
    
    public void setAreaValue(double area){
        tArea.setText(""+area);
    }
    
    public void setPerimetroValue(double area){
        tPerimetro.setText(""+area);
    }
}
