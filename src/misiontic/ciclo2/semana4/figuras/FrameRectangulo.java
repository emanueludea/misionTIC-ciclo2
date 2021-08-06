/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana4.figuras;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import misiontic.ciclo2.semana3.herencia.figuras.Rectangulo;
import misiontic.ciclo2.semana3.herencia.figuras.Triangulo;

/**
 *
 * @author emanuel
 */
public class FrameRectangulo extends JFrame {

    private Container panel;

    private JLabel etiqueda1;
    private JLabel etiqueda2;

    private JTextField textAncho;
    private JTextField textAlto;

    private JLabel labelArea;
    private JLabel labelPerimetro;
    private JTextField textArea;
    private JTextField textPerimetro;
    private JButton btnCalcular;

    public FrameRectangulo() {
        inicializarFrame();
    }
    
    private void inicializarFrame(){
        
        setTitle("Calculadora de Rectangulos");
        panel = getContentPane();
        // Crear elementos gráficos a usa (botones, entradas de texto, labels)
        etiqueda1 = new JLabel("Lado1: ");
        etiqueda2 = new JLabel("Lado2: ");
        textAlto = new JTextField();
        textAncho = new JTextField();
        labelArea = new JLabel("Area: ");
        labelPerimetro = new JLabel("Perimetro: ");
        textArea = new JTextField();
        textPerimetro = new JTextField();
        btnCalcular = new JButton("Calcular");
        btnCalcular.addActionListener((ActionEvent e) -> {
            String l1 = textAncho.getText();
            String l2 = textAncho.getText();

            double lado1 = Double.parseDouble(l1); // Converir el string a double
            double lado2 = Double.parseDouble(l2);

            Rectangulo rectangulo = new Rectangulo(lado1, lado2);

            //System.out.printf("%s %s %s %n", l1, l2, l3);
            //System.out.printf("Area: %f Perimetro: %f %n", triangulo.calcularArea(), triangulo.calcularPerimetro());
            textArea.setText(String.format("%.2f", rectangulo.calcularArea()));
            textPerimetro.setText(String.format("%.2f", rectangulo.calcularPerimetro()));
        });
        // Asignar layout manager al panel 
        GridLayout layout = new GridLayout(6, 2);
        panel.setLayout(layout);

        // Agregamos los elementos al contenedor
        panel.add(etiqueda1);
        panel.add(textAlto);
        panel.add(etiqueda2);
        panel.add(textAncho);

        panel.add(labelArea);
        panel.add(textArea);
        panel.add(labelPerimetro);
        panel.add(textPerimetro);

        panel.add(btnCalcular);

        // Asociamos el contenedor a la ventana
        this.setContentPane(panel);

        // Definir accion de cierre
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //ventana.setSize(300, 200); // Definir tamaño
        this.pack(); // Definir tamaño automáticamente
    }

    public static void main(String[] args) {
        FrameRectangulo frame = new FrameRectangulo();
        frame.setVisible(true);
    }
}
