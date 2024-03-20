package GUI;


/**
 * Esta clase representa la vista de inicio de sesión en la interfaz gráfica del banco.
 * Permite a los usuarios iniciar sesión proporcionando su nombre de usuario y contraseña.
 */
public class VistaDatosTarjeta extends javax.swing.JPanel {
    private Ventana ventana;

    /**
     * Constructor de la clase VistaInicioSesion.
     * 
     * @param ventana La ventana principal de la aplicación.
     */
    public VistaDatosTarjeta(Ventana ventana) {
        this.ventana = ventana;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPagar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(350, 700));
        setMinimumSize(new java.awt.Dimension(350, 700));
        setPreferredSize(new java.awt.Dimension(350, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPagar.setBorder(null);
        btnPagar.setContentAreaFilled(false);
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 560, 110, 40));

        btnRegresar.setBorder(null);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 30, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datosTarjeta.png"))); // NOI18N
        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        ventana.mostrarConfirmacion("PEDIDO EXITOSO", "EXITO");
        ventana.cambiarVistaMenu();
    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        ventana.cambiarVistaMetodoPago();
    }//GEN-LAST:event_btnRegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel fondo;
    // End of variables declaration//GEN-END:variables
}
