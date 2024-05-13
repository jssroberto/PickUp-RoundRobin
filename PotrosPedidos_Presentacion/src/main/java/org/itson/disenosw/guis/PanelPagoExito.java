package org.itson.disenosw.guis;

/**
 *
 * @author Roberto García
 */
public class PanelPagoExito extends javax.swing.JPanel {

    FramePrincipal framePrincipal;
    
    /** Creates new form PanelPagoExito */
    public PanelPagoExito(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
        
        initComponents();
        lblNumPeddo.setText(Integer.toString(framePrincipal.getIdPedido()+1));
        lblCalave.setText(framePrincipal.getClaveRecoleccion());
        framePrincipal.setIdPedido(framePrincipal.getIdPedido()+1);
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        lblNumPeddo = new javax.swing.JLabel();
        lblCalave = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(400, 800));
        setMinimumSize(new java.awt.Dimension(400, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar.setBorder(null);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 610, 160, 50));

        lblNumPeddo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        lblNumPeddo.setText("jLabel1");
        lblNumPeddo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(lblNumPeddo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 140, 80));

        lblCalave.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        lblCalave.setText("lblClave");
        lblCalave.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(lblCalave, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 160, 70));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panelPagoExito.png"))); // NOI18N
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        framePrincipal.cambiarVistaMenu();
    }//GEN-LAST:event_btnRegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel lblCalave;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblNumPeddo;
    // End of variables declaration//GEN-END:variables

}
