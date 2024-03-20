package GUI;


/**
 * Esta clase representa la vista de inicio de sesión en la interfaz gráfica del banco.
 * Permite a los usuarios iniciar sesión proporcionando su nombre de usuario y contraseña.
 */
public class VistaMetodoPago extends javax.swing.JPanel {
    private Ventana ventana;

    /**
     * Constructor de la clase VistaInicioSesion.
     * 
     * @param ventana La ventana principal de la aplicación.
     */
    public VistaMetodoPago(Ventana ventana) {
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

        btnTarjeta = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(350, 700));
        setMinimumSize(new java.awt.Dimension(350, 700));
        setPreferredSize(new java.awt.Dimension(350, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTarjeta.setBorder(null);
        btnTarjeta.setContentAreaFilled(false);
        btnTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTarjetaActionPerformed(evt);
            }
        });
        add(btnTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 120, 60));

        btnRegresar.setBorder(null);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 40, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodoPago.png"))); // NOI18N
        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTarjetaActionPerformed
        ventana.cambiarVistaDatosTarjeta();
    }//GEN-LAST:event_btnTarjetaActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        ventana.cambiarVistaCarrito();
    }//GEN-LAST:event_btnRegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnTarjeta;
    private javax.swing.JLabel fondo;
    // End of variables declaration//GEN-END:variables
}
