/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

import DAOs.CarritoDAO;
import DAOs.DetalleCarritoDAO;
import DAOs.ProductoCafeteriaDAO;
import DAOs.ProductoDAO;
import DAOs.UsuarioDAO;
import com.mycompany.cafeteria.ProductoCafeteria;
import dominio.Carrito;
import dominio.DetalleCarrito;
import dominio.Usuario;
import excepciones.PersistenciaException;
import java.util.List;

/**
 *
 * @author USER
 */
public class PruebaDAOS {

    public static void main(String[] args) throws PersistenciaException {
        ProductoDAO productoDAO = new ProductoDAO();
        ProductoCafeteriaDAO productoCafeteriaDAO = new ProductoCafeteriaDAO();
        DetalleCarritoDAO detalleCarritoDAO = new DetalleCarritoDAO();
        CarritoDAO carritoDAO = new CarritoDAO();
        UsuarioDAO usuarioDAO = new UsuarioDAO();

//        System.out.println(productoDAO.buscarProductoPorNombre("Torta cubana").toString());

        ProductoCafeteria productoCafeteria = productoCafeteriaDAO.buscarProductoCafeteriaPorID(1L);
        System.out.println(productoCafeteria);
        productoCafeteria.setCantidadDisponible(13);
        productoCafeteriaDAO.actualizarProducto(productoCafeteria);

        Usuario usuario = usuarioDAO.buscarUsuarioPorIdCIA("00000011211");

        Carrito carrito = carritoDAO.buscarCarritoPorUsuario(usuario);

        List<DetalleCarrito> detallesCarrito = detalleCarritoDAO.buscarListaDetalleCarrito(carrito);
        DetalleCarritoDAO d = new DetalleCarritoDAO();

        for (DetalleCarrito detalleCarrito : detallesCarrito) {

            System.out.println(detalleCarrito.getProducto().getNombre());
            System.out.println(detalleCarrito.getCantidad());
            d.eliminarDetalleCarrito(detalleCarrito);

        }
    }
}
