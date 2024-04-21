package org.itson.disenosw.guis;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
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

/**
 * Esta clase representa la vista de inicio de sesión en la interfaz gráfica del
 * banco. Permite a los usuarios iniciar sesión proporcionando su nombre de
 * usuario y contraseña.
 */
public class PanelMenu extends javax.swing.JPanel {

    private final FramePrincipal framePrincipal;

    /**
     * Constructor de la clase VistaInicioSesion.
     *
     * @param framePrincipal
     */
    public PanelMenu(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
        initComponents();
        crearMenu();
//        fondo.setLocation(0, 0);
//        mostrarProductos(new ArrayList<>());

// Suponiendo que "fondo" es tu JLabel de fondo y "menuPanel" es tu JPanel de menú
// Obtén el contenedor principal del fondo
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCarrito = new javax.swing.JButton();
        btnUsuario = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        panelTop = new javax.swing.JPanel();
        lblFondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(400, 800));
        setMinimumSize(new java.awt.Dimension(400, 800));
        setPreferredSize(new java.awt.Dimension(400, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        btnBuscar.setBorder(null);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 117, 50, 50));

        btnOrdenar.setBorder(null);
        btnOrdenar.setContentAreaFilled(false);
        btnOrdenar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });
        add(btnOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 122, 50, 39));

        panelTop.setOpaque(false);
        add(panelTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 178, 370, 570));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panelMenu.png"))); // NOI18N
        lblFondo.setToolTipText("");
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarritoActionPerformed
        framePrincipal.setIdProducto(1);

        framePrincipal.cambiarVistaCarrito();
    }//GEN-LAST:event_btnCarritoActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOrdenarActionPerformed

    public void inicializarCarrito() {

    }

//    public void mostrarProductos(ArrayList<> productos) {
//
//        JPanel productosPanel = new JPanel(new GridLayout(0, 1));
//
//        for (Producto producto : productos) {
//            PanelProductos
//                    panelProducto = new PanelProductos(producto);
//            productosPanel.add(panelProducto);
//        }
//
//        JScrollPane scrollPane = new JScrollPane(productosPanel);
//        add(scrollPane);
//    }
    public void crearMenu() {
        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setOpaque(false);
        mainPanel.setMaximumSize(new Dimension(370, 550));// Elimina esta línea
        mainPanel.setSize(new Dimension(370, 550));

        List<String[]> productos = new ArrayList<>();
        productos.add(new String[]{"Hamburguesa clásica", "$120", "/productos/120x100/hamburguesa-clasica.jpg"});
        productos.add(new String[]{"Jamaica", "$25", "/productos/120x100/jamaica.jpg"});
        productos.add(new String[]{"Hamburguesa de pollo", "$150", "/productos/120x100/hamburguesa-pollo.jpg"});
        productos.add(new String[]{"Torta cubana", "$100", "/productos/120x100/torta-cubana.jpg"});
        productos.add(new String[]{"Torta cubana", "$100", "/productos/120x100/torta-cubana.jpg"});
        productos.add(new String[]{"Torta cubana", "$100", "/productos/120x100/torta-cubana.jpg"});
        productos.add(new String[]{"Torta cubana", "$100", "/productos/120x100/torta-cubana.jpg"});
        productos.add(new String[]{"Torta cubana", "$100", "/productos/120x100/torta-cubana.jpg"});

        GridBagConstraints c = new GridBagConstraints();

        //TODO no jala el insertar elemento de arriba a abajo, empiezan del centro
        c.anchor = GridBagConstraints.NORTH;

        // Iterar sobre la lista de productos y crear los paneles correspondientes
        for (int i = 0; i < productos.size(); i++) {
            String[] producto = productos.get(i);
            JPanel productoPanel = createProductoPanel(producto[0], producto[1], producto[2]);

            // Añade el panel del producto en la posición i * 2 (para dejar espacio para los separadores)
            c.gridx = 0;
            c.gridy = i * 2;
            mainPanel.add(productoPanel, c);

            // Añade un separador después de cada producto, excepto el último
            if (i < productos.size() - 1) {
                JPanel separatorPanel = createSeparatorPanel();
                c.gridx = 0;
                c.gridy = i * 2 + 1;
                mainPanel.add(separatorPanel, c);
            }

        }

        //TODO hacer el scrollPane un ScrollPaneWin11
        // Configurar el JScrollPane para desplazamiento vertical
        JScrollPane scrollPane = new JScrollPane(mainPanel);

        scrollPane.setPreferredSize(new Dimension(370, 550)); // Establece un tamaño predeterminado
        scrollPane.setMaximumSize(new Dimension(370, 550)); // Establece un tamaño máximo
        scrollPane.getViewport().setPreferredSize(new Dimension(370, 550)); // Establece un tamaño predeterminado para el viewport
        scrollPane.getViewport().setMaximumSize(new Dimension(370, 550)); // Establece un tamaño mínimo para el viewport
        scrollPane.getViewport().setSize(370, 550);

        scrollPane.setOpaque(false); // Hacer el JScrollPane transparente
        scrollPane.getViewport().setOpaque(false); // Hacer transparente el viewport del JScrollPane
        scrollPane.setBorder(null); // Eliminar el borde del JScrollPane
        scrollPane.getVerticalScrollBar().setUnitIncrement(16); // Ajustar la velocidad del scroll vertical
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER); // Ocultar la barra de desplazamiento horizontal

        JPanel cont = new JPanel();
        cont.add(scrollPane);
        cont.setOpaque(false);

