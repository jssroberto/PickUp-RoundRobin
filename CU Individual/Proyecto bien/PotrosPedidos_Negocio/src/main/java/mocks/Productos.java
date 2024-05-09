/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mocks;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yohan
 */
public class Productos {
    
    Long id;
    String nombre;
    Integer cantidad;
    String descripcion;
    Float costo;
    List<Productos> productos;

    public Productos(Long id, String nombre, Integer cantidad, String descripcion, Float costo) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.costo = costo;
        productos= new ArrayList<>();
    }

    public Productos(String nombre, Integer cantidad, String descripcion, Float costo) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.costo = costo;
        productos= new ArrayList<>();
    }

    public Productos() {
        productos= new ArrayList<>();
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

 

    public List<Productos> getProductos() {
        return productos;
    }

    public void setProductos(List<Productos> productos) {
        this.productos = productos;
    }

    public void generarLista(){
        productos.add(new Productos(1l, "Hamburguesa Clasica", 10, "asdasdasd", 90.0f));
        productos.add(new Productos(2l, "Torta cubana", 10, "asdasdasd", 75.0f));
        productos.add(new Productos(3l, "Sushi", 10, "asdasdasd", 100.0f));
        productos.add(new Productos(4l, "Coca-cola", 10, "asdasdasd", 20.0f));
        productos.add(new Productos(5l, "Hamburguesa de pollo", 10, "asdasdasd", 90.0f));
        productos.add(new Productos(6l, "Sandwich", 10, "asdasdasd", 55.0f));
        productos.add(new Productos(7l, "Jamaica", 10, "asdasdasd", 15.0f));
        
    }
    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", descripcion=" + descripcion + ", costo=" + costo + ", productos=" + productos + '}';
    }

   
    

    
    

    
    
            
}
