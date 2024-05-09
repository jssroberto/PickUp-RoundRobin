package interfaces;

import dtos.PedidoDTO;
import excepciones.BOException;
import excepciones.PersistenciaException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
/**
 *
 * @author yohan
 */
public interface IPedidoBO {

    public void persistir(PedidoDTO pedido) throws BOException;

    public PedidoDTO consultarPedido(String numeroPedido) throws BOException;
}
