/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana4.nomina;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import misiontic.ciclo2.semana3.herencia.nomina.Empleado;
import misiontic.ciclo2.semana3.herencia.nomina.EmpleadoAsalariado;
import misiontic.ciclo2.semana3.herencia.nomina.EmpleadoAsalariadoPorComision;
import misiontic.ciclo2.semana3.herencia.nomina.EmpleadoPorComision;
import misiontic.ciclo2.semana3.herencia.nomina.EmpleadoPorHoras;

/**
 *
 * @author emanuel
 */
public class VentanaEmpleados extends JFrame {

    private JPanel panelPrincipal;
    private PanelEmpleado panelEmpleado;
    private JPanel panelTotal;

    private JLabel labelTotal;
    private JTextField textTotal;
    private JButton btnCancelar;

    private JMenuBar barraMenu;
    private JMenu menuEmpleados;
    private JMenuItem itemAsalariado,
            itemPorHoras,
            itemPorComision,
            itemAsalariaPorComision;

    private String tipoSeleccionado;

    public VentanaEmpleados() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        labelTotal = new JLabel("Total a pagar:");
        textTotal = new JTextField();

        panelTotal = new JPanel(new GridLayout(1, 2));
        panelTotal.add(labelTotal);
        panelTotal.add(textTotal);

