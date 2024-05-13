/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import DAOs.PedidoDAO;
import DAOs.UsuarioDAO;
import Interfaz.IPedidoBO;
import dominio.Pedido;
import dominio.Usuario;
import excepciones.PersistenciaException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author yohan
 */
public class PedidosBO implements IPedidoBO {

    PedidoDAO pedidosDAO;
    public PedidosBO(){
        pedidosDAO = new PedidoDAO();
    }
    @Override
    public void persistir(Pedido pedido) {
        try {
            pedidosDAO.persistir(pedido);
        } catch (PersistenciaException ex) {
            Logger.getLogger(PedidosBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Pedido consultarPedido(Pedido etiqueta) {
        try {
            return pedidosDAO.consultar(etiqueta);
        } catch (PersistenciaException ex) {
            Logger.getLogger(PedidosBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @Override
    public void referenciarPedido(Usuario usuario, Pedido pedido){
        UsuarioDAO user = new UsuarioDAO();
        user.referenciarPedido(usuario, pedido);
    }

}
