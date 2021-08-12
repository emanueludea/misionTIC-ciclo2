/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana4.figuras;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import misiontic.ciclo2.semana3.herencia.figuras.Triangulo;

/**
 *
 * @author emanuel
 */
public class FrameTriangulo {

    public static void main(String[] ar) {
        // Crear la ventana principal (JFrame)
        JFrame ventana = new JFrame("Calculadora de Figuras");

        // Crear el contenedor (JPanel)
        JPanel panel = new JPanel();

        // Crear elementos gráficos a usa (botones, entradas de texto, labels)
        JLabel etiqueda1 = new JLabel("Lado1: ");
        JLabel etiqueda2 = new JLabel("Lado2: ");
        JLabel etiqueda3 = new JLabel("Lado3: ");

        JTextField textlado1 = new JTextField();
        JTextField textlado2 = new JTextField();
        JTextField textlado3 = new JTextField();

        JLabel labelArea = new JLabel("Area: ");
        JLabel labelPerimetro = new JLabel("Perimetro: ");
        JTextField textArea = new JTextField();
        JTextField textPerimetro = new JTextField();

        JButton btnCalcular = new JButton("Calcular");
        
        // btnCalcular.addActionListener(new ManejaEvento());
        
        /*btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });*/
        
        btnCalcular.addActionListener((ActionEvent e) -> {
            String l1 = textlado1.getText();
            String l2 = textlado2.getText();
            String l3 = textlado3.getText();

            double lado1 = Double.parseDouble(l1); // Converir el string a double
            double lado2 = Double.parseDouble(l2);
            double lado3 = Double.parseDouble(l3);

            Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

            //System.out.printf("%s %s %s %n", l1, l2, l3);
            //System.out.printf("Area: %f Perimetro: %f %n", triangulo.calcularArea(), triangulo.calcularPerimetro());
            textArea.setText(String.format("%.2f", triangulo.calcularArea()));
            textPerimetro.setText(String.format("%.2f", triangulo.calcularPerimetro()));
        });

        // Asignar layout manager al panel 
        GridLayout layout = new GridLayout(6, 2);
        panel.setLayout(layout);

        // Agregamos los elementos al contenedor
        panel.add(etiqueda1);
        panel.add(textlado1);
        panel.add(etiqueda2);
        panel.add(textlado2);
        panel.add(etiqueda3);
        panel.add(textlado3);

        panel.add(labelArea);
        panel.add(textArea);
        panel.add(labelPerimetro);
        panel.add(textPerimetro);

        panel.add(btnCalcular);

        // Asociamos el contenedor a la ventana
        ventana.setContentPane(panel);

        // Definir accion de cierre
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //ventana.setSize(300, 200); // Definir tamaño
        ventana.pack(); // Definir tamaño automáticamente

        // Hacer visible la ventana
        ventana.setVisible(true);
    }

    private static void manejarCalcular(){
        
    }
    
    private static class ManejaEvento implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Presionaste el boton");
        }
    }
}
