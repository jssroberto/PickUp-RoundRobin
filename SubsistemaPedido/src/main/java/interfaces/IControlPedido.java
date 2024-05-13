/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dominio.Pedido;
import dominio.Usuario;

/**
 *
 * @author jl4ma
 */
public interface IControlPedido {
    
    public void persistir(Pedido pedido);
    public Pedido consultarPedido(Pedido numeroPedido);
    public void referenciarPedido(Usuario usuario, Pedido pedido);
    public boolean pedidoAceptado();
}
