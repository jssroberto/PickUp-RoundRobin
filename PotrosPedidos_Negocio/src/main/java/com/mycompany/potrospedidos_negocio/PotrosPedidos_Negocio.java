/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.potrospedidos_negocio;

import Mock.Banco;
import Mock.Carrito;
import Mock.Producto;
import Mock.Usuario;
import SubsistemaAgregarCarrito.AgregarCarrito;
import SubsistemaConsultarProducto.ConsultarProducto;
import SubsistemaSacarPrecio.SacarPrecio;
import java.util.List;

/**
 *
 * @author yohan
 */
public class PotrosPedidos_Negocio {

    public static void main(String[] args) {
        Producto productos= new Producto();
        productos.generarLista();
        List<Producto> listaProductos= productos.getProductos();
        
        for (Producto producto : listaProductos) {
            System.out.println(producto.getId()+" "+producto.getNombre()+" "+producto.getCosto() + " "+producto.getCantidad());
        }
        
        System.out.println("");
        
        Usuario usuarios= new Usuario();
        usuarios.generarLista();
        List<Usuario> listaUsuarios= usuarios.getListaUsuarios();
        
        for (Usuario usuario : listaUsuarios) {
            System.out.println(usuario.getID()+" "+usuario.getContra());
        }
        
        ConsultarProducto consultarProducto= new ConsultarProducto(listaProductos);
        Producto productoAux = consultarProducto.consultarProducto(5);
        System.out.println(productoAux.getId()+" "+productoAux.getNombre()+" "+productoAux.getCosto() + " "+productoAux.getCantidad());
        
        Carrito carrito= new Carrito();
        
        AgregarCarrito agregarCarrito = new AgregarCarrito(carrito);
        agregarCarrito.agregarCarrito(productoAux, 8);
        for (Carrito listaCarro : carrito.getCarrito()) {
            System.out.println(listaCarro.getCantidad()+ " "+listaCarro.getProducto().getNombre());
        }
        
        SacarPrecio sacarPrecio= new SacarPrecio();
        System.out.println(sacarPrecio.sacarPrecio(carrito.getCarrito()));
        
        Banco banco= new Banco();
        banco.generarLista();
        List<Banco> listaBancos= banco.getListaBanco();
        
        for (Banco listaBanco : listaBancos) {
            System.out.println(listaBanco.getNombre()+" "+listaBanco.getNumero());
        }
        
        List<Producto> listaProductoAux= consultarProducto.getProductos();
        for (Producto producto : listaProductoAux) {
            System.out.println(producto.getId()+" "+producto.getNombre()+" "+producto.getCosto() + " "+producto.getCantidad());
        }
    }
}
