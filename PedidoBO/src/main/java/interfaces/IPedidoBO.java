package interfaces;

import dtos.PedidoDTO;
import excepciones.BOException;

/**
 *
 * @author yohan
 */
public interface IPedidoBO {

    public void persistir(PedidoDTO pedido) throws BOException;

    public PedidoDTO consultarPedido(String numeroPedido) throws BOException;
}
