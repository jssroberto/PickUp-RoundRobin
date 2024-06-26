package Interfaz;

import dominio.Pedido;
import dominio.Usuario;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
/**
 *
 * @author yohan
 */
public interface IPedidoBO {

    public void persistir(Pedido pedido);
    public Pedido consultarPedido(Pedido numeroPedido);
    public void referenciarPedido(Usuario usuario, Pedido pedido);
}
