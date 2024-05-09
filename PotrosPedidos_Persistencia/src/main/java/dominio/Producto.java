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
public class Producto {

    private ObjectId id;
    private Long idProducto;
    private String nombre;
    private Float precio;
    private Integer puntosCuesta, puntosGenera;
    private String descripcion;
    private String direccionImagen;

    public Producto(ObjectId id, String nombre, Float precio, String descripcion, String direccionImagen, Long idProducto) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.puntosCuesta = Math.round(precio);
        this.puntosGenera = (int) Math.round(precio*0.05);
        this.descripcion = descripcion;
        this.direccionImagen = direccionImagen;
        this.idProducto = idProducto;
    }

    public Producto(ObjectId id, Long idProducto, String nombre, Float precio, String descripcion, String direccionImagen) {
        this.id = id;
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.puntosCuesta = Math.round(precio);
        this.puntosGenera = (int) Math.round(precio * 0.05);
        this.descripcion = descripcion;
        this.direccionImagen = direccionImagen;
    }

    public Producto(ObjectId id) {
        this.id = id;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public Producto(String nombre, Float precio, String descripcion, String direccionImagen) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.direccionImagen = direccionImagen;
    }

    public Producto() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccionImagen() {
        return direccionImagen;
    }

    public void setDireccionImagen(String direccionImagen) {
        this.direccionImagen = direccionImagen;
    }

    public Integer getPuntosCuesta() {
        return puntosCuesta;
    }

    public void setPuntosCuesta(Integer puntosCuesta) {
        this.puntosCuesta = puntosCuesta;
    }

    public Integer getPuntosGenera() {
        return puntosGenera;
    }

    public void setPuntosGenera(Integer puntosGenera) {
        this.puntosGenera = puntosGenera;
    }

    

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + ", puntosCuesta=" + puntosCuesta + ", puntosGenera=" + puntosGenera + ", descripcion=" + descripcion + ", direccionImagen=" + direccionImagen + '}';
    }

}
