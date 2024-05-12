/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dominio.DetalleProducto;
import dominio.Pedido;
import dominio.Usuario;
import interfaces.IControlPedido;
import interfaces.IPedidoBO;
import java.util.Random;
import javax.swing.JOptionPane;
import objetosNegocio.PedidosBO;

/**
 *
 * @author jl4ma
 */
public class ControlPedido implements IControlPedido{
    
    IPedidoBO pedidos;
    
    public ControlPedido(){
        pedidos = new PedidosBO();
    }

    @Override
    public void persistir(Pedido pedido) {
        float total = 0;
        for(DetalleProducto pe: pedido.getDetalleProductos()){
            total+= pe.getSubtotal();
        }
        pedido.setTotal(total);
        pedidos.persistir(pedido);
    }

    @Override
    public Pedido consultarPedido(Pedido numeroPedido) {
        return pedidos.consultarPedido(numeroPedido);
    }

    @Override
    public void referenciarPedido(Usuario usuario, Pedido pedido) {
        pedidos.referenciarPedido(usuario, pedido);
    }
    
    @Override
    public boolean pedidoAceptado(){
        if(this.getRandomBinaryValue() ==0){
             JOptionPane.showMessageDialog(null, "Pedido Aceptado");
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Pedido NO Aceptado");
            return false;
        }
    }
    
    public  int getRandomBinaryValue() {
        Random random = new Random();
        return random.nextInt(2); // Genera un valor aleatorio entre 0 y 1
    }
    
    
}
