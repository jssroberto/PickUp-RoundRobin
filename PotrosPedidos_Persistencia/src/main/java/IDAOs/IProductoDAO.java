package IDAOs;

import dominio.Producto;
import excepciones.PersistenciaException;

/**
 *
 * @author Roberto García
 */
public interface IProductoDAO {

    public void persistir(Producto producto) throws PersistenciaException;

    public Producto consultarProducto(String nombre) throws PersistenciaException;

    public Producto consultarProducto(Long idProducto) throws PersistenciaException;
}
