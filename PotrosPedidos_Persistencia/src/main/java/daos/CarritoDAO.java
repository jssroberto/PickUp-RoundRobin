package daos;

import interfaces.ICarritoDAO;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import conexion.Conexion;
import dominio.DetalleProducto;
import dominio.Usuario;
import excepciones.PersistenciaException;
import org.bson.types.ObjectId;

/**
 *
 * @author Roberto García
 */
public class CarritoDAO implements ICarritoDAO {

    private final MongoCollection<Usuario> coleccionUsuario;

    public CarritoDAO() {
        this.coleccionUsuario = Conexion.getDatabase().getCollection("usuario", Usuario.class);
    }

    @Override
    public void agregarDetalleProducto(ObjectId usuarioId, DetalleProducto nuevoDetalleProducto) throws PersistenciaException {
        try {
            coleccionUsuario.updateOne(Filters.eq("_id", usuarioId), Updates.push("carrito.productos", nuevoDetalleProducto));
        } catch (MongoException e) {
            throw new PersistenciaException("Error al insertar el producto al carrito", e);
        }
    }

    @Override
    public void eliminarDetalleProducto(ObjectId usuarioId, DetalleProducto nuevoDetalleProducto) throws PersistenciaException {
        try {
            coleccionUsuario.updateOne(Filters.eq("_id", usuarioId), Updates.pull("carrito.productos", nuevoDetalleProducto));
        } catch (MongoException e) {
            throw new PersistenciaException("Error al eliminar el producto del carrito", e);
        }
    }

    @Override
    public void vaciarCarrito(Usuario usuario) throws PersistenciaException{

    }

}
