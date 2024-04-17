/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.disenosw.dtos;

/**
 *
 * @author yohan
 */
public class productoDTO {

    private Long id;

    private Float precio;

    private String nombre;

    private String descripcion;
    
    private Integer cantidad;

    public productoDTO() {
    }

    public productoDTO(Long id) {
        this.id = id;
    }

    public productoDTO(Long id, Float precio, String nombre, String descripcion, Integer cantidad) {
        this.id = id;
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
}
