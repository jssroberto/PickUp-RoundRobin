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
public class DetalleCarrito {
    
    private Long id;
    private Carrito carrito;
    private Producto producto;
    private Integer cantidad;
    private Float total;
    private List<DetalleCarrito> detalles;

    public DetalleCarrito() {
        detalles = new ArrayList<>();
    }

    public DetalleCarrito(Long id, Carrito carrito, Producto producto, Integer cantidad, Float total) {
        this.id = id;
        this.carrito = carrito;
        this.producto = producto;
        this.cantidad = cantidad;
        this.total = total;
        detalles = new ArrayList<>();
    }

    public DetalleCarrito(Carrito carrito, Producto producto, Integer cantidad, Float total) {
        this.carrito = carrito;
        this.producto = producto;
        this.cantidad = cantidad;
        this.total = total;
        detalles = new ArrayList<>();
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public List<DetalleCarrito> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleCarrito> detalles) {
        this.detalles = detalles;
    }

    public void generarLista(){
        Carrito carro = new Carrito();
        carro.generarLista();
        Producto produc = new Producto();
        produc.generarLista();
        detalles.add(new DetalleCarrito(1L, carro.getCarrito().get(0), produc.getProductos().get(2), 1, 100.0F));
        detalles.add(new DetalleCarrito(2L, carro.getCarrito().get(0), produc.getProductos().get(0), 2, 250.0F));
        detalles.add(new DetalleCarrito(3L, carro.getCarrito().get(0), produc.getProductos().get(1), 2, 400.0F));
        
        
        detalles.add(new DetalleCarrito(4L, carro.getCarrito().get(1), produc.getProductos().get(6), 1, 100.0F));
        detalles.add(new DetalleCarrito(5L, carro.getCarrito().get(1), produc.getProductos().get(5), 1, 100.0F));
        
        detalles.add(new DetalleCarrito(7L, carro.getCarrito().get(2), produc.getProductos().get(2), 2, 100.0F));
        detalles.add(new DetalleCarrito(8L, carro.getCarrito().get(2), produc.getProductos().get(1), 2, 100.0F));
        
        detalles.add(new DetalleCarrito(9L, carro.getCarrito().get(3), produc.getProductos().get(4), 2, 100.0F));
        
        detalles.add(new DetalleCarrito(10L, carro.getCarrito().get(4), produc.getProductos().get(4), 2, 100.0F));
        detalles.add(new DetalleCarrito(11L, carro.getCarrito().get(4), produc.getProductos().get(0), 2, 100.0F));
        detalles.add(new DetalleCarrito(12L, carro.getCarrito().get(4), produc.getProductos().get(5), 1, 100.0F));
        detalles.add(new DetalleCarrito(13L, carro.getCarrito().get(4), produc.getProductos().get(1), 1, 100.0F));
        detalles.add(new DetalleCarrito(14L, carro.getCarrito().get(4), produc.getProductos().get(2), 1, 100.0F));
        
        detalles.add(new DetalleCarrito(15L, carro.getCarrito().get(5), produc.getProductos().get(6), 1, 100.0F));
        detalles.add(new DetalleCarrito(16L, carro.getCarrito().get(5), produc.getProductos().get(5), 4, 100.0F));
        
        
        detalles.add(new DetalleCarrito(17L, carro.getCarrito().get(5), produc.getProductos().get(0), 2, 100.0F));
        detalles.add(new DetalleCarrito(18L, carro.getCarrito().get(5), produc.getProductos().get(3), 1, 100.0F));
        
        
        
        detalles.add(new DetalleCarrito(20L, carro.getCarrito().get(6), produc.getProductos().get(2), 3, 100.0F));
        
    }
    @Override
    public String toString() {
        return "DetalleCarrito{" + "id=" + id + ", carrito=" + carrito + ", producto=" + producto + ", cantidad=" + cantidad + ", total=" + total + '}';
    }
    
    
}
