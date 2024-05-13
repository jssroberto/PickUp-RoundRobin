/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import BOs.UsuarioBO;
import Interfaz.IUsuarioBO;
import dominio.Pedido;
import dominio.Usuario;
import interfaces.IControlCarrito;
import interfaces.IControlPedido;
import interfaces.IControlUsuario;

/**
 *
 * @author galan
 */
public class ControlPagarPuntos {

    IControlPedido pedidoSub = new ControlPedido();
    IControlCarrito carritoSub = new ControlCarrito();
    IUsuarioBO usuarioBO= new UsuarioBO();
    IControlUsuario user = new ControlUsuario();

    public boolean PagarPuntos(Usuario usuario, Integer puntosPagar, Integer puntosGenera) throws Exception {
        try {
            Pedido pedidoGenerado = new Pedido();
            pedidoGenerado.setNumeroPedido(pedidoSub.generateRandomString());
            pedidoGenerado.setClaveRecoleccion(pedidoSub.generateRandomString());
            pedidoGenerado.setEtiquetaPedido(pedidoSub.generateRandomString());
            pedidoGenerado.setDetalleProductos(usuario.getCarrito().getProductos());
            pedidoSub.persistir(pedidoGenerado);
            pedidoSub.referenciarPedido(usuario, pedidoGenerado);
            carritoSub.vaciarCarrito(usuario);       
            usuarioBO.actualizarPuntosUsuario(usuario, usuario.getSaldoPuntos()+puntosGenera-puntosPagar);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getCause()); 
        }
    }
}
