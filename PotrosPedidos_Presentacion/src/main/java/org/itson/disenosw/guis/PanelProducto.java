package org.itson.disenosw.guis;

import control.ControlCarrito;
import control.ControlProductos;
import dominio.Producto;
import dominio.ProductoCafeteria;
import dominio.Usuario;
import dtos.UsuarioDTO;
import excepciones.PersistenciaException;
import excepciones.PersitenciaException;
import interfaces.IControlCarrito;
import interfaces.IControlProductos;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Esta clase representa la vista de inicio de sesión en la interfaz gráfica del
 * banco. Permite a los usuarios iniciar sesión proporcionando su nombre de
 * usuario y contraseña.
 */
public class PanelProducto extends javax.swing.JPanel {

    private final FramePrincipal framePrincipal;
    private static final Logger logger = Logger.getLogger(PanelProducto.class.getName());
//    AgregarCarritoBO agregarCarritoBO;
//    ConsultarProductoBO consultarProductoBO;
    IControlProductos control;
    ProductoCafeteria productoDTO;

    /**
     * Constructor de la clase VistaInicioSesion.
     *
     * @param framePrincipal
     */
    public PanelProducto(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
//        this.agregarCarritoBO = new AgregarCarritoBO();
//        this.consultarProductoBO = new ConsultarProductoBO();
        control = new ControlProductos();
        productoDTO = new ProductoCafeteria();
        initComponents();
        setFuentes();
        setDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregar = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btnMas = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();
        lblImagen = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(400, 800));
        setMinimumSize(new java.awt.Dimension(400, 800));
        setPreferredSize(new java.awt.Dimension(400, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setBorder(null);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 653, 171, 64));

