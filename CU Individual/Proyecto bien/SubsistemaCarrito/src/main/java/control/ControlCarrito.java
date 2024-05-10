package control;

import dtos.DetalleProductoDTO;
import dtos.UsuarioDTO;
import excepciones.BOException;
import interfaces.ICarritoBO;
import objetosNegocio.CarritoBO;

/**
 *
 * @author Roberto García
 */
public class ControlCarrito{

    ICarritoBO carritoBO;

    public ControlCarrito() {
        this.carritoBO = new CarritoBO();
    }

    public void agregarDetalleProducto(UsuarioDTO usuarioDTO, DetalleProductoDTO detalleProductoDTO) throws BOException {
        try {
            carritoBO.agregarDetalleProductoAlCarrito(usuarioDTO, detalleProductoDTO);
        } catch (BOException ex) {
            throw new BOException(ex.getMessage(), ex);
        }
    }

    public void eliminarDetalleProducto(UsuarioDTO usuarioDTO, DetalleProductoDTO detalleProductoDTO) throws BOException {
        try {
            carritoBO.eliminarDetalleProductoCarrito(
                    usuarioDTO, detalleProductoDTO);
        } catch (BOException ex) {
            throw new BOException(ex.getMessage(), ex);
        }
    }

}
