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

    
//    public void persistir(PedidoDTO pedido) throws PersistenciaException {
//        
//        try {
//            pedidos.consultarPedido(pedido);
//        } catch (Exception e) {
//            throw new PersistenciaException(e.getMessage());
//        }
//    }

//    public PedidoDTO consultarPedido(String numeroPedido) throws PersistenciaException {
//        try {
//           return  pedidos.consultarPedido(numeroPedido);
//        } catch (Exception e) {
//             throw new PersistenciaException(e.getMessage());
//        }
//        return null;
//    }
}
