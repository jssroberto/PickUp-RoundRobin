/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import org.bson.types.ObjectId;

/**
 *
 * @author jl4ma
 */
public class DetalleProducto {
    
    private Integer cantidad;
    private Float subtotal;
    private Producto producto;

    public DetalleProducto(Integer cantidad, Float subtotal, Producto producto) {
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.producto = producto;
    }

  
    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "DetalleProducto{" + "cantidad=" + cantidad + ", subtotal=" + subtotal + ", producto=" + producto + '}';
    }

    

    
    
    
}
