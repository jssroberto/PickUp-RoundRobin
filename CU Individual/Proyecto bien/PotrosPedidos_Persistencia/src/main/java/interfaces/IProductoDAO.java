package interfaces;

import dominio.Producto;
import excepciones.PersistenciaException;

/**
 *
 * @author Roberto García
 */
public interface IProductoDAO {

    public void persistir(Producto producto) throws PersistenciaException;

    public Producto consultar(String nombre) throws PersistenciaException;

    public Producto consultar(Long idProducto) throws PersistenciaException;
}
