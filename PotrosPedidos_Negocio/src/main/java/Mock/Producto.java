/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mock;

import java.util.List;

/**
 *
 * @author yohan
 */
public class Producto {
    
    Long id;
    String nombre;
    Integer cantidad;
    String descripcion;
    Float costo;
    Integer disponible;
    List<Producto> productos;

    public Producto(Long id, String nombre, Integer cantidad, String descripcion, Float costo, Integer disponible) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.costo = costo;
        this.disponible = disponible;
    }

    public Producto(String nombre, Integer cantidad, String descripcion, Float costo, Integer disponible) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.costo = costo;
        this.disponible = disponible;
    }

    public Producto() {
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    public Integer getDisponible() {
        return disponible;
    }

    public void setDisponible(Integer disponible) {
        this.disponible = disponible;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    
    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", descripcion=" + descripcion + ", costo=" + costo + ", disponible=" + disponible + '}';
    }

    

    
    

    
    
            
}
