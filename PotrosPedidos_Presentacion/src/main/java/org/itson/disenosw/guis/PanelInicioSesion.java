package org.itson.disenosw.guis;

import BOs.InsercionMasivaProductos;
import BOs.InsercionMasivaProductosCafeteriaBO;
import BOs.InsercionMasivaUsuarios;
import BOs.InsercionMasivaUsuariosCIA;
import BOs.VerificarPersonaBO;
import BOs.insercionMasivaBanco;
import SubsistemaCIA.IValidarPersona;
import SubsistemaCIA.ValidarPersona;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import mocks.Usuario;
import org.itson.disenosw.dtos.UsuarioDTO;

/**
 * Esta clase representa la vista de inicio de sesión en la interfaz gráfica del
 * banco. Permite a los usuarios iniciar sesión proporcionando su nombre de
 * usuario y contraseña.
 */
public class PanelInicioSesion extends javax.swing.JPanel {

    private FramePrincipal framePrincipal;

    /**
     * Constructor de la clase VistaInicioSesion.
     *
     * @param framePrincipal La framePrincipal principal de la aplicación.
     */
    public PanelInicioSesion(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
        initComponents();
//        usuario.generarLista();
        setFonts();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtID = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        txtContraseña = new javax.swing.JPasswordField();
        fondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(400, 800));
        setMinimumSize(new java.awt.Dimension(400, 800));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(400, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtID.setBackground(new java.awt.Color(250, 250, 250));
        txtID.setForeground(new java.awt.Color(0, 0, 0));
        txtID.setBorder(null);
        add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 261, 342, 31));

        btnIngresar.setBorder(null);
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 422, 159, 50));

        txtContraseña.setBackground(new java.awt.Color(250, 250, 250));
        txtContraseña.setForeground(new java.awt.Color(0, 0, 0));
        txtContraseña.setBorder(null);
        add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 354, 340, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panelInicioSesion.png"))); // NOI18N
        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        if (txtID.getText().isBlank() || txtContraseña.getPassword().length == 0) {
            framePrincipal.mostrarAviso("Es necesario llenar todos los campos", "Campos inválidos");
        } else {

            InsercionMasivaUsuariosCIA cia = new InsercionMasivaUsuariosCIA();
            cia.insercion();
            InsercionMasivaProductosCafeteriaBO cafe = new InsercionMasivaProductosCafeteriaBO();
            cafe.insercion();
            InsercionMasivaUsuarios usu = new InsercionMasivaUsuarios();
            usu.insercion();
            InsercionMasivaProductos pro = new InsercionMasivaProductos();
            pro.Insercion();
            insercionMasivaBanco banco = new insercionMasivaBanco();
            banco.insercion();
            VerificarPersonaBO vp = new VerificarPersonaBO();
            //TODO
            //la contraseña no se debería mandar como string
            //el metodo validar persona debería lanzar excepcion y cacharse aquí
            UsuarioDTO u = new UsuarioDTO(new String(txtContraseña.getPassword()), txtID.getText());
            try {
                if (vp.buscarPersona(txtID.getText(), txtContraseña.getText())) {
                    framePrincipal.setNumID(txtID.getText());
                    framePrincipal.cambiarPanelMenu2();
                } else {
                    framePrincipal.mostrarAviso("No se encontró un usuario con\nlas credenciales proporcionadas", "Usuario inválido");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void setFonts() {
        try {
            InputStream is = PanelInicioSesion.class.getResourceAsStream("/fonts/futura/FuturaPTBook.otf");
            Font font = Font.createFont(Font.TRUETYPE_FONT, is);
            Font sizedFont = font.deriveFont(24F);
            txtID.setFont(sizedFont);
            txtContraseña.setFont(sizedFont);
        } catch (FontFormatException | IOException e) {
            framePrincipal.mostrarAviso(e.getMessage(), "Aviso");

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel fondo;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
