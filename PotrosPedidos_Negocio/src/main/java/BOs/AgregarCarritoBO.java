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
import excepciones.ExcepcionAT;
import java.util.List;
import org.itson.disenosw.dtos.productoDTO;

/**
 *
 * @author yohan
 */
public class AgregarCarritoBO {

    CarritoDAO c = new CarritoDAO();
    DetalleCarritoDAO d = new DetalleCarritoDAO();
    UsuarioDAO u = new UsuarioDAO();

    public static Producto DTOaEntity(productoDTO dto) {
        return new Producto(dto.getPrecio(), dto.getNombre(), dto.getDescripcion(), dto.getDireccionImagen(), dto.getIdProductoCafeteria());
    }

    public void agregarCarrito(productoDTO producto, String idUsuarioCia, Integer cantidad) throws ExcepcionAT {
        if (producto == null) {
            throw new ExcepcionAT("producto vacio");
        }
        if (idUsuarioCia == null || idUsuarioCia.isEmpty()) {
            throw new ExcepcionAT("El ID de usuario está vacío");
        }
        if (cantidad == null || cantidad <= 0) {
            throw new ExcepcionAT("La cantidad debe ser un número positivo");
        }

        try {
            float total = 0;
            for (int i = 0; i < cantidad; i++) {
                total = total + producto.getPrecio();
            }
            Carrito carrito = new Carrito(0.0f, 0, u.buscarUsuarioPorIdCIA(idUsuarioCia));
            Producto p = this.DTOaEntity(producto);
            DetalleCarrito dc = new DetalleCarrito(carrito, p, cantidad, total);
            d.insertarDetalleCarrito(dc);
        } catch (ExcepcionAT e) {
            throw new ExcepcionAT(e.getMessage());

        }

    }
}
