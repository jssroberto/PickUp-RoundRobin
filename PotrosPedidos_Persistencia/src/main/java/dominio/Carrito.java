/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author jl4ma
 */
public class Carrito {
    
    private ObjectId id;
    private Float total;
    private List<DetalleProducto> productos;

    public Carrito(ObjectId id, Float total, List<DetalleProducto> productos) {
        this.id = id;
        this.total = total;
        this.productos = productos;
        productos = new ArrayList<>();
    }

    public Carrito(Float total, List<DetalleProducto> productos) {
        this.total = total;
        this.productos = productos;
        productos = new ArrayList<>();
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public List<DetalleProducto> getProductos() {
        return productos;
    }

    public void setProductos(List<DetalleProducto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Carrito{" + "id=" + id + ", total=" + total + ", productos=" + productos + '}';
    }
    
    
}
