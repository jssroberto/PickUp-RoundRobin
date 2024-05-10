package interfaces;

import dominio.DetalleProducto;
import dominio.Usuario;
import excepciones.PersistenciaException;
import org.bson.types.ObjectId;

/**
 *
 * @author Roberto García
 */
public interface ICarritoDAO {

    public void agregarDetalleProducto(ObjectId usuarioId, DetalleProducto nuevoDetalleProducto) throws PersistenciaException;

    public void eliminarDetalleProducto(ObjectId usuarioId, DetalleProducto nuevoDetalleProducto) throws PersistenciaException;

    public void vaciarCarrito(Usuario usuario) throws PersistenciaException;
}
