/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

/**
 *
 * @author SOFIA ELIZONDO
 */
public class GUI_InformacionCursos extends javax.swing.JPanel {

    /**
     * Creates new form GUI_InformacionCursos
     */
    public GUI_InformacionCursos() {
        initComponents();
    }
    
    public String devolverInformacion()
    {
        String arreglo;
       
        arreglo=this.JT_SiglasCurso.getText();

        return arreglo;
    }
    public void blanquear(){
      JT_SiglasCurso.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JL_SiglasCurso = new javax.swing.JLabel();
        JT_SiglasCurso = new javax.swing.JTextField();

        setOpaque(false);

        JL_SiglasCurso.setText("Siglas del Curso");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(JL_SiglasCurso)
                .addGap(18, 18, 18)
                .addComponent(JT_SiglasCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_SiglasCurso)
                    .addComponent(JT_SiglasCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_SiglasCurso;
    private javax.swing.JTextField JT_SiglasCurso;
    // End of variables declaration//GEN-END:variables
}
