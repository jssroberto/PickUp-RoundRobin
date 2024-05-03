/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import DAOs.CarritoDAO;
import DAOs.DetalleCarritoDAO;
import DAOs.UsuarioDAO;
import dominio.Carrito;
import dominio.DetalleCarrito;
import dominio.Producto;
import dominio.Usuario;
import excepciones.PersistenciaException;

import java.util.List;
import org.itson.disenosw.dtos.ProductoDTO;


/**
 *
 * @author yohan
 */
public class AgregarCarritoBO {

    CarritoDAO c = new CarritoDAO();
    DetalleCarritoDAO d = new DetalleCarritoDAO();
    UsuarioDAO u = new UsuarioDAO();

    public static Producto DTOaEntity(ProductoDTO dto) {
        return new Producto(dto.getPrecio(), dto.getNombre(), dto.getDescripcion(), dto.getDireccionImagen(), dto.getIdProductoCafeteria());
    }

    public void agregarCarrito(ProductoDTO producto, String idUsuarioCia, Integer cantidad, Long idProducto) throws PersistenciaException {
        if (producto == null) {
            throw new PersistenciaException("producto vacio");
        }
        if (idUsuarioCia == null || idUsuarioCia.isEmpty()) {
            throw new PersistenciaException("El ID de usuario está vacío");
        }
        if (cantidad == null || cantidad <= 0) {
            throw new PersistenciaException("La cantidad debe ser un número positivo");
        }

        try {
            float total = cantidad * producto.getPrecio();
            Usuario usuario= u.buscarUsuarioPorIdCIA(idUsuarioCia);
            Carrito carrito = c.buscarCarritoPorUsuario(usuario);
            Producto p = this.DTOaEntity(producto);
            p.setId(idProducto);
            DetalleCarrito dc = new DetalleCarrito(carrito, p, cantidad, total);
            d.insertarDetalleCarrito(dc);
        } catch (PersistenciaException e) {
            throw new PersistenciaException(e.getMessage());

        }

    }
}
