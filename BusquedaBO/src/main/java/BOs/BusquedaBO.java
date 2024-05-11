/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import DAOs.ProductoCafeteriaDAO;
import Interfaz.IBusquedaBO;
import dominio.ProductoCafeteria;
import dtos.ProductoCafeteriaDTO;
import excepciones.PersitenciaException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yohan
 */
public class BusquedaBO implements IBusquedaBO {
    ProductoCafeteriaDAO productoCafeteriaDAO = new ProductoCafeteriaDAO();

    public ProductoCafeteriaDTO convertirDAOenDTO(ProductoCafeteria productoCafeteria) {
        ProductoCafeteriaDTO productoCafeteriaDTO = new ProductoCafeteriaDTO();

        productoCafeteriaDTO.setPrecio(productoCafeteria.getPrecio());
        productoCafeteriaDTO.setNombre(productoCafeteria.getNombre());
        productoCafeteriaDTO.setDescripcion(productoCafeteria.getDescripcion());
        productoCafeteriaDTO.setCantidadDisponible(productoCafeteria.getCantidadDisponible());
        productoCafeteriaDTO.setDireccionImagen(productoCafeteria.getDireccionImagen());
        productoCafeteriaDTO.setIdProductoCafeteria(productoCafeteria.getId());
        return productoCafeteriaDTO;
    }

    @Override
    public List<ProductoCafeteriaDTO> consultarProductos(String palabra) throws PersitenciaException {
        try {
            List<ProductoCafeteriaDTO> productosDTO = new ArrayList<>();
            List<ProductoCafeteria> productosCafeteria = productoCafeteriaDAO.consultarProductos(palabra);

            for (ProductoCafeteria producto : productosCafeteria) {
                ProductoCafeteriaDTO dto = this.convertirDAOenDTO(producto);
                productosDTO.add(dto);
            }
            return productosDTO;
        } catch (PersitenciaException e) {
            throw new PersitenciaException(e.getMessage());
        }
    }

    public List<ProductoCafeteriaDTO> ordenarProductosAZ() throws PersitenciaException {
        try {
            List<ProductoCafeteriaDTO> productosDTO = new ArrayList<>();
            List<ProductoCafeteria> productosCafeteria = productoCafeteriaDAO.ordenarProductosAZ();

            for (ProductoCafeteria producto : productosCafeteria) {
                ProductoCafeteriaDTO dto = this.convertirDAOenDTO(producto);
                productosDTO.add(dto);
            }
            return productosDTO;
        } catch (PersitenciaException e) {
            throw new PersitenciaException(e.getMessage());
        }
    }

    public List<ProductoCafeteriaDTO> ordenarProductosZA() throws PersitenciaException {
        try {
            List<ProductoCafeteriaDTO> productosDTO = new ArrayList<>();
            List<ProductoCafeteria> productosCafeteria = productoCafeteriaDAO.ordenarProductosZA();

            for (ProductoCafeteria producto : productosCafeteria) {
                ProductoCafeteriaDTO dto = this.convertirDAOenDTO(producto);
                productosDTO.add(dto);
            }
            return productosDTO;
        } catch (PersitenciaException e) {
            throw new PersitenciaException(e.getMessage());
        }
    }

    public List<ProductoCafeteriaDTO> ordenarProductosPorPrecio() throws PersitenciaException {
        try {
            List<ProductoCafeteriaDTO> productosDTO = new ArrayList<>();
            List<ProductoCafeteria> productosCafeteria = productoCafeteriaDAO.ordenarProductosPorPrecio();

            for (ProductoCafeteria producto : productosCafeteria) {
                ProductoCafeteriaDTO dto = this.convertirDAOenDTO(producto);
                productosDTO.add(dto);
            }
            return productosDTO;
        } catch (PersitenciaException e) {
            throw new PersitenciaException(e.getMessage());
        }
    }

}
