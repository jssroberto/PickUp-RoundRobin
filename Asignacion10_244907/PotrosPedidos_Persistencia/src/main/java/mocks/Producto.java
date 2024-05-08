/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mocks;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jl4ma
 */
public class Producto {
    private Long id;
    private String nombre;
    private Integer cantidad;
    private String descripcion;
    private Float costo;
    private String rutaImagen;
    private List<Producto> productos;

    public Producto(Long id, String nombre, Integer cantidad, String descripcion, Float costo, String rutaImagen) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.costo = costo;
        this.rutaImagen = rutaImagen;
        this.productos = new ArrayList<>();
    }

    public Producto(Long id, String nombre, Integer cantidad, String descripcion, Float costo) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.costo = costo;
        productos= new ArrayList<>();
    }

    public Producto(String nombre, Integer cantidad, String descripcion, Float costo) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.costo = costo;
        productos= new ArrayList<>();
    }
    

    public Producto() {
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

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public void generarLista(){
        productos.add(new Producto(1l, "Hamburguesa Clasica", 10, "asdasdasd", 90.0f, "hamburguesa-clasica.jpg"));
        productos.add(new Producto(2l, "Torta cubana", 10, "asdasdasd", 75.0f, "torta-cubana.jpg"));
        productos.add(new Producto(3l, "Sushi", 10, "asdasdasd", 100.0f, "sushi.jpg"));
        productos.add(new Producto(4l, "Coca-cola", 10, "asdasdasd", 20.0f, "coca-cola-regular.jpg"));
        productos.add(new Producto(4l, "Coca-cola light", 10, "asdasdasd", 20.0f, "coca-cola-light.jpg"));
        productos.add(new Producto(4l, "Coca-cola zero", 10, "asdasdasd", 20.0f, "coca-cola-zero.jpg"));
        productos.add(new Producto(5l, "Hamburguesa de pollo", 10, "asdasdasd", 90.0f, "hamburguesa-pollo.jpg"));
        productos.add(new Producto(6l, "Sandwich", 10, "asdasdasd", 55.0f, "sandwich.jpg"));
        productos.add(new Producto(7l, "Jamaica", 10, "asdasdasd", 15.0f, "jamaica.jpg"));
        
    }
    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", descripcion=" + descripcion + ", costo=" + costo + ", productos=" + productos + '}';
    }
}
