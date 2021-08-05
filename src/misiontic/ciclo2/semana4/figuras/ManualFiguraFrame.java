/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana4.figuras;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import misiontic.ciclo2.semana3.herencia.figuras.Circulo;

/**
 *
 * @author emanuel
 */
public class ManualFiguraFrame extends JFrame {

    private FiguraPanel figuraContainer;
    private MedidasPanel medidasContainer;
    private Container contentPane;
    private JButton btnCalcular;
    private CardLayout cardLayout;
    
    public ManualFiguraFrame() {
        initComponents();
    }

    private void initComponents() {
        contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(3,1));
        
        //figuraContainer = new JPanel();
        //figuraContainer.add(new CuadradoPanel());
        figuraContainer = new CuadradoPanel();
        medidasContainer = new MedidasPanel();
        btnCalcular = new JButton("Calcular");
        btnCalcular.addActionListener((ActionEvent e) -> {
            calcularMedidas();
        });
        
        contentPane.add(figuraContainer);
        contentPane.add(medidasContainer);
        contentPane.add(btnCalcular);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private void calcularMedidas(){
        medidasContainer.setAreaValue(figuraContainer.getArea());
        medidasContainer.setPerimetroValue(figuraContainer.getPerimetro());
        figuraContainer = new CirculoPanel();
        contentPane.remove(0);
        contentPane.add(figuraContainer, 0);
        contentPane.revalidate();
    }
    
    public static void main(String[] args){
        ManualFiguraFrame frame = new ManualFiguraFrame();
        
    }
}
