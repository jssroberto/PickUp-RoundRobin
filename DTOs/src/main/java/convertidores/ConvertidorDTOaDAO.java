/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

import dominio.Carrito;
import dominio.DetalleProducto;
import dominio.Pedido;
import dominio.Producto;
import dominio.ProductoCafeteria;
import dominio.Tarjeta;
import dominio.Usuario;
import dtos.CarritoDTO;
import dtos.DetalleProductoDTO;
import dtos.PedidoDTO;
import dtos.ProductoCafeteriaDTO;
import dtos.ProductoDTO;
import dtos.TarjetaDTO;
import dtos.UsuarioDTO;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author galan
 */
public class ConvertidorDTOaDAO {

    public Usuario convertirDTOenDAO(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();

        usuario.setApellidoMaterno(usuarioDTO.getApellidoMaterno());
        usuario.setApellidoPaterno(usuarioDTO.getApellidoPaterno());
        usuario.setCarrito(convertirDTOenDAO(usuarioDTO.getCarrito()));
        usuario.setFechanacimiento(usuarioDTO.getFechanacimiento());
        usuario.setId(usuarioDTO.getId());
        usuario.setIdCia(usuarioDTO.getIdCia());
        usuario.setSaldoPuntos(usuario.getSaldoPuntos());

        List<ObjectId> lista = new ArrayList<>();
        for (String pedido : usuarioDTO.getPedidos()) {
            lista.add(new ObjectId(pedido));
        }
        usuario.setPedidos(lista);

        return usuario;
    }

    public Producto convertirDTOenDAO(ProductoDTO productoDTO) {
        Producto producto = new Producto();

        producto.setDescripcion(productoDTO.getDescripcion());
        producto.setDireccionImagen(productoDTO.getDireccionImagen());
        producto.setId(new ObjectId(productoDTO.getId()));
        producto.setNombre(productoDTO.getNombre());
        producto.setPrecio(productoDTO.getPrecio());
        producto.setPuntosCuesta(productoDTO.getPuntosCuesta());
        producto.setPuntosGenera(productoDTO.getPuntosGenera());

        return producto;
    }

    public ProductoCafeteria convertirDTOenDAO(ProductoCafeteriaDTO productoCafeteriaDTO) {
        ProductoCafeteria productoCafeteria = new ProductoCafeteria();

        productoCafeteria.setPrecio(productoCafeteriaDTO.getPrecio());
        productoCafeteria.setNombre(productoCafeteriaDTO.getNombre());
        productoCafeteria.setDescripcion(productoCafeteriaDTO.getDescripcion());
        productoCafeteria.setCantidadDisponible(productoCafeteriaDTO.getCantidadDisponible());
        productoCafeteria.setDireccionImagen(productoCafeteriaDTO.getDireccionImagen());
        productoCafeteria.setId(productoCafeteriaDTO.getIdProductoCafeteria());

        return productoCafeteria;
    }

    public Carrito convertirDTOenDAO(CarritoDTO carritoDTO) {
        Carrito carrito = new Carrito();

        carrito.setId(new ObjectId(carritoDTO.getId()));
        carrito.setTotal(carritoDTO.getTotal());

        List<DetalleProducto> lista = new ArrayList<>();
        for (DetalleProductoDTO producto : carritoDTO.getProductos()) {
            lista.add(convertirDTOenDAO(producto));
        }
        carrito.setProductos(lista);

        return carrito;
    }

    public DetalleProducto convertirDTOenDAO(DetalleProductoDTO detalleProductoDTO) {
        DetalleProducto detalleProducto = new DetalleProducto();

        detalleProducto.setCantidad(detalleProductoDTO.getCantidad());
        detalleProducto.setProducto(convertirDTOenDAO(detalleProductoDTO.getProducto()));
        detalleProducto.setId(new ObjectId(detalleProductoDTO.getId()));
        detalleProducto.setSubtotal(detalleProductoDTO.getSubtotal());

        return detalleProducto;
    }

    public Tarjeta convertirDTOenDAO(TarjetaDTO tarjetaDTO) {
        Tarjeta tarjeta = new Tarjeta();

        tarjeta.setCvv(tarjetaDTO.getCvv());
        tarjeta.setFechaVencimiento(tarjetaDTO.getFechaVencimiento());
        tarjeta.setId(tarjetaDTO.getId());
        tarjeta.setNumeroTarjeta(tarjetaDTO.getNumeroTarjeta());
        tarjeta.setSaldo(tarjetaDTO.getSaldo());
        return tarjeta;
    }

    public Pedido convertirDAOenDTO(PedidoDTO pedidoDTO) {
        Pedido pedido = new Pedido();

        pedido.setClaveRecoleccion(pedidoDTO.getClaveRecoleccion());
        pedido.setEtiquetaPedido(pedidoDTO.getEtiquetaPedido());
        pedido.setFecha(pedidoDTO.getFecha());
        pedido.setIdPedido(new ObjectId(pedidoDTO.getIdPedido()));
        pedido.setMetodoPago(pedidoDTO.getMetodoPago());
        pedido.setNumeroPedido(pedidoDTO.getNumeroPedido());
        pedido.setNumeroProductos(pedidoDTO.getNumeroProductos());
        pedido.setTotal(pedidoDTO.getTotal());

        List<DetalleProducto> lista = new ArrayList<>();
        for (DetalleProductoDTO producto : pedidoDTO.getDetalleProductos()) {
            lista.add(convertirDTOenDAO(producto));
        }
        pedido.setDetalleProductos(lista);

        return pedido;
    }
}
