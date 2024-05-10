package objetosNegocio;

import convertidores.ConvertidorDTOaDAO;
import daos.CarritoDAO;
import interfaces.ICarritoDAO;
import dtos.CarritoDTO;
import dtos.DetalleProductoDTO;
import dtos.UsuarioDTO;
import excepciones.BOException;
import excepciones.PersistenciaException;
import interfaces.ICarritoBO;
import org.bson.types.ObjectId;

/**
 *
 * @author yohan
 */
public class CarritoBO implements ICarritoBO{

    ICarritoDAO carrito = new CarritoDAO();
    ConvertidorDTOaDAO convertir = new ConvertidorDTOaDAO();

    @Override
    public void agregarDetalleProductoAlCarrito(UsuarioDTO usuario, DetalleProductoDTO nuevoDetalleProductoDTO) throws BOException {
        if (usuario == null || nuevoDetalleProductoDTO == null) {
            throw new BOException("Usuario o DetalleProducto vacio");
        } else {
            try {
                
                //TODO no se si jale new ObjectId
                carrito.agregarDetalleProducto(new ObjectId(usuario.getId()), convertir.convertirDTOenDAO(nuevoDetalleProductoDTO));
            } catch (PersistenciaException ex) {
                throw new BOException(ex.getMessage(), ex);
            }
        }
    }
//

    @Override
    public void eliminarDetalleProductoCarrito(UsuarioDTO usuario, DetalleProductoDTO nuevoDetalleProductoDTO) throws BOException {
        if (usuario == null || nuevoDetalleProductoDTO == null) {
            throw new BOException("Usuario o DetalleProducto vacio");
        } else {
            try {
                carrito.eliminarDetalleProducto(new ObjectId(usuario.getId()), convertir.convertirDTOenDAO(nuevoDetalleProductoDTO));
            } catch (PersistenciaException ex) {
                throw new BOException(ex.getMessage(), ex);
            }
        }
    }

    public void vaciarCarrito(UsuarioDTO usuario, CarritoDTO carrito) throws BOException {

    }
}
