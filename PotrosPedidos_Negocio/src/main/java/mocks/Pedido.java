package mocks;

import dominio.DetallePedido;
import dominio.Producto;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jl4ma
 */
public class Pedido {

    private Integer idPedido;
    private Float total;
    private String numeroPedido;
    private String claveRecoleccion;
    private String estado;
    private LocalDate fecha;
    private Integer numeroProductos;
    private List<DetalleProducto> productos;
    private List<Pedido> pedidos = new ArrayList<>();

    public Pedido(Integer idPedido, Float total, String numeroPedido, String claveRecoleccion, String estado, LocalDate fecha, Integer numeroProductos, List<DetalleProducto> productos) {
        this.idPedido = idPedido;
        this.total = total;
        this.numeroPedido = numeroPedido;
        this.claveRecoleccion = claveRecoleccion;
        this.estado = estado;
        this.fecha = fecha;
        this.numeroProductos = numeroProductos;
        this.productos = productos;
    }

    public Pedido() {
        
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getClaveRecoleccion() {
        return claveRecoleccion;
    }

    public void setClaveRecoleccion(String claveRecoleccion) {
        this.claveRecoleccion = claveRecoleccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Integer getNumeroProductos() {
        return numeroProductos;
    }

    public void setNumeroProductos(Integer numeroProductos) {
        this.numeroProductos = numeroProductos;
    }

    public List<DetalleProducto> getProductos() {
        return productos;
    }

    public void setProductos(List<DetalleProducto> productos) {
        this.productos = productos;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }
    
    

    public void generarLista() {
        List<DetalleProducto> pro1 = new ArrayList<>();
        pro1.add(new DetalleProducto(1, 100.0f, "Hamburguesa clásica", "", "hamburguesa-clasica.png", 1l));
        pro1.add(new DetalleProducto(2, 120.0f, "Sushi", "", "sushi.png", 1l));
        pro1.add(new DetalleProducto(3, 25.0f, "Jamaica", "", "jamaica.png", 1l));
        pedidos.add(new Pedido(1, 415.0F, "0124", "154", "Por recoger", LocalDate.now(), 3, pro1));

        List<DetalleProducto> pro2 = new ArrayList<>();
        pro2.add(new DetalleProducto(2, 75.0f, "Sandwich", "", "sandwich.png", 2l));
        pro2.add(new DetalleProducto(1, 75.0f, "Torta de milanesa", "", "torta-milanesa.png", 2l));
        pro2.add(new DetalleProducto(1, 20.0f, "Coca-cola", "", "coca-cola-regular.png", 2l));
        pedidos.add(new Pedido(2, 245.0F, "0067", "504", "Completado", LocalDate.now(), 3, pro2));

        List<DetalleProducto> pro3 = new ArrayList<>();
        pro3.add(new DetalleProducto(1, 80.0f, "Torta cubana", "", "torta-cubana.png", 3l));
        pro3.add(new DetalleProducto(2, 100.0f, "Hamburguesa clásica", "", "hamburguesa-clasica.png", 3l));
        pro3.add(new DetalleProducto(1, 25.0f, "Jamaica", "", "jamaica.png", 3l));
        pedidos.add(new Pedido(3, 405.0F, "0124", "879", "Completado", LocalDate.now(), 3, pro3));

        List<DetalleProducto> pro4 = new ArrayList<>();
        pro4.add(new DetalleProducto(1, 120.0f, "Hamburguesa de pollo", "", "hamburguesa-pollo.png", 4l));
        pro4.add(new DetalleProducto(1, 80.0f, "Sandwich", "", "sandwich.png", 4l));
        pro4.add(new DetalleProducto(1, 20.0f, "Coca-cola light", "", "coca-cola-light.png", 4l));
        pedidos.add(new Pedido(4, 220.0F, "0198", "065", "Pagado", LocalDate.now(), 3, pro4));

        List<DetalleProducto> pro5 = new ArrayList<>();
        pro5.add(new DetalleProducto(1, 80.0f, "Torta cubana", "", "torta-cubana.png", 5l));
        pro5.add(new DetalleProducto(1, 75.0f, "Torta de milanesa", "", "torta-milanesa.png", 5l));
        pro5.add(new DetalleProducto(1, 20.0f, "Coca-cola zero", "", "coca-cola-zero.png", 5l));
        pedidos.add(new Pedido(5, 175.0F, "0004", "598", "Por recoger", LocalDate.now(), 3, pro5));

        List<DetalleProducto> pro6 = new ArrayList<>();
        pro6.add(new DetalleProducto(2, 120.0f, "Sushi", "", "sushi.png", 6l));
        pro6.add(new DetalleProducto(2, 75.0f, "Torta de milanesa", "", "torta-milanesa.png", 6l));
        pro6.add(new DetalleProducto(2, 20.0f, "Coca-cola", "", "coca-cola-regular.png", 6l));
        pedidos.add(new Pedido(6, 430.0F, "0054", "304", "Pagado", LocalDate.now(), 3, pro6));

    }

}
