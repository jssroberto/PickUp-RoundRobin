package org.itson.disenosw.guis;

//import Incerciones.InsercionMasivaBanco;
import control.ControlLogin;
import control.ControlProductos;
import control.ControlUsuario;
import dtos.UsuarioDTO;
import interfaces.IControlLogin;
import interfaces.IControlProductos;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import interfaces.IControlUsuario;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase representa la vista de inicio de sesión en la interfaz gráfica del
 * banco. Permite a los usuarios iniciar sesión proporcionando su nombre de
 * usuario y contraseña.
 */
public class PanelInicioSesion extends javax.swing.JPanel {

    private final FramePrincipal framePrincipal;

    /**
     * Constructor de la clase VistaInicioSesion.
     *
     * @param framePrincipal La framePrincipal principal de la aplicación.
     */
    public PanelInicioSesion(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
        initComponents();
        setFonts();
        try {
            setRegistros();
        } catch (Exception ex) {
            framePrincipal.mostrarAviso("Vuelvalo a intentar", "Aviso");
        }
        ((AbstractDocument) txtId.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
                String newText = fb.getDocument().getText(0, fb.getDocument().getLength()) + text;
                if (newText.matches("[0-9]*")) { // Solo permite números
                    super.insertString(fb, offset, text, attr);
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                String newText = fb.getDocument().getText(0, fb.getDocument().getLength()) + text;
                if (newText.matches("[0-9]*")) { // Solo permite números
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtId = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        btnAcercaDe = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(400, 800));
        setMinimumSize(new java.awt.Dimension(400, 800));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(400, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtId.setBackground(new java.awt.Color(250, 250, 250));
        txtId.setBorder(null);
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 343, 352, 31));

        txtContraseña.setBackground(new java.awt.Color(250, 250, 250));
        txtContraseña.setBorder(null);
        add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 436, 352, 31));

        btnIngresar.setBorder(null);
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 504, 159, 50));

        btnAcercaDe.setBorder(null);
        btnAcercaDe.setContentAreaFilled(false);
        btnAcercaDe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcercaDeActionPerformed(evt);
            }
        });
        add(btnAcercaDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 10, 66, 38));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panelInicioSesion.png"))); // NOI18N
        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        if (txtId.getText().isBlank() || txtContraseña.getPassword().length == 0) {
            framePrincipal.mostrarAviso("Es necesario llenar todos los campos", "Campos inválidos");
        } else {

            //TODO
            //la contraseña no se debería mandar como string
            //el metodo validar persona debería lanzar excepcion y cacharse aquí
            IControlLogin control = new ControlLogin();

            try {
                if (control.validacionDatos(txtId.getText(), txtContraseña.getText())) {
                    IControlUsuario controlUsuario = new ControlUsuario();
                    UsuarioDTO usuarioDTO = controlUsuario.consultarUsuario(txtId.getText());
                    framePrincipal.setIdUsuario(usuarioDTO.getId());

                    framePrincipal.setNumID(txtId.getText());
                    IControlProductos consultarProductoBO = new ControlProductos();
                    framePrincipal.setProductos(consultarProductoBO.obtenerTodosLosProductos());
                    framePrincipal.cambiarVistaMenu();
                } else {
                    framePrincipal.mostrarAviso("Credenciales no válidas", "Aviso");
                }
            } catch (IllegalArgumentException ex) {
                framePrincipal.mostrarAviso("Vuelva a intentarlo", "Aviso");
            } catch (Exception ex) {
                framePrincipal.mostrarAviso("Vuelva a intentarlo", "Aviso");
            }
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcercaDeActionPerformed
        framePrincipal.mostrarInformacion("Equipo Round Robin ;)", "Cafetería Potros");
    }//GEN-LAST:event_btnAcercaDeActionPerformed

    public void setRegistros() throws Exception {
////    InsercionMasivaUsuariosCIA cia = new InsercionMasivaUsuariosCIA();
////    InsercionMasivaProductosCafeteriaBO cafeteria = new InsercionMasivaProductosCafeteriaBO();
////    InsercionMasivaBanco banco = new InsercionMasivaBanco();
////    try {
////        if (!cia.datosExisten()) {
////            cia.insertarRegistros();
////        }
////        if (!cafeteria.datosExisten()) {
////            cafeteria.insertarRegistros();
////        }
////        if (!banco.datosExisten()) {
////            banco.insertarRegistros();
////        }
////    } catch (Exception e) {
////        throw new Exception(e.getMessage());
////    }
////}
////
    }

    private void setFonts() {
        try {
            InputStream is = PanelInicioSesion.class.getResourceAsStream("/fonts/futura/FuturaPTBook.otf");
            Font font = Font.createFont(Font.TRUETYPE_FONT, is);
            Font sizedFont = font.deriveFont(24F);
            txtId.setFont(sizedFont);
            txtContraseña.setFont(sizedFont);
        } catch (FontFormatException | IOException e) {
            framePrincipal.mostrarAviso(e.getMessage(), "Aviso");

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcercaDe;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel fondo;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
