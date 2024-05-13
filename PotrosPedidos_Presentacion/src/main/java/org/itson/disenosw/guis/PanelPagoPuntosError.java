package org.itson.disenosw.guis;

import BOs.UsuarioBO;
import Interfaz.IUsuarioBO;
import control.ControlUsuario;
import dominio.DetalleProducto;
import dominio.Usuario;
import interfaces.ICalcularCostoPuntos;
import interfaces.IControlUsuario;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import metodos.CalcularCostoPuntos;



/**
 * Esta clase representa la vista de inicio de sesión en la interfaz gráfica del banco.
 * Permite a los usuarios iniciar sesión proporcionando su nombre de usuario y contraseña.
 */
public class PanelPagoPuntosError extends javax.swing.JPanel {
    private FramePrincipal ventana;

    /**
     * Constructor de la clase VistaInicioSesion.
     * 
     * @param ventana La ventana principal de la aplicación.
     */
    public PanelPagoPuntosError(FramePrincipal ventana) {
        try {
            this.ventana = ventana;
            initComponents();
            
            IUsuarioBO usuarioBO= new UsuarioBO();
            IControlUsuario user = new ControlUsuario();
            Usuario u = new Usuario();
            u.setIdCia(ventana.getNumID());
            Usuario usuarioBueno= usuarioBO.consultarUsuario(u);
            List<DetalleProducto> detallesCarritos = usuarioBueno.getCarrito().getProductos();
            ICalcularCostoPuntos calcularPuntos= new CalcularCostoPuntos();
            
            lblPuntosDisponibles.setText(usuarioBueno.getSaldoPuntos().toString()+ " puntos"); 
            lblPuntosRequeridos.setText(calcularPuntos.calcularCostoPuntos(detallesCarritos)+ " puntos");
        } catch (Exception ex) {
            Logger.getLogger(PanelPagoPuntosError.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPuntosDisponibles = new javax.swing.JLabel();
        lblPuntosRequeridos = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(400, 800));
        setMinimumSize(new java.awt.Dimension(400, 800));
        setPreferredSize(new java.awt.Dimension(400, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(lblPuntosDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 360, 40));
        add(lblPuntosRequeridos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 360, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panelPagoPuntosError.png"))); // NOI18N
        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel lblPuntosDisponibles;
    private javax.swing.JLabel lblPuntosRequeridos;
    // End of variables declaration//GEN-END:variables
}