/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana4.rectangulo;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import misiontic.ciclo2.semana3.herencia.figuras.Rectangulo;

/**
 *
 * @author emanuel
 */
public class RectanguloFrame {

    private final JFrame frame;
    private final JLabel lAncho;
    private final JLabel lAlto;
    private final JLabel lArea;
    private final JLabel lPerimetro;
    private final JTextField tAncho;
    private final JTextField tAlto;
    private final JTextField tArea;
    private final JTextField tPerimetro;
    private final JButton btnCalcular;

    public RectanguloFrame() {
        frame = new JFrame("Rectangulo");

        //Container contenedor = new JPanel();
        LayoutManager gridLayout = new GridLayout(5, 2);
        //contenedor.setLayout(gridLayout);
        Container contenedor = new JPanel(gridLayout);

        lAncho = new JLabel("Lado:");
        lAlto = new JLabel("Ancho:");
        lArea = new JLabel("Area:");
        lPerimetro = new JLabel("Perímetro:");

        tAncho = new JTextField();
        tAlto = new JTextField();
        tArea = new JTextField();
        tPerimetro = new JTextField();

        btnCalcular = new JButton("Calcular");
        btnCalcular.addActionListener(new BtnListener());

        contenedor.add(lAlto);
        contenedor.add(tAlto);
        contenedor.add(lAncho);
        contenedor.add(tAncho);
        contenedor.add(lArea);
        contenedor.add(tArea);
        contenedor.add(lPerimetro);
        contenedor.add(tPerimetro);
        contenedor.add(btnCalcular);

        frame.setContentPane(contenedor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private class BtnListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("" + e + " -- " + e.getActionCommand());
            double alto = Double.parseDouble(tAlto.getText()),
                    ancho = Double.parseDouble(tAncho.getText());
            Rectangulo rect = new Rectangulo(alto, ancho);
            tArea.setText("" + rect.calcularArea());
            tPerimetro.setText("" + rect.calcularPerimetro());
        }

    }
}
