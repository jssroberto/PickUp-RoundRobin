/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosNegocio;

import DAOs.UsuarioDAO;
import convertidores.ConvertidorDTOaDAO;
import dominio.DetalleProducto;
import dominioVIEJO.Carrito;
import dominioVIEJO.DetalleCarrito;
import dominioVIEJO.Producto;
import dominioVIEJO.Usuario;
import dtos.CarritoDTO;
import dtos.DetalleProductoDTO;
import dtos.UsuarioDTO;
import excepciones.PersistenciaException;

import java.util.List;

/**
 *
 * @author yohan
 */
public class CarritoBO {

    UsuarioDAO carrito = new UsuarioDAO();
    ConvertidorDTOaDAO convertir = new ConvertidorDTOaDAO();

    public void agregarDetalleProductoAlCarrito(UsuarioDTO usuario, DetalleProductoDTO nuevoDetalleProductoDTO) throws PersistenciaException {
        if (usuario == null || nuevoDetalleProductoDTO == null) {
            throw new PersistenciaException("Usuario o DetalleProducto vacio");
        } else {
            carrito.agregarDetalleProductoAlCarrito(usuario.getId(), convertir.convertirDTOenDAO(nuevoDetalleProductoDTO));
        }
    }
//
    public void eliminarProductoCarrito(UsuarioDTO usuario, DetalleProductoDTO nuevoDetalleProductoDTO) throws PersistenciaException {
        if (usuario == null || nuevoDetalleProductoDTO == null) {
            throw new PersistenciaException("Usuario o DetalleProducto vacio");
        } else {
            carrito.eliminarProductoCarrito(usuario.getId(), convertir.convertirDTOenDAO(nuevoDetalleProductoDTO));
        }
    }

    public void vaciarCarrito(UsuarioDTO usuario, CarritoDTO carrito) throws PersistenciaException {

    }
}