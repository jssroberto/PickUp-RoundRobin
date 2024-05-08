/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.time.LocalDate;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author jl4ma
 */
public class Pedido {
    private ObjectId idPedido;
    private String etiquetaPedido;
    private String numeroPedido;
    private String claveRecoleccion;
    private LocalDate fecha;
    private Integer numeroProductos;
    private Float total;
    private MetodoPago metodoPago;
    private List<DetalleProducto> detalleProductos;

    public Pedido(ObjectId idPedido, String etiquetaPedido, String numeroPedido, String claveRecoleccion, LocalDate fecha, Integer numeroProductos, Float total, MetodoPago metodoPago, List<DetalleProducto> detalleProductos) {
        this.idPedido = idPedido;
        this.etiquetaPedido = etiquetaPedido;
        this.numeroPedido = numeroPedido;
        this.claveRecoleccion = claveRecoleccion;
        this.fecha = fecha;
        this.numeroProductos = numeroProductos;
        this.total = total;
        this.metodoPago = metodoPago;
        this.detalleProductos = detalleProductos;
    }

    public ObjectId getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(ObjectId idPedido) {
        this.idPedido = idPedido;
    }

    public String getEtiquetaPedido() {
        return etiquetaPedido;
    }

    public void setEtiquetaPedido(String etiquetaPedido) {
        this.etiquetaPedido = etiquetaPedido;
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

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public List<DetalleProducto> getDetalleProductos() {
        return detalleProductos;
    }

    public void setDetalleProductos(List<DetalleProducto> detalleProductos) {
        this.detalleProductos = detalleProductos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido{");
        sb.append("idPedido=").append(idPedido);
        sb.append(", etiquetaPedido=").append(etiquetaPedido);
        sb.append(", numeroPedido=").append(numeroPedido);
        sb.append(", claveRecoleccion=").append(claveRecoleccion);
        sb.append(", fecha=").append(fecha);
        sb.append(", numeroProductos=").append(numeroProductos);
        sb.append(", total=").append(total);
        sb.append(", metodoPago=").append(metodoPago);
        sb.append(", detalleProductos=").append(detalleProductos);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
