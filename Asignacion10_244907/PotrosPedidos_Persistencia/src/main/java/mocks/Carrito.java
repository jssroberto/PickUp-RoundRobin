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
public class Carrito {

    Long id;
    Integer cantidad;
    Float costoFinal;
    Usuario usuario;
    List<Carrito> carrito;

    public Carrito(Long id, Integer cantidad, Float costoFinal, Usuario usuario) {
        this.id = id;
        this.cantidad = cantidad;
        this.costoFinal = costoFinal;
        this.usuario = usuario;
        carrito = new ArrayList<>();
    }

    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Carrito() {
        carrito = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void generarLista() {
        Usuario usuario = new Usuario();
        usuario.generarLista();
        carrito.add(new Carrito(1L, 11, 999.0F, usuario.getListaUsuarios().get(0)));
        carrito.add(new Carrito(2L, 1, 222.0F, usuario.getListaUsuarios().get(1)));
        carrito.add(new Carrito(3L, 2, 122.0F, usuario.getListaUsuarios().get(2)));
        carrito.add(new Carrito(4L, 3, 100.F, usuario.getListaUsuarios().get(3)));
        carrito.add(new Carrito(5L, 5, 2999.0F, usuario.getListaUsuarios().get(4)));
        carrito.add(new Carrito(6L, 6, 222.0F, usuario.getListaUsuarios().get(5)));
        carrito.add(new Carrito(7L, 7, 111.0F, usuario.getListaUsuarios().get(6)));

    }

    public List<Carrito> getCarrito() {
        return carrito;
    }

    public void setCarrito(List<Carrito> carrito) {
        this.carrito = carrito;
    }
}
