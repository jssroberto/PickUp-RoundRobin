package Interfaz;

import dtos.PedidoDTO;
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

    public void persistir(PedidoDTO pedido) throws PersistenciaException;

    public PedidoDTO consultarPedido(String numeroPedido) throws PersistenciaException;
}
