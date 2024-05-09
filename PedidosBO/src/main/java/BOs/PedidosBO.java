/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import DAOs.PedidoDAO;
import convertidores.ConvertidorDAOaDTO;
import convertidores.ConvertidorDTOaDAO;
import dtos.PedidoDTO;
import excepciones.PersistenciaException;

/**
 *
 * @author yohan
 */
public class PedidosBO {

    PedidoDAO pedidos = new PedidoDAO();
    ConvertidorDTOaDAO p = new ConvertidorDTOaDAO();
    ConvertidorDAOaDTO convertir = new ConvertidorDAOaDTO();

    public void persistir(PedidoDTO pedido) throws PersistenciaException {
        if (pedido == null) {
            throw new PersistenciaException("Pedido Vacio");
        } else {
            pedidos.persistir(p.convertirDAOenDTO(pedido));
        }
    }
    public PedidoDTO consultarPedido(String numeroPedido) throws PersistenciaException {
        if (numeroPedido == null) {
            throw new PersistenciaException("Pedido Vacio");
        } else {
            return convertir.convertirDAOenDTO(pedidos.consultarPedido(numeroPedido));
        }
    }
}
