package mocks;

import dominio.Producto;

/**
 *
 * @author Roberto García
 */
public class DetalleProducto extends Producto{
    private Integer cantidad;

    public DetalleProducto(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public DetalleProducto(Integer cantidad, Float precio, String nombre, Long idProductoCafeteria) {
        super(precio, nombre, idProductoCafeteria);
        this.cantidad = cantidad;
    }

    public DetalleProducto(Integer cantidad, Float precio, String nombre, String descripcion, Long idProductoCafeteria) {
        super(precio, nombre, descripcion, idProductoCafeteria);
        this.cantidad = cantidad;
    }

    public DetalleProducto(Integer cantidad, Float precio, String nombre, String descripcion, String direccionImagen, Long idProductoCafeteria) {
        super(precio, nombre, descripcion, direccionImagen, idProductoCafeteria);
        this.cantidad = cantidad;
    }

    public DetalleProducto(Integer cantidad, Float precio, String nombre, String descripcion) {
        super(precio, nombre, descripcion);
        this.cantidad = cantidad;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