        btnMenos.setBorder(null);
        btnMenos.setContentAreaFilled(false);
        btnMenos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });
        add(btnMenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 596, 40, 40));

        btnMas.setBorder(null);
        btnMas.setContentAreaFilled(false);
        btnMas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasActionPerformed(evt);
            }
        });
        add(btnMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 596, 40, 40));

        btnRegresar.setBorder(null);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 665, 40, 40));

        txtCantidad.setBackground(new java.awt.Color(250, 250, 250));
        txtCantidad.setForeground(new java.awt.Color(0, 0, 0));
        txtCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidad.setText("1");
        txtCantidad.setBorder(null);
        txtCantidad.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCantidad.setEnabled(false);
        add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 600, 40, 31));

        lblImagen.setText("jLabel1");
        add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 95, 400, 200));

        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 380, 30));

        lblPrecio.setForeground(new java.awt.Color(0, 0, 0));
        add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 345, 90, 31));

        lblDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        lblDescripcion.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 379, 380, 66));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panelProducto.png"))); // NOI18N
        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (txtCantidad.getText().isBlank()) {
            framePrincipal.mostrarAviso("El campo de cantidad no puede estar vacío", "Campo de cantidad vacío");
        } else {
            IControlCarrito controlC = new ControlCarrito();
            Usuario user = new Usuario();
            user.setIdCia(framePrincipal.getNumID());
            Producto pro = new Producto();
            String CodigoProducto;
            if (framePrincipal.getIdProducto() == 1) {
                CodigoProducto = "CCN025";
                try {
                    pro.setCodigoProducto(CodigoProducto);
                    controlC.agregarCarrito(user, pro, Integer.parseInt(txtCantidad.getText()));
                    framePrincipal.cambiarVistaCarrito();
                } catch (PersistenciaException ex) {
                    Logger.getLogger(PanelProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (framePrincipal.getIdProducto() == 2) {
                CodigoProducto = "SJL060";
                try {
                    pro.setCodigoProducto(CodigoProducto);
                    
                    controlC.agregarCarrito(user, pro, Integer.parseInt(txtCantidad.getText()));
                    framePrincipal.cambiarVistaCarrito();
                } catch (PersistenciaException ex) {
                    Logger.getLogger(PanelProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (framePrincipal.getIdProducto() == 3) {
                CodigoProducto = "CCL025";
                try {
                    pro.setCodigoProducto(CodigoProducto);
                    controlC.agregarCarrito(user, pro, Integer.parseInt(txtCantidad.getText()));
                    framePrincipal.cambiarVistaCarrito();
                } catch (PersistenciaException ex) {
                    Logger.getLogger(PanelProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (framePrincipal.getIdProducto() == 4) {
                CodigoProducto = "TML065";
                try {
                    pro.setCodigoProducto(CodigoProducto);
                    controlC.agregarCarrito(user, pro, Integer.parseInt(txtCantidad.getText()));
                    framePrincipal.cambiarVistaCarrito();
                } catch (PersistenciaException ex) {
                    Logger.getLogger(PanelProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (framePrincipal.getIdProducto() == 5) {
                CodigoProducto = "HCL080";
                try {
                    pro.setCodigoProducto(CodigoProducto);
                    controlC.agregarCarrito(user, pro, Integer.parseInt(txtCantidad.getText()));
                    framePrincipal.cambiarVistaCarrito();
                } catch (PersistenciaException ex) {
                    Logger.getLogger(PanelProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (framePrincipal.getIdProducto() == 6) {
                CodigoProducto = "SCL100";
                try {
                    pro.setCodigoProducto(CodigoProducto);
                    controlC.agregarCarrito(user, pro, Integer.parseInt(txtCantidad.getText()));
                    framePrincipal.cambiarVistaCarrito();
                } catch (PersistenciaException ex) {
                    Logger.getLogger(PanelProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (framePrincipal.getIdProducto() == 7) {
                CodigoProducto = "TCL070";
                try {
                    pro.setCodigoProducto(CodigoProducto);
                    controlC.agregarCarrito(user, pro, Integer.parseInt(txtCantidad.getText()));
                    framePrincipal.cambiarVistaCarrito();
                } catch (PersistenciaException ex) {
                    Logger.getLogger(PanelProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (framePrincipal.getIdProducto() == 8) {
                CodigoProducto = "HPL085";
                try {
                    pro.setCodigoProducto(CodigoProducto);
                    controlC.agregarCarrito(user, pro, Integer.parseInt(txtCantidad.getText()));
                    framePrincipal.cambiarVistaCarrito();
                } catch (PersistenciaException ex) {
                    Logger.getLogger(PanelProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (framePrincipal.getIdProducto() == 9) {
                CodigoProducto = "CCZ025";
                try {
                    pro.setCodigoProducto(CodigoProducto);
                    controlC.agregarCarrito(user, pro, Integer.parseInt(txtCantidad.getText()));
                    framePrincipal.cambiarVistaCarrito();
                } catch (PersistenciaException ex) {
                    Logger.getLogger(PanelProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (framePrincipal.getIdProducto() == 10) {
                CodigoProducto = "AJL020";
                try {
                    pro.setCodigoProducto(CodigoProducto);
                    controlC.agregarCarrito(user, pro, Integer.parseInt(txtCantidad.getText()));
                    framePrincipal.cambiarVistaCarrito();
                } catch (PersistenciaException ex) {
                    Logger.getLogger(PanelProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

//            try {
//            Productos producto = new Productos();
//            producto.generarLista();
//            Usuario usuario = new Usuario();
//            System.out.println(framePrincipal.getIdProducto());
//            EntityManagerFactory entity = Persistence.createEntityManagerFactory("conexionPU");
//            EntityManager entityManager = entity.createEntityManager();
//            entityManager.getTransaction().begin();
//            entityManager.persist(usuario);
//            entityManager.getTransaction().commit();
//            List<Productos> productos = producto.getProductos();
//            IConsultarProducto pro = new ConsultarProducto();
//            Carrito carrito = new Carrito();
//            IAgregarCarrito cart = new AgregarCarrito(carrito);
////            cart.agregarCarrito(pro.consultarProducto(framePrincipal.getIdProducto()), Integer.valueOf(txtCantidad.getText()), usuario);
//            cart.agregarCarrito(pro.consultarProducto(framePrincipal.getIdProducto()), Integer.valueOf(txtCantidad.getText()), usuario);
//
//                agregarCarritoBO.agregarCarrito(consultarProductoBO.consultarProductoID(framePrincipal.getIdProducto()), framePrincipal.getNumID(), Integer.decode(txtCantidad.getText()), framePrincipal.getIdProducto());
//
//            } catch (PersitenciaException ex) {
//                Logger.getLogger(PanelProducto.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            framePrincipal.setIdProducto(null);
//            framePrincipal.cambiarVistaCarrito();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        framePrincipal.setIdProducto(null);
        framePrincipal.cambiarVistaMenu();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        Integer cantidad = Integer.valueOf(txtCantidad.getText());
        if (cantidad > 1) {
            txtCantidad.setText(String.valueOf(cantidad - 1));
        }
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasActionPerformed
        Integer cantidad = Integer.valueOf(txtCantidad.getText());
        if (cantidad < 99) {
            txtCantidad.setText(String.valueOf(cantidad + 1));
        }
    }//GEN-LAST:event_btnMasActionPerformed

//    private void setDatos() {
//        try {
//            consultarProducto();
//        } catch (PersistenciaException ex) {
//            logger.log(Level.SEVERE, "Producto no encontrado");
//        }
//        lblNombre.setText(productoDTO.getNombre().toUpperCase());
//        String precioFormateado = String.valueOf(productoDTO.getPrecio());
//        if (precioFormateado.endsWith(".0")) {
//            precioFormateado = precioFormateado.substring(0, precioFormateado.length() - 2);
//        }
//        lblPrecio.setText("$" + precioFormateado);
//        try {
//            lblDescripcion.setText(productoDTO.getDescripcion());
//        } catch (NullPointerException e) {
//            logger.log(Level.INFO, "El producto no tiene descrpición");
//        }
//        String rutaFolder = "/productos/400x200/";
//        StringBuilder rutaRelativa = new StringBuilder();
//        rutaRelativa.append(rutaFolder);
//        rutaRelativa.append(productoDTO.getDireccionImagen());
//
//        // Cargar la imagen del producto
//        ImageIcon icon = new ImageIcon(PanelMenu.class.getResource(String.valueOf(rutaRelativa)));
//
//        lblImagen.setIcon(icon);
//    }
//    private void setDatos() {
//        try {
//            // Consultar la información del producto desde la base de datos
//            
//            Long idProducto = framePrincipal.getIdProducto();
//            IControlProductos consultarProductoBO = new ControlProductos();
//            productos = consultarProductoBO.obtenerTodosLosProductos();
//            p pro = consultarProductoBO.buscarProductoCafeteriaPorID(idProducto);
//            // Actualizar los componentes del panel con la información del producto
//            lblNombre.setText(productoDTO.getNombre().toUpperCase());
//            String precioFormateado = String.valueOf(productoDTO.getPrecio());
//            if (precioFormateado.endsWith(".0")) {
//                precioFormateado = precioFormateado.substring(0, precioFormateado.length() - 2);
//            }
//            lblPrecio.setText("$" + precioFormateado);
//            lblDescripcion.setText(productoDTO.getDescripcion());
//
//            // Cargar la imagen del producto
//            ImageIcon icon = new ImageIcon(PanelProducto.class.getResource(productoDTO.getDireccionImagen()));
//            lblImagen.setIcon(icon);
//
//        } catch (PersitenciaException ex) {
//            logger.log(Level.SEVERE, "Producto no encontrado", ex);
//        }
//    }
//    private void setDatos() {
//
//        try {
//            consultarProducto();
//        } catch (PersitenciaException ex) {
//            logger.log(Level.SEVERE, "Producto no encontrado");
//        }
//        lblNombre.setText(productoDTO.getNombre().toUpperCase());
//        try {
//            lblDescripcion.setText(productoDTO.getDescripcion());
//        } catch (NullPointerException e) {
//            logger.log(Level.INFO, "El producto no tiene descrpición");
//        }
//        lblPrecio.setText(String.valueOf(productoDTO.getPrecio()));
//        String rutaFolder = "/productos/370x150/";
//        StringBuilder rutaRelativa = new StringBuilder();
//        rutaRelativa.append(rutaFolder);
//        rutaRelativa.append(productoDTO.getDireccionImagen());
//
//        // Cargar la imagen del producto
//        // Cargar la imagen del producto
//        ImageIcon icon = new ImageIcon(PanelMenu.class.getResource(rutaRelativa.toString()));
//
//        lblImagen.setIcon(icon);
//
//    }
//
//    private void consultarProducto() throws PersitenciaException {
//        Long idProducto = framePrincipal.getIdProducto();
//        productoDTO = control.buscarProductoCafeteriaPorID(idProducto);
//    }
    private void setDatos() {
        try {
            consultarProducto();
        } catch (PersitenciaException ex) {
            logger.log(Level.SEVERE, "Producto no encontrado");
        }
        lblNombre.setText(productoDTO.getNombre().toUpperCase());
        lblDescripcion.setText(productoDTO.getDescripcion());
        lblPrecio.setText(String.valueOf(productoDTO.getPrecio()));

        // Cargar la imagen del producto
        String rutaFolder = "/productos/400x200/";
        StringBuilder rutaRelativa = new StringBuilder();
        rutaRelativa.append(rutaFolder);
        rutaRelativa.append(productoDTO.getDireccionImagen());

        // Cargar la imagen del producto
        ImageIcon icon = new ImageIcon(PanelMenu.class.getResource(String.valueOf(rutaRelativa)));

        lblImagen.setIcon(icon);
    }

    private void consultarProducto() throws PersitenciaException {
        Long idProducto = framePrincipal.getIdProducto();
        productoDTO = control.buscarProductoCafeteriaPorID(idProducto);
    }

    private void setFuentes() {
        Font sizedFontMedium = cargarFuente("/fonts/futura/FuturaPTMedium.otf", 30F);
        Font sizedFontLight = cargarFuente("/fonts/futura/FuturaPTLight.otf", 26F);
        Font sizedFontBook = cargarFuente("/fonts/futura/FuturaPTBook.otf", 24F);
        Font sizedFontBook26 = cargarFuente("/fonts/futura/FuturaPTBook.otf", 26F);

        lblNombre.setFont(sizedFontMedium);
        lblDescripcion.setFont(sizedFontLight);
        lblPrecio.setFont(sizedFontBook);
        txtCantidad.setFont(sizedFontBook26);

    }

    /**
     * Carga una fuente desde un archivo de fuente TrueType (TTF) y la devuelve
     * con el tamaño especificado.
     *
     * @param rutaFuente La ruta del archivo de fuente TrueType (TTF).
     * @param size El tamaño de la fuente a cargar.
     * @return La fuente cargada con el tamaño especificado.
     * @throws IllegalArgumentException Si el archivo de fuente no se encuentra
     * en la ruta especificada.
     */
    private static Font cargarFuente(String rutaFuente, float size) {
        InputStream is = PanelMenu.class.getResourceAsStream(rutaFuente);
        if (is == null) {
            throw new IllegalArgumentException("Archivo no encontrado: " + rutaFuente);
        }
        try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, is);
            return font.deriveFont(size);
        } catch (FontFormatException | IOException ex) {
            Logger.getLogger(PanelMenu.class.getName()).log(Level.SEVERE, "Error al cargar la fuente: " + rutaFuente, ex);
            return null;
        } finally {
            try {
                is.close();
            } catch (IOException ex) {
                Logger.getLogger(PanelMenu.class.getName()).log(Level.SEVERE, "Error al cerrar InputStream", ex);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}
