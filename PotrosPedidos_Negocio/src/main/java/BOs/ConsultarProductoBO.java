/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import DAOs.ProductoCafeteriaDAO;
import cafeteria.ProductoCafeteria;
import excepciones.ExcepcionAT;
import java.util.ArrayList;
import java.util.List;
import org.itson.disenosw.dtos.ProductoDTO;

/**
 *
 * @author yohan
 */
public class ConsultarProductoBO {

    ProductoCafeteriaDAO producto = new ProductoCafeteriaDAO();

    public ConsultarProductoBO() {
    }

    private ProductoDTO convertirDAOenDTO(ProductoCafeteria productoCafeteria) {
        ProductoDTO productoDTO = new ProductoDTO();
        productoDTO.setPrecio(productoCafeteria.getPrecio());
        productoDTO.setNombre(productoCafeteria.getNombre());
        productoDTO.setDescripcion(productoCafeteria.getDescripcion());
        productoDTO.setCantidadDisponible(productoCafeteria.getCantidadDisponible());
        productoDTO.setDireccionImagen(productoCafeteria.getDireccionImagen());
        productoDTO.setIdProductoCafeteria(productoCafeteria.getId());
        return productoDTO;
    }

    public ProductoDTO consultarProducto(String nombre) throws ExcepcionAT {
        if (nombre == null) {
            return null;
        }
        try {
            ProductoDTO p = this.convertirDAOenDTO(producto.buscarProductoCafeteriaPorNombre(nombre));
            return p;

        } catch (ExcepcionAT e) {
            throw new  ExcepcionAT(e.getMessage());
        }
    }
    
    public ProductoDTO consultarProductoID(Long id) throws ExcepcionAT {
        if (id <= 0) {
            return null;
        }
        try {
            ProductoDTO p = this.convertirDAOenDTO(producto.buscarProductoCafeteriaPorID(id));
            return p;

        } catch (ExcepcionAT e) {
            throw new  ExcepcionAT(e.getMessage());
        }
    }

    public List<ProductoDTO> consultarTodosLosProductos() throws ExcepcionAT {
        try {
            List<ProductoDTO> productosDTO = new ArrayList<>();
            
            // Aquí deberías llamar a tu DAO para obtener todos los productos
            List<ProductoCafeteria> productosCafeteria = producto.obtenerTodosLosProductos();
            
            // Convertir cada ProductoCafeteria en un ProductoDTO y agregarlo a la lista
            for (ProductoCafeteria productoCafeteria : productosCafeteria) {
                productosDTO.add(convertirDAOenDTO(productoCafeteria));
            }
            
            return productosDTO;
        } catch (ExcepcionAT e) {
            throw new ExcepcionAT(e.getMessage());
        }
    }
}
