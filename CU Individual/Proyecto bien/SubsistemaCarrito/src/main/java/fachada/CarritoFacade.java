package fachada;

import control.ControlCarrito;
import dtos.DetalleProductoDTO;
import dtos.UsuarioDTO;
import excepciones.BOException;
import interfaces.ICarritoBO;
import interfaces.ICarritoFacade;

/**
 *
 * @author Roberto García
 */
public class CarritoFacade implements ICarritoFacade{
    
    ControlCarrito control;

    public CarritoFacade() {
        this.control = new ControlCarrito();
    }
    
    @Override
    public void agregarDetalleProducto(UsuarioDTO usuarioDTO, DetalleProductoDTO detalleProductoDTO) throws BOException{
        control.agregarDetalleProducto(usuarioDTO, detalleProductoDTO);
    }

}
