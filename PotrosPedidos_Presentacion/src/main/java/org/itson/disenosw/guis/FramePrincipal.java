package org.itson.disenosw.guis;

import dominio.ProductoCafeteria;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * La clase Ventana representa la ventana principal de la aplicación bancaria.
 * Se encarga de gestionar la navegación entre diferentes vistas de la interfaz
 * de usuario, así como de interactuar con el usuario mediante ventanas
 * emergentes. También mantiene instancias de DTOs y una conexión a la base de
 * datos.
 *
 * @author José Karim Franco Valencia - 245138
 * @author Jesús Roberto García Armenta - 244913
 */
public class FramePrincipal extends javax.swing.JFrame {

    private JPanel panelActual;
    private String codigoProducto;
    private String claveRecoleccion;
    private int idPedido = 0;
    private float totalCarrito = 0.0f;
    private String numID;
    private List<ProductoCafeteria> productos;
    private String idUsuario;
    private String etiquetaPedido;

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getClaveRecoleccion() {
        return claveRecoleccion;
    }

    public void setClaveRecoleccion(String claveRecoleccion) {
        this.claveRecoleccion = claveRecoleccion;
    }

    
    public float getTotalCarrito() {
        return totalCarrito;
    }

    public void setTotalCarrito(float totalCarrito) {
        this.totalCarrito = totalCarrito;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    
    

    public List<ProductoCafeteria> getProductos() {
        return productos;
    }

    public void setProductos(List<ProductoCafeteria> productos) {
        this.productos = productos;
    }
    
    

    /**
     * Constructor de la clase Ventana.
     */
    public FramePrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Potro Pedidos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(400, 800));
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    /**
     * Método para limpiar el contenido de la ventana. Si hay un panel
     * actualmente mostrado, lo elimina de la ventana.
     */
    public void limpiarFrame() {
        if (panelActual != null) {
            this.remove(panelActual);
            panelActual = null;
        }
    }

    
    
    /**
     * Método para cambiar a la vista de la ventana de Inicio. Este método elimina
     * el panel actual
     */
    public void cambiarVistaInicio() {
        limpiarFrame();
        PanelInicioSesion vistaInicioSesion = new PanelInicioSesion(this);
        ponerEnJFrame(vistaInicioSesion);
        panelActual = vistaInicioSesion;
    }
    
    /**
     * Método para cambiar a la vista de la ventana de Menu . Este método elimina
     * el panel actual
     */
    public void cambiarVistaMenu() {
        limpiarFrame();
        PanelMenu vistaMenu = new PanelMenu(this);
        ponerEnJFrame(vistaMenu);
        panelActual = vistaMenu;
    }
    
    /**
     * Método para cambiar a la vista de la ventana de Carrito . Este método elimina
     * el panel actual
     */
    public void cambiarVistaCarrito() {
        limpiarFrame();
        PanelCarrito vistaCarrito = new PanelCarrito(this);
        ponerEnJFrame(vistaCarrito);
        panelActual = vistaCarrito;
    }
    
    /**
     * Método para cambiar a la vista de la ventana de MetodoPago . Este método elimina
     * el panel actual
     */
    public void cambiarVistaMetodoPago() {
        limpiarFrame();
        PanelMetodoPago vistaMetodoPago = new PanelMetodoPago(this);
        ponerEnJFrame(vistaMetodoPago);
        panelActual = vistaMetodoPago;
    }
    
    /**
     * Método para cambiar a la vista de la ventana de Menu . Este método elimina
     * el panel actual
     */
    public void cambiarVistaProducto() {
        limpiarFrame();
        PanelProducto vistaProducto = new PanelProducto(this);
        ponerEnJFrame(vistaProducto);
        panelActual = vistaProducto;
    }
    
    /**
     * Método para cambiar a la vista de la ventana de Datos de Tarjeta . Este método elimina
     * el panel actual
     */
    public void cambiarVistaDatosTarjeta() {
        limpiarFrame();
        PanelDatosTarjeta vistaDatos = new PanelDatosTarjeta(this);
        ponerEnJFrame(vistaDatos);
        panelActual = vistaDatos;
    }
    
    public void cambiarPanelPagoExito(){
        limpiarFrame();
        PanelPagoExito panelPagoExito = new PanelPagoExito(this);
        ponerEnJFrame(panelPagoExito);
        panelActual = panelPagoExito;
    }
    
    public void cambiarPanelBuscar(){
        limpiarFrame();
        PanelBuscar panelBuscar = new PanelBuscar(this);
        ponerEnJFrame(panelBuscar);
        panelActual = panelBuscar;
    }
    
    public void cambiarPanelHistorial(){
        limpiarFrame();
        PanelHistorial panelHistorial = new PanelHistorial(this);
        ponerEnJFrame(panelHistorial);
        panelActual = panelHistorial;
        
    }
    public void cambiarPanelHistorialPedido(){
        limpiarFrame();
        PanelHistorialPedido panelHistorialPedido = new PanelHistorialPedido(this);
        ponerEnJFrame(panelHistorialPedido);
        panelActual = panelHistorialPedido;
        
    }

  

    /**
     * Método para agregar un panel a la ventana. Este método agrega el panel
     * especificado a la ventana, lo posiciona y ajusta su tamaño
     * automáticamente.
     *
     * @param panel El panel que se va a agregar a la ventana.
     */
    public void ponerEnJFrame(JPanel panel) {
        this.add(panel);
        panel.setBounds(0, 0, 400, 800);
        this.setLocationRelativeTo(null);
        this.pack();  // Ajustar el tamaño automáticamente
    }

    /**
     * Método para mostrar un aviso al usuario mediante una ventana emergente.
     *
     * @param mensaje El mensaje a mostrar en el aviso.
     */
    public void mostrarAviso(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(this, mensaje, titulo, JOptionPane.WARNING_MESSAGE);
    }

    /**
     * Método para mostrar una ventana emergente de confirmación al usuario.
     *
     * @param mensaje El mensaje a mostrar en la ventana de confirmación.
     * @param titulo El título de la ventana de confirmación.
     * @return true si el usuario selecciona "OK", false si selecciona
     * "Cancelar".
     */
    public boolean mostrarConfirmacion(String mensaje, String titulo) {
        int respuesta = JOptionPane.showConfirmDialog(null, mensaje, titulo, JOptionPane.OK_CANCEL_OPTION);
        return respuesta == JOptionPane.OK_OPTION;
    }

    /**
     * Método para mostrar una ventana emergente de información al usuario.
     *
     * @param mensaje El mensaje a mostrar en la ventana de información.
     * @param titulo El título de la ventana de información.
     */
    public void mostrarInformacion(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(this, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    public String getIdProducto() {
        return codigoProducto;
    }

    public void setIdProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNumID() {
        return numID;
    }

    public void setNumID(String numID) {
        this.numID = numID;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEtiquetaPedido() {
        return etiquetaPedido;
    }

    public void setEtiquetaPedido(String etiquetaPedido) {
        this.etiquetaPedido = etiquetaPedido;
    }
    
    
}
