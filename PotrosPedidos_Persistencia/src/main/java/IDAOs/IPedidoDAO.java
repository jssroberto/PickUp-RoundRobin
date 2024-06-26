package IDAOs;

import dominio.Pedido;
import excepciones.PersistenciaException;
import java.util.List;

/**
 *
 * @author Roberto García
 */
public interface IPedidoDAO {

    public void persistir(Pedido pedido) throws PersistenciaException;

    public Pedido consultar(Pedido idPedido) throws PersistenciaException;
    
    public List<Pedido> consultar() throws PersistenciaException;
}