        btnCancelar = new JButton("Calcular");
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manejarCalcular();
            }
        });

        panelEmpleado = new PanelEmpleadoAsalariadoPorComision();
        tipoSeleccionado = "asalariado por comision";
        panelPrincipal = new JPanel(new BorderLayout());

        panelPrincipal.add(panelEmpleado, BorderLayout.NORTH);
        panelPrincipal.add(panelTotal, BorderLayout.CENTER);
        panelPrincipal.add(btnCancelar, BorderLayout.SOUTH);
        
        panelEmpleado.setVisible(false);
        
        setContentPane(panelPrincipal);

        barraMenu = new JMenuBar();
        menuEmpleados = new JMenu("Empleados");

        itemAsalariado = new JMenuItem("Asalariado");
        itemAsalariado.addActionListener((ActionEvent e) -> {
            manejarItemAsalariado();
        });

        itemPorHoras = new JMenuItem("Por horas");
        itemPorHoras.addActionListener((ActionEvent e) -> {
            manejarItemPorHoras();
        });

        itemPorComision = new JMenuItem("Por comision");
        itemPorComision.addActionListener((ActionEvent e) -> {
            manejarItemPorComision();
        });

        itemAsalariaPorComision = new JMenuItem("Asalariado por comision");
        itemAsalariaPorComision.addActionListener((ActionEvent e) -> {
            manejarItemAsalariadoPorComision();
        });

        menuEmpleados.add(itemAsalariado);
        menuEmpleados.add(itemPorHoras);
        menuEmpleados.add(itemPorComision);
        menuEmpleados.add(itemAsalariaPorComision);

        barraMenu.add(menuEmpleados);
        setJMenuBar(barraMenu);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Nomina");
        pack();
    }

    public static void main(String[] args) {
        VentanaEmpleados ventana = new VentanaEmpleados();
        ventana.setVisible(true);
    }

    private void manejarCalcular() {
        Empleado empleado = null;
        switch (tipoSeleccionado) {
            case "asalariado":
                empleado = new EmpleadoAsalariado();
                
                // obtener el valor del salario base
                String tSalarioBase = ((PanelEmpleadoAsalariado) panelEmpleado).obtenerSalarioBase();
                double salarioBase = Double.parseDouble(tSalarioBase);
                ((EmpleadoAsalariado) empleado).setSalarioBase(salarioBase);
                
                // ponerlo en el total
                textTotal.setText(String.format("%.2f", empleado.calcularSalario()));
                System.out.println("Vamos a calcular:" + salarioBase);
                break;
                
            case "por horas":
                
                empleado = new EmpleadoPorHoras();
                String tValorHora = ((PanelEmpleadoPorHoras)panelEmpleado).getValorHora();
                String tHoras = ((PanelEmpleadoPorHoras)panelEmpleado).getHoras();
                
                int horas = Integer.parseInt(tHoras);
                double valorHora = Double.parseDouble(tValorHora);
                
                ((EmpleadoPorHoras)empleado).setHoras(horas);
                ((EmpleadoPorHoras)empleado).setValorHora(valorHora);
                
                textTotal.setText(String.format("%.0f", empleado.calcularSalario()));
                
                break;
                
            case "por comision":
                
                empleado = new EmpleadoPorComision();
                String tVentas = ((PanelEmpleadoPorComision)panelEmpleado).getVentas();
                String tPorcentaje = ((PanelEmpleadoPorComision)panelEmpleado).getPorcentaje();
                
                double ventas = Double.parseDouble(tVentas);
                double porcentaje = Double.parseDouble(tPorcentaje);
                
                ((EmpleadoPorComision)empleado).setVentas(ventas);
                ((EmpleadoPorComision)empleado).setPorcentaje(porcentaje);
                
                textTotal.setText(String.format("%.0f", empleado.calcularSalario()));
                
                break;
                
            case "asalariado por comision":
                empleado = new EmpleadoAsalariadoPorComision();
                String tVentas2 = ((PanelEmpleadoAsalariadoPorComision)panelEmpleado).getVentas();
                String tPorcentaje2 = ((PanelEmpleadoAsalariadoPorComision)panelEmpleado).getPorcentaje();
                String tSalarioBase2 = ((PanelEmpleadoAsalariadoPorComision)panelEmpleado).getSalarioBase();
                
                double ventas2 = Double.parseDouble(tVentas2);
                double porcentaje2 = Double.parseDouble(tPorcentaje2);
                double salario2 = Double.parseDouble(tSalarioBase2);
                
                ((EmpleadoAsalariadoPorComision)empleado).setVentas(ventas2);
                ((EmpleadoAsalariadoPorComision)empleado).setPorcentaje(porcentaje2);
                ((EmpleadoAsalariadoPorComision)empleado).setSalarioBase(salario2);
                
                textTotal.setText(String.format("%.0f", empleado.calcularSalario()));
                break;
        }

    }

    private void manejarItemAsalariado() {
        textTotal.setText("");
        
        tipoSeleccionado = "asalariado";
        System.out.println("manejarItemAsalariado" + tipoSeleccionado);
        panelPrincipal.remove(panelEmpleado);
        panelEmpleado = new PanelEmpleadoAsalariado();
        panelPrincipal.add(panelEmpleado, BorderLayout.NORTH);
        panelEmpleado.revalidate();
        pack();
    }

    private void manejarItemPorHoras() {
        textTotal.setText("");
        tipoSeleccionado = "por horas";
        System.out.println("manejarItemPorHoras" + tipoSeleccionado);
        panelPrincipal.remove(panelEmpleado);
        panelEmpleado = new PanelEmpleadoPorHoras();
        panelPrincipal.add(panelEmpleado, BorderLayout.NORTH);
        panelEmpleado.revalidate();
        pack();
    }

    private void manejarItemPorComision() {
        textTotal.setText("");
        tipoSeleccionado = "por comision";
        System.out.println("manejarItemPorComision " + tipoSeleccionado);
        panelPrincipal.remove(panelEmpleado);
        panelEmpleado = new PanelEmpleadoPorComision();
        panelPrincipal.add(panelEmpleado, BorderLayout.NORTH);
        panelEmpleado.revalidate();
        pack();

    }

    private void manejarItemAsalariadoPorComision() {
        textTotal.setText("");
        tipoSeleccionado = "asalariado por comision";
        System.out.println("manejarItemAsalariadoPorComision" + tipoSeleccionado);
        panelPrincipal.remove(panelEmpleado);
        panelEmpleado = new PanelEmpleadoAsalariadoPorComision();
        panelPrincipal.add(panelEmpleado, BorderLayout.NORTH);
        panelEmpleado.revalidate();
        pack();
    }
}
