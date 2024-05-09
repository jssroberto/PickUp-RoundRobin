/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import DAOs.ProductoCafeteriaDAO;
import convertidores.ConvertidorDAOaDTO;
import convertidores.ConvertidorDTOaDAO;
import dominio.ProductoCafeteria;
import dtos.ProductoCafeteriaDTO;
import excepciones.PersistenciaException;
import excepciones.PersitenciaException;
import interfaces.IProductoCafeteriaBO;
import interfaces.IProductoCafeteriaDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jl4ma
 */
public class ProductoCafeteriaBO implements IProductoCafeteriaBO{
    
    IProductoCafeteriaDAO cafeteria = new ProductoCafeteriaDAO();
    ConvertidorDTOaDAO convertidor = new ConvertidorDTOaDAO();
    ConvertidorDAOaDTO convertidor2 = new ConvertidorDAOaDTO();
    
    public void actualizarProducto(ProductoCafeteriaDTO productoCafeteria) throws PersitenciaException{
        
        if(productoCafeteria==null){
            throw new PersitenciaException("producto vacio");
        }else{
            cafeteria.actualizarProducto(convertidor.convertirDTOenDAO(productoCafeteria));
        }
    }
    
    public ProductoCafeteriaDTO buscarProductoCafeteriaPorNombre(String nombreProducto) throws PersitenciaException {
        ProductoCafeteria producto;
        
        producto = cafeteria.buscarProductoCafeteriaPorNombre(nombreProducto);
        
        if (producto==null) {
            throw new PersitenciaException("producto vacio");
        }else{
            return convertidor2.convertirDAOenDTO(producto);
        }
    }
    
    public ProductoCafeteriaDTO buscarProductoCafeteriaPorID(Long id) throws PersitenciaException{
        ProductoCafeteria producto;
        
        producto = cafeteria.buscarProductoCafeteriaPorID(id);
        if(producto==null){
            throw new PersitenciaException("producto vacio");
        }else{
            return convertidor2.convertirDAOenDTO(producto);
        }
    }
    
    public List<ProductoCafeteriaDTO> obtenerTodosLosProductos() throws PersitenciaException{
        List<ProductoCafeteria> productos;
        List<ProductoCafeteriaDTO> productosDTO = new ArrayList<>();
        
        productos = cafeteria.obtenerTodosLosProductos();
        if(productos.isEmpty()){
            throw new PersitenciaException("lista vacia");
        }else{
            for(ProductoCafeteria pro: productos){
                productosDTO.add(convertidor2.convertirDAOenDTO(pro));
            }
            return productosDTO;
        }
        
    }
}
