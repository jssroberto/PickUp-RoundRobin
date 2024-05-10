package interfaces;

import dtos.DetalleProductoDTO;
import dtos.UsuarioDTO;
import excepciones.BOException;

/**
 *
 * @author yohan
 */
public interface ICarritoBO {

    public void agregarDetalleProductoAlCarrito(UsuarioDTO usuario, DetalleProductoDTO nuevoDetalleProductoDTO) throws BOException;

    public void eliminarDetalleProductoCarrito(UsuarioDTO usuario, DetalleProductoDTO nuevoDetalleProductoDTO) throws BOException;
}
