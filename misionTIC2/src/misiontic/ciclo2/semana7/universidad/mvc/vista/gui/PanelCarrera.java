/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana7.universidad.mvc.vista.gui;

/**
 *
 * @author emanuel
 */
public class PanelCarrera extends javax.swing.JPanel {

    /**
     * Creates new form Carrera
     */
    public PanelCarrera() {
        initComponents();
    }
    
    public void limpiarPantalla(){
        textCodigo.setText("");
        textNombre.setText("");
        textDuracion.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textDuracion = new javax.swing.JTextField();

        setLayout(new java.awt.GridLayout(3, 2));

        jLabel1.setText("Codigo");
        add(jLabel1);
        add(textCodigo);

        jLabel3.setText("Nombre");
        add(jLabel3);
        add(textNombre);

        jLabel2.setText("Duracion");
        add(jLabel2);
        add(textDuracion);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textDuracion;
    private javax.swing.JTextField textNombre;
    // End of variables declaration//GEN-END:variables
}
