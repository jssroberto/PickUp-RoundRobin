/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mocks;

import java.util.List;

/**
 *
 * @author yohan
 */
public class Carrito {
    
    Integer cantidad;
    Float costoFinal;
    Productos producto;
    List<Carrito> carrito;

    public Carrito(Integer cantidad, Float costoFinal, Productos producto) {
        this.cantidad = cantidad;
        this.costoFinal = costoFinal;
        this.producto = producto;
    }
    public Carrito() {
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getCostoFinal() {
        return costoFinal;
    }

    public void setCostoFinal(Float costoFinal) {
        this.costoFinal = costoFinal;
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public List<Carrito> getCarrito() {
        return carrito;
    }

    public void setCarrito(List<Carrito> carrito) {
        this.carrito = carrito;
    }

    
    
    
}
