/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosNegocio;

import DAOs.PedidoDAO;
import convertidores.ConvertidorDAOaDTO;
import convertidores.ConvertidorDTOaDAO;
import dominio.Pedido;
import dtos.PedidoDTO;
import excepciones.BOException;
import excepciones.PersistenciaException;
import interfaces.IPedidoBO;

/**
 *
 * @author yohan
 */
public class PedidosBO implements IPedidoBO {

    @Override
    public void persistir(PedidoDTO pedido) throws BOException {
        PedidoDAO pedidosDAO = new PedidoDAO();
        ConvertidorDTOaDAO dtoADao = new ConvertidorDTOaDAO();
        try {
            pedidosDAO.persistir(dtoADao.convertirDAOenDTO(pedido));
        } catch (PersistenciaException e) {
            throw new BOException(e.getMessage());
        }
    }

    @Override
    public PedidoDTO consultarPedido(String numeroPedido) throws BOException {
        PedidoDAO pedidosDAO = new PedidoDAO();
        ConvertidorDAOaDTO daoADto = new ConvertidorDAOaDTO();
        try {
            Pedido pedido = pedidosDAO.consultar(numeroPedido);
            PedidoDTO pedidoDTO = daoADto.convertirDAOenDTO(pedido);
            return pedidoDTO;
        } catch (PersistenciaException e) {
            throw new BOException(e.getMessage(), e);
        }
    }

}
