/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Controlador.Controlador_Cursos;
import java.awt.event.ActionEvent;

/**
 *
 * @author SOFIA ELIZONDO
 */
public class GUI_BotonesCursos extends javax.swing.JPanel {

    /**
     * Creates new form GUI_BotonesCursos
     */
    Controlador_Cursos controlador;
    public GUI_BotonesCursos() {
        initComponents();
    }
    
    public void agregarEventosGUI(Controlador_Cursos controlador){
      this.controlador=controlador;
      this.JB_Registro.addActionListener(controlador);
      this.JB_Consultar.addActionListener(controlador);
      this.JB_Eliminar.addActionListener(controlador);
      this.JB_Modificar.addActionListener(controlador);
      this.JB_Reporte.addActionListener(controlador);
      this.JB_Matricula.addActionListener(controlador);
      
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JB_Registro = new javax.swing.JButton();
        JB_Consultar = new javax.swing.JButton();
        JB_Reporte = new javax.swing.JButton();
        JB_Modificar = new javax.swing.JButton();
        JB_Eliminar = new javax.swing.JButton();
        JB_Matricula = new javax.swing.JButton();

        setOpaque(false);

        JB_Registro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Registro.png"))); // NOI18N
        JB_Registro.setActionCommand("Registro");
        JB_Registro.setBorderPainted(false);
        JB_Registro.setContentAreaFilled(false);

        JB_Consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Consultar.png"))); // NOI18N
        JB_Consultar.setActionCommand("Consultar");
        JB_Consultar.setBorderPainted(false);
        JB_Consultar.setContentAreaFilled(false);

        JB_Reporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Reportes.png"))); // NOI18N
        JB_Reporte.setActionCommand("Reportes");
        JB_Reporte.setBorderPainted(false);
        JB_Reporte.setContentAreaFilled(false);

        JB_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modificar.png"))); // NOI18N
        JB_Modificar.setActionCommand("Modificar");
        JB_Modificar.setBorderPainted(false);
        JB_Modificar.setContentAreaFilled(false);

        JB_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        JB_Eliminar.setActionCommand("Eliminar");
        JB_Eliminar.setBorderPainted(false);
        JB_Eliminar.setContentAreaFilled(false);

        JB_Matricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Matricula.png"))); // NOI18N
        JB_Matricula.setActionCommand("Matricula");
        JB_Matricula.setBorderPainted(false);
        JB_Matricula.setContentAreaFilled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JB_Registro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JB_Consultar)
                    .addComponent(JB_Reporte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JB_Modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JB_Matricula))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(JB_Eliminar))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JB_Registro)
                    .addComponent(JB_Consultar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(JB_Matricula)
                        .addComponent(JB_Modificar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JB_Reporte)
                    .addComponent(JB_Eliminar)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Consultar;
    private javax.swing.JButton JB_Eliminar;
    private javax.swing.JButton JB_Matricula;
    private javax.swing.JButton JB_Modificar;
    private javax.swing.JButton JB_Registro;
    private javax.swing.JButton JB_Reporte;
    // End of variables declaration//GEN-END:variables
}