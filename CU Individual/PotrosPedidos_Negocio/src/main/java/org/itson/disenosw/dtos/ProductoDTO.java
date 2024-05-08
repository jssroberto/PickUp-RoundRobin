/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.disenosw.dtos;

/**
 *
 * @author yohan
 */
 public class ProductoDTO {


    private Float precio;

    private String nombre;

    private String descripcion;

    private Integer cantidadDisponible;
    private String direccionImagen;
    private Long idProductoCafeteria;

    public ProductoDTO() {
    }



    public ProductoDTO(Long idProductoCafeteria) {
        this.idProductoCafeteria = idProductoCafeteria;
    }

    public ProductoDTO(Float precio, String nombre, String descripcion, Integer cantidadDisponible, String direccionImagen, Long idProductoCafeteria) {
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidadDisponible = cantidadDisponible;
        this.direccionImagen = direccionImagen;
        this.idProductoCafeteria = idProductoCafeteria;
    }

    public ProductoDTO(Float precio, String nombre, String descripcion, String direccionImagen, Long idProductoCafeteria) {
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.direccionImagen = direccionImagen;
        this.idProductoCafeteria = idProductoCafeteria;
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

    public Integer getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(Integer cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getDireccionImagen() {
        return direccionImagen;
    }

    public void setDireccionImagen(String direccionImagen) {
        this.direccionImagen = direccionImagen;
    }

    public Long getIdProductoCafeteria() {
        return idProductoCafeteria;
    }

    public void setIdProductoCafeteria(Long idProductoCafeteria) {
        this.idProductoCafeteria = idProductoCafeteria;
    }

}
