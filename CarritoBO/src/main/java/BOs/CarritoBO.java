/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import DAOs.UsuarioDAO;
import dominio.DetalleProducto;
import dominioVIEJO.Carrito;
import dominioVIEJO.DetalleCarrito;
import dominioVIEJO.Producto;
import dominioVIEJO.Usuario;
import excepciones.PersistenciaException;

import java.util.List;

/**
 *
 * @author yohan
 */
public class CarritoBO {

    UsuarioDAO carrito = new UsuarioDAO();

//    public void agregarDetalleProductoAlCarrito(UsuarioDTO usuario, DetalleProductoDTO nuevoDetalleProductoDTO) throws PersistenciaException {
//        try {
//            carrito.agregarDetalleProductoAlCarrito(usuario.getId, nuevoDetalleProductoDTO);
//        } catch (Exception e) {
//            throw new PersistenciaException(e.getMessage());
//        }
//    }
////
//    public void eliminarProductoCarrito(UsuarioDTO usuario, DetalleProductoDTO  nuevoDetalleProductoDTO)throws PersistenciaException {
//    try {
//        carrito.eliminarProductoCarrito(usuario.getId, nuevoDetalleProductoDTO);
//        } catch (Exception e) {
//            throw new PersistenciaException(e.getMessage());
//        }
//    }
//
//    public void vaciarCarrito(UsuarioDTO usuario, CarritoDTO carrito) throws PersistenciaException {
//
//    }

//
//    public static Producto DTOaEntity(ProductoDTO dto) {
//        return new Producto(dto.getPrecio(), dto.getNombre(), dto.getDescripcion(), dto.getDireccionImagen(), dto.getIdProductoCafeteria());
//    }
//
}
