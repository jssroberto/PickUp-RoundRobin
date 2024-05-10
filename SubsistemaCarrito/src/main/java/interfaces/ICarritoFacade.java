package interfaces;

import dtos.DetalleProductoDTO;
import dtos.UsuarioDTO;
import excepciones.BOException;

/**
 *
 * @author Roberto García
 */
public interface ICarritoFacade {

    public void agregarDetalleProducto(UsuarioDTO usuarioDTO, DetalleProductoDTO detalleProductoDTO) throws BOException;
}
