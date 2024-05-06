/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import DAOs.ProductoDAO;
import IDAOs.IProductoDAO;
import excepciones.ExcepcionAT;
import java.util.ArrayList;
import java.util.List;
import mocks.Producto;
import org.itson.disenosw.dtos.ProductoDTO;

/**
 *
 * @author yohan
 */
public class BusquedaBO {

    IProductoDAO p = new ProductoDAO();

    private ProductoDTO convertirDAOenDTO(Producto producto) {
        ProductoDTO productoDTO = new ProductoDTO();
        productoDTO.setPrecio(producto.getCosto());
        productoDTO.setNombre(producto.getNombre());
        productoDTO.setDescripcion(producto.getDescripcion());
        productoDTO.setCantidadDisponible(producto.getCantidad());
        productoDTO.setDireccionImagen(producto.getRutaImagen());
        productoDTO.setIdProductoCafeteria(producto.getId());
        return productoDTO;
    }

    public List<ProductoDTO> consultarProductos(String palabra) throws ExcepcionAT {
        try {
            List<ProductoDTO> productosDTO = new ArrayList<>();

            // Aquí deberías llamar a tu DAO para obtener todos los productos
            List<Producto> productosCafeteria = p.BuscarProductos(palabra);

            // Convertir cada ProductoCafeteria en un ProductoDTO y agregarlo a la lista
            for (Producto productos : productosCafeteria) {
                productosDTO.add(convertirDAOenDTO(productos));
            }
            return productosDTO;
        } catch (ExcepcionAT e) {
            throw new ExcepcionAT(e.getMessage());
        }
    }
}
