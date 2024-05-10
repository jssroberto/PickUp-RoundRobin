/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosNegocio;

import DAOs.CarritoDAO;
import DAOs.UsuarioDAO;
import IDAOs.ICarritoDAO;
import convertidores.ConvertidorDTOaDAO;
import dominio.DetalleProducto;
import dominioVIEJO.Carrito;
import dominioVIEJO.DetalleCarrito;
import dominioVIEJO.Producto;
import dominioVIEJO.Usuario;
import dtos.CarritoDTO;
import dtos.DetalleProductoDTO;
import dtos.UsuarioDTO;
import excepciones.BOException;
import excepciones.PersistenciaException;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yohan
 */
public class CarritoBO {

    ICarritoDAO carrito = new CarritoDAO();
    ConvertidorDTOaDAO convertir = new ConvertidorDTOaDAO();

    public void agregarDetalleProductoAlCarrito(UsuarioDTO usuario, DetalleProductoDTO nuevoDetalleProductoDTO) throws BOException {
        if (usuario == null || nuevoDetalleProductoDTO == null) {
            throw new BOException("Usuario o DetalleProducto vacio");
        } else {
            try {
                carrito.agregarDetalleProducto(usuario.getId(), convertir.convertirDTOenDAO(nuevoDetalleProductoDTO));
            } catch (PersistenciaException ex) {
                throw new BOException(ex.getMessage(), ex);
            }
        }
    }
//

    public void eliminarProductoCarrito(UsuarioDTO usuario, DetalleProductoDTO nuevoDetalleProductoDTO) throws BOException {
        if (usuario == null || nuevoDetalleProductoDTO == null) {
            throw new BOException("Usuario o DetalleProducto vacio");
        } else {
            try {
                carrito.eliminarDetalleProducto(usuario.getId(), convertir.convertirDTOenDAO(nuevoDetalleProductoDTO));
            } catch (PersistenciaException ex) {
                throw new BOException(ex.getMessage(), ex);
            }
        }
    }

    public void vaciarCarrito(UsuarioDTO usuario, CarritoDTO carrito) throws BOException {

    }
}
