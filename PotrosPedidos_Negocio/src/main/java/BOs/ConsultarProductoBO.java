/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import DAOs.ProductoCafeteriaDAO;
import cafeteria.ProductoCafeteria;
import excepciones.ExcepcionAT;
import org.itson.disenosw.dtos.productoDTO;

/**
 *
 * @author yohan
 */
public class ConsultarProductoBO {

    ProductoCafeteriaDAO producto = new ProductoCafeteriaDAO();

    public ConsultarProductoBO() {
    }

    private productoDTO convertirDAOenDTO(ProductoCafeteria productoCafeteria) {
        productoDTO productoDTO = new productoDTO();
        productoDTO.setPrecio(productoCafeteria.getPrecio());
        productoDTO.setNombre(productoCafeteria.getNombre());
        productoDTO.setDescripcion(productoCafeteria.getDescripcion());
        productoDTO.setCantidadDisponible(productoCafeteria.getCantidadDisponible());
        productoDTO.setDireccionImagen(productoCafeteria.getDireccionImagen());
        productoDTO.setIdProductoCafeteria(productoCafeteria.getId());
        return productoDTO;
    }

    public productoDTO consultarProducto(String nombre) throws ExcepcionAT {
        if (nombre == null) {
            return null;
        }
        try {
            productoDTO p = this.convertirDAOenDTO(producto.buscarProductoCafeteriaPorNombre(nombre));
            return p;

        } catch (ExcepcionAT e) {
            throw new  ExcepcionAT(e.getMessage());
        }
    }
    
    public productoDTO consultarProductoID(Long id) throws ExcepcionAT {
        if (id <= 0) {
            return null;
        }
        try {
            productoDTO p = this.convertirDAOenDTO(producto.buscarProductoCafeteriaPorID(id));
            return p;

        } catch (ExcepcionAT e) {
            throw new  ExcepcionAT(e.getMessage());
        }
    }

}
