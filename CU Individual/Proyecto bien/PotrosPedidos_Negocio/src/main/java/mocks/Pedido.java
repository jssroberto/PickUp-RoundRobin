/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mocks;

import dominio.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jl4ma
 */
public class Pedido {
    
    Usuario usuario;
    List<Producto> productos;
    List<Pedido> pedidos;
    float precio;

    public Pedido(Usuario usuario, List<Producto> productos, float precio) {
        this.usuario = usuario;
        this.productos = productos;
        this.precio = precio;
        productos = new ArrayList<>();
        pedidos = new ArrayList<>();
    }

    public Pedido() {
        productos = new ArrayList<>();
        pedidos = new ArrayList<>();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public void generarLista(){
        List<Producto> pro1 = new ArrayList<>();
        pro1.add(new Producto(20.0f, "papas", 1l));
        pro1.add(new Producto(111.0f, "torta", 1l));
        pro1.add(new Producto(222.0f, "pizza", 1l));
        pedidos.add(new Pedido(new Usuario("00000244903", "madero"), pro1, 290.0F));
        List<Producto> pro2 = new ArrayList<>();
        pro2.add(new Producto(211.0f, "emparedado", 2l));
        pro2.add(new Producto(331.0f, "quesadilla", 2l));
        pro2.add(new Producto(121.0f, "doritos", 2l));
        pedidos.add(new Pedido(new Usuario("00000244904", "madero"), pro2, 100.0F));
        List<Producto> pro3 = new ArrayList<>();
        pro3.add(new Producto(3234.0f, "papas", 3l));
        pro3.add(new Producto(24.0f, "doritos", 3l));
        pro3.add(new Producto(13.0f, "coca", 3l));
        pedidos.add(new Pedido(new Usuario("00000244905", "madero"), pro3, 233.0F));
        List<Producto> pro4 = new ArrayList<>();
        pro4.add(new Producto(2.0f, "pepsi", 4l));
        pro4.add(new Producto(233.0f, "lasagna", 4l));
        pro4.add(new Producto(22.0f, "papas", 4l));
        pedidos.add(new Pedido(new Usuario("00000244906", "madero"), pro4, 1222.0F));
        List<Producto> pro5 = new ArrayList<>();
        pro5.add(new Producto(44.0f, "papas", 5l));
        pro5.add(new Producto(2130.0f, "rufles", 5l));
        pro5.add(new Producto(133.0f, "coca", 5l));
        pedidos.add(new Pedido(new Usuario("00000244907", "madero"), pro5, 430.0F));
        List<Producto> pro6 = new ArrayList<>();
        pro6.add(new Producto(323.0f, "torta", 6l));
        pro6.add(new Producto(22.0f, "quesadilla", 6l));
        pro6.add(new Producto(33.0f, "papas", 6l));
        pedidos.add(new Pedido(new Usuario("00000244908", "madero"), pro6, 111.0F));
    }
    
    
}
