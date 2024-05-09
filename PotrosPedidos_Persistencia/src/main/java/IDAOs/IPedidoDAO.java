package IDAOs;

import dominio.Pedido;

/**
 *
 * @author Roberto García
 */
public interface IPedidoDAO {

    public void persistir(Pedido pedido);

    public Pedido consultarPedido(String numeroPedido);
}
