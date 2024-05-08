package presentacion;

/**
 *
 * @author Roberto García
 */
public class PanelHistorialPedido extends javax.swing.JPanel {

    FramePrincipal framePrincipal;
    
    /** Creates new form PanelHistorialPedido */
    public PanelHistorialPedido(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCarrito = new javax.swing.JButton();
        btnUsuario = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCarrito.setBorder(null);
        btnCarrito.setContentAreaFilled(false);
        btnCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarritoActionPerformed(evt);
            }
        });
        add(btnCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 18, 50, 50));

        btnUsuario.setBorder(null);
        btnUsuario.setContentAreaFilled(false);
        btnUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });
        add(btnUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 18, 50, 50));

        btnHistorial.setBorder(null);
        btnHistorial.setContentAreaFilled(false);
        btnHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });
        add(btnHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 18, 50, 50));

        btnMenu.setBorder(null);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 65, 65));

        btnAgregar.setBorder(null);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 690, 171, 64));

        btnRegresar.setBorder(null);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 702, 40, 40));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panelHistorialPedido.png"))); // NOI18N
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarritoActionPerformed

        //        framePrincipal.setIdProducto(1l);
        framePrincipal.cambiarVistaCarrito();
    }//GEN-LAST:event_btnCarritoActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        framePrincipal.cambiarPanelHistorial();
    }//GEN-LAST:event_btnHistorialActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        framePrincipal.cambiarVistaMenu();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        framePrincipal.mostrarInformacion("Productos agregados al carrito", "Éxito");
        
//        framePrincipal.cambiarVistaCarrito();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        framePrincipal.cambiarPanelHistorial();
    }//GEN-LAST:event_btnRegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCarrito;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JLabel lblFondo;
    // End of variables declaration//GEN-END:variables

}