//        this.setLayout(new BorderLayout());
        panelTop.add(cont);
//        
//        JLabel fondo = new javax.swing.JLabel();fondo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
//        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panelMenu.png"))); // NOI18N
//        fondo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
//        add(fondo,BorderLayout.CENTER);
        
        
        
//        Container contenedor = fondo.getParent();
// Asegúrate de que el contenedor utiliza un layout que soporte z-order, como JPanel
//        if (contenedor instanceof JPanel) {
//            JPanel panelContenedor = (JPanel) contenedor;
//            // Cambia el orden de los componentes para poner el menú encima del fondo
//            panelContenedor.setComponentZOrder(mainPanel, 0);
//            panelContenedor.setComponentZOrder(fondo, 1);
//            // Repinta el contenedor para reflejar los cambios
//            panelContenedor.revalidate();
//            panelContenedor.repaint();
//        }

    }

    /**
     * Crea un panel que muestra la información de un producto, incluyendo
     * nombre, precio e imagen.
     *
     * @param nombre El nombre del producto a mostrar.
     * @param precio El precio del producto a mostrar.
     * @param rutaImagen La ruta de la imagen del producto.
     * @return El panel del producto creado.
     */
    private static JPanel createProductoPanel(String nombre, String precio, String rutaImagen) {
        // Crear un nuevo panel para el producto con GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setOpaque(false); // Hacer que el fondo del panel sea transparente

        // Configuración de GridBagConstraints para organizar los componentes dentro del panel
        GridBagConstraints c = new GridBagConstraints();

        // Cargar la imagen del producto
        ImageIcon icon = new ImageIcon(PanelMenu.class.getResource(rutaImagen));
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
        JLabel precioLabel = new JLabel(precio);
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

        return panel; // Devuelve el panel del producto creado
    }

    /**
     * Crea un panel separador con una imagen personalizada. El panel separador
     * consiste en una imagen centrada verticalmente dentro de un panel que
     * actúa como un separador visual entre componentes.
     *
     * @return El panel separador creado.
     */
    private static JPanel createSeparatorPanel() {
        // Crear un nuevo panel para el separador
        JPanel panel = new JPanel();
        panel.setOpaque(false); // Hace que el panel sea transparente
        panel.setPreferredSize(new Dimension(350, 11)); // Establece el tamaño preferido del panel

        // Cargar la imagen del separador
        ImageIcon icon = new ImageIcon(PanelMenu.class.getResource("/separador.png"));

        // Crear una etiqueta para mostrar la imagen del separador
        JLabel imagen = new JLabel(icon);

        // Configurar el layout del panel como BoxLayout vertical
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Añadir pegamento vertical para centrar la imagen verticalmente
        panel.add(Box.createVerticalGlue());

        // Añadir la imagen al panel
        panel.add(imagen);

        // Añadir más pegamento vertical para centrar la imagen verticalmente
        panel.add(Box.createVerticalGlue());

        return panel; // Devuelve el panel separador creado
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
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCarrito;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JPanel panelTop;
    // End of variables declaration//GEN-END:variables
}
