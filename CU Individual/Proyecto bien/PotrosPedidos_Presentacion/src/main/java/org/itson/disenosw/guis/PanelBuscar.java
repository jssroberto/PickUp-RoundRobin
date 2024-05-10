package org.itson.disenosw.guis;

import DAOs.ProductoDAO;
import busquedaDinamica.Busqueda;
import dominio.DetalleCarrito;
import dominio.Producto;
import excepciones.ExcepcionAT;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import mocks.DetalleCarrito;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.itson.disenosw.dtos.ProductoDTO;

/**
 *
 * @author Roberto García
 */
public class PanelBuscar extends javax.swing.JPanel {

    private FramePrincipal framePrincipal;
    private Integer idProducto = 0;
    List<Producto> productos;

    Producto producto = new Producto();

    /**
     * Creates new form PanelBuscar
     */
    public PanelBuscar(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
        initComponents();
        producto.generarLista();
        productos = producto.getProductos();
        try {
            crearMenu();
        } catch (ExcepcionAT ex) {
            framePrincipal.mostrarAviso("No se pudieron cosultar los prosuctos", "Error al consultar menú");
        }
        buscador.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                try {
                    buscarProductosSimilares(buscador.getText());
                } catch (ExcepcionAT ex) {
                    Logger.getLogger(PanelBuscar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                try {
                    buscarProductosSimilares(buscador.getText());
                } catch (ExcepcionAT ex) {
                    Logger.getLogger(PanelBuscar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                try {
                    buscarProductosSimilares(buscador.getText());
                } catch (ExcepcionAT ex) {
                    Logger.getLogger(PanelBuscar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

  private void buscarProductosSimilares(String textoBusqueda) throws ExcepcionAT {
    if (textoBusqueda.isEmpty()) {
        // Si el texto de búsqueda está vacío, mostrar todos los productos
        productos = producto.getProductos();
    } else {
        // Aplicar filtro de búsqueda
        List<Producto> productosSimilares = new ArrayList<>();
        ProductoDAO b = new ProductoDAO();
        productosSimilares = b.BuscarProductos(textoBusqueda);

        // Actualizar la lista de productos con los encontrados
        productos = productosSimilares;
    }

    panelTop.removeAll();
    panelTop.revalidate();
    panelTop.repaint();

    // Volver a crear el menú con los productos encontrados
    try {
        crearMenu();
    } catch (ExcepcionAT excepcionAT) {
        excepcionAT.printStackTrace();
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar3 = new javax.swing.JButton();
        panelTop = new javax.swing.JPanel();
        btnCarrito = new javax.swing.JButton();
        btnUsuario = new javax.swing.JButton();
        buscador = new javax.swing.JTextField();
        lblBuscar = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(400, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar3.setBorder(null);
        btnRegresar3.setContentAreaFilled(false);
        btnRegresar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar3ActionPerformed(evt);
            }
        });
        add(btnRegresar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 700, 50, 50));

        panelTop.setOpaque(false);
        add(panelTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 370, 500));

        btnCarrito.setBorder(null);
        btnCarrito.setContentAreaFilled(false);
        btnCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarritoActionPerformed(evt);
            }
        });
        add(btnCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 15, 50, 50));

        btnUsuario.setBorder(null);
        btnUsuario.setContentAreaFilled(false);
        btnUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });
        add(btnUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 15, 50, 50));

        buscador.setBackground(new java.awt.Color(250, 250, 250));
        buscador.setForeground(new java.awt.Color(0, 0, 0));
        buscador.setBorder(null);
        buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscadorActionPerformed(evt);
            }
        });
        buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscadorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscadorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscadorKeyTyped(evt);
            }
        });
        add(buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 123, 276, 31));

        lblBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pa.png"))); // NOI18N
        add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarritoActionPerformed

        framePrincipal.setIdProducto(1L);

        framePrincipal.cambiarVistaCarrito();
    }//GEN-LAST:event_btnCarritoActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void buscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorActionPerformed

    private void btnRegresar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar3ActionPerformed
        framePrincipal.cambiarVistaMenu();
    }//GEN-LAST:event_btnRegresar3ActionPerformed

    private void buscadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorKeyPressed

    private void buscadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorKeyTyped

    private void buscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorKeyReleased
        if (evt.getKeyCode() != KeyEvent.VK_ENTER) {
            try {
                // Evitar activar la búsqueda al presionar Enter
                buscarProductosSimilares(buscador.getText());
            } catch (ExcepcionAT ex) {
                Logger.getLogger(PanelBuscar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_buscadorKeyReleased
    /**
     * Método para crear el menú de productos similares.
     *
     * @throws ExcepcionAT Si ocurre un error al crear el menú.
     */
 public void crearMenu() throws ExcepcionAT {
    JPanel mainPanel = new JPanel(new GridBagLayout());
    mainPanel.setOpaque(false);
    mainPanel.setMaximumSize(new Dimension(370, 510));

    GridBagConstraints c = new GridBagConstraints();
    c.anchor = GridBagConstraints.NORTH; // Alineación superior

    int currentGridY = 0; // Variable para controlar la posición vertical de los elementos

    for (Producto producto : productos) {
        if (!producto.getNombre().toLowerCase().contains(buscador.getText().toLowerCase())) {
            continue; // Ignorar productos que no coincidan con la búsqueda
        }

        JPanel productoPanel = createProductoPanel(producto.getNombre(),
                producto.getPrecio(), producto.getDireccionImagen());

        Long identificador = producto.getId();
        productoPanel.putClientProperty(identificador, productoPanel);

        productoPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    verificarProductoEnCarrito(identificador);
                    framePrincipal.setIdProducto(identificador);
                    framePrincipal.cambiarVistaProducto();
                } catch (Exception ex) {
                    framePrincipal.mostrarAviso(ex.getMessage(), "Aviso");
                }
            }
        });

        c.gridx = 0;
        c.gridy = currentGridY++; // Incrementar la posición vertical al agregar un producto
        c.gridheight = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(productoPanel, c);

        // Agregar separador si no es el último producto
        if (currentGridY < productos.size()) {
            JPanel separatorPanel = createSeparatorPanel();
            c.gridx = 0;
            c.gridy = currentGridY++; // Incrementar la posición vertical para el separador
            mainPanel.add(separatorPanel, c);
        }

        productoPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    JScrollPane scrollPane = new JScrollPane(mainPanel);
    scrollPane.setPreferredSize(new Dimension(370, 510));
    scrollPane.setMaximumSize(new Dimension(370, 510));
    scrollPane.getViewport().setPreferredSize(new Dimension(370, 510));
    scrollPane.getViewport().setMaximumSize(new Dimension(370, 510));
    scrollPane.setOpaque(false);
    scrollPane.getViewport().setOpaque(false);
    scrollPane.setBorder(null);
    scrollPane.getVerticalScrollBar().setUnitIncrement(16);
    scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

    JPanel cont = new JPanel();
    cont.add(scrollPane);
    cont.setOpaque(false);

    panelTop.add(cont);
}

    /**
     * Crea un panel que muestra la información de un producto.
     *
     * @param nombre El nombre del producto.
     * @param precio El precio del producto.
     * @param rutaImagen La ruta de la imagen del producto.
     * @return El panel del producto creado.
     */
    private JPanel createProductoPanel(String nombre, Float precio, String rutaImagen) {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setOpaque(false);

        GridBagConstraints c = new GridBagConstraints();

        // Cargar la imagen del producto
        ImageIcon icon = new ImageIcon(PanelBuscar.class
                .getResource("/productos/120x100/" + rutaImagen));
        JLabel imagenLabel = new JLabel(icon);

        Font sizedFontMedium = cargarFuente("/fonts/futura/FuturaPTMedium.otf", 24F);
        Font sizedFontBook = cargarFuente("/fonts/futura/FuturaPTBook.otf", 24F);

        // Configurar la etiqueta del nombre del producto
        JLabel nombreLabel = new JLabel(nombre);
        nombreLabel.setFont(sizedFontMedium);
        nombreLabel.setForeground(Color.BLACK);
        nombreLabel.setPreferredSize(new Dimension(240, 31));
        nombreLabel.setVerticalAlignment(SwingConstants.CENTER);

        // Configurar la etiqueta del precio
        JLabel precioLabel = new JLabel(String.valueOf(precio));
        precioLabel.setFont((sizedFontBook));
        precioLabel.setForeground(Color.BLACK);
        precioLabel.setPreferredSize(new Dimension(110, 31));
        precioLabel.setVerticalAlignment(SwingConstants.TOP);

        // Añadir la imagen a la parte derecha del panel
        c.gridx = 1;
        c.gridy = 0;
        c.gridheight = 2;
        c.fill = GridBagConstraints.BOTH;
        panel.add(imagenLabel, c);

        // Añadir la etiqueta del nombre del producto en la primera fila y primera columna
        c.gridx = 0;
        c.gridy = 0;
        c.gridheight = 1;
        panel.add(nombreLabel, c);

        // Añadir la etiqueta del precio en la segunda fila y primera columna
        c.gridx = 0;
        c.gridy = 1;
        panel.add(precioLabel, c);

        return panel;
    }

    /**
     * Crea un panel separador.
     *
     * @return El panel separador creado.
     */
    private static JPanel createSeparatorPanel() {
        JPanel panel = new JPanel();
        panel.setOpaque(false);
        panel.setPreferredSize(new Dimension(350, 11));

        ImageIcon icon = new ImageIcon(PanelBuscar.class
                .getResource("/separador.png"));
        JLabel imagen = new JLabel(icon);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(Box.createVerticalGlue());
        panel.add(imagen);
        panel.add(Box.createVerticalGlue());

        return panel;

    }

    /**
     * Carga una fuente desde un archivo de fuente TrueType (TTF).
     *
     * @param rutaFuente La ruta del archivo de fuente TrueType (TTF).
     * @param size El tamaño de la fuente a cargar.
     * @return La fuente cargada con el tamaño especificado.
     * @throws IllegalArgumentException Si el archivo de fuente no se encuentra.
     */
    private static Font cargarFuente(String rutaFuente, float size) {
        InputStream is = PanelBuscar.class
                .getResourceAsStream(rutaFuente);
        if (is == null) {
            throw new IllegalArgumentException("Archivo no encontrado: " + rutaFuente);
        }

        try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, is);
            return font.deriveFont(size);

        } catch (FontFormatException | IOException ex) {
            Logger.getLogger(PanelBuscar.class
                    .getName()).log(Level.SEVERE, "Error al cargar la fuente: " + rutaFuente, ex);
            return null;
        } finally {
            try {
                is.close();

            } catch (IOException ex) {
                Logger.getLogger(PanelBuscar.class
                        .getName()).log(Level.SEVERE, "Error al cerrar InputStream", ex);
            }
        }
    }

    /**
     * Verifica si un producto ya está en el carrito.
     *
     * @param identificador El identificador del producto.
     * @throws Exception Si el producto ya está en el carrito.
     */
    public void verificarProductoEnCarrito(Long identificador) throws Exception {
        DetalleCarrito detalleCarrito = new DetalleCarrito();
        detalleCarrito.generarLista();
        List<DetalleCarrito> detalleCarritos = detalleCarrito.getDetalles();

        for (DetalleCarrito detalle : detalleCarritos) {
            if (detalle.getProducto().getId().equals(identificador)) {
                throw new Exception("El producto ya existe en el carrito");
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarrito;
    private javax.swing.JButton btnRegresar3;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JTextField buscador;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JPanel panelTop;
    // End of variables declaration//GEN-END:variables

}
