/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosNegocio;

import DAOs.PedidoDAO;
import DAOs.UsuarioDAO;
import IDAOs.IPedidoDAO;
import convertidores.ConvertidorDAOaDTO;
import dominio.Pedido;
import dominio.Usuario;
import dtos.PedidoDTO;
import excepciones.BOException;
import excepciones.PersistenciaException;
import interfaces.IPedidoBO;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yohan
 */
public class PedidosBO implements IPedidoBO {

    PedidoDAO pedidosDAO;

    public PedidosBO() {
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
    public void referenciarPedido(Usuario usuario, Pedido pedido) {
        UsuarioDAO user = new UsuarioDAO();
        user.referenciarPedido(usuario, pedido);
    }

    /**
     *
     * @param idUsuario
     * @return
     * @throws BOException
     * @throws PersistenciaException
     */
    @Override
    public List<PedidoDTO> consultarPedidos(String idUsuario) throws BOException, PersistenciaException {
        IPedidoDAO pedidoDAO = new PedidoDAO();
        List<Pedido> pedidos = pedidoDAO.consultarPedidos(idUsuario);
        if (pedidos.isEmpty()) {
            throw new BOException("El usuario no tiene pedidos asociados");
        }
        ConvertidorDAOaDTO daoADto = new ConvertidorDAOaDTO();
        List<PedidoDTO> pedidoDTOs = new ArrayList<>();
        for (Pedido pedido : pedidos) {
            pedidoDTOs.add(daoADto.convertirDAOenDTO(pedido));
        }
        return pedidoDTOs;
    }

    @Override
    public PedidoDTO consultarPorId(String idPedido) throws BOException, PersistenciaException {
        IPedidoDAO pedidoDAO = new PedidoDAO();
        Pedido pedido = pedidoDAO.consultarPorId(idPedido);
        ConvertidorDAOaDTO daoADto = new ConvertidorDAOaDTO();
        PedidoDTO pedidoDTO = daoADto.convertirDAOenDTO(pedido);
        return pedidoDTO;

    }

}
