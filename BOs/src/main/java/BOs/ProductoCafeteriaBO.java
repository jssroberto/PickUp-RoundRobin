/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import DAOs.ProductoCafeteriaDAO;
import Interfaz.IProductoCafeteriaBO;
import dominio.ProductoCafeteria;
import excepciones.PersitenciaException;
import interfaces.IProductoCafeteriaDAO;
import java.util.List;

/**
 *
 * @author jl4ma
 */
public class ProductoCafeteriaBO implements IProductoCafeteriaBO {

    IProductoCafeteriaDAO cafeteria;
  
    public ProductoCafeteriaBO() {
        this.cafeteria = new ProductoCafeteriaDAO();

    }

    @Override
    public List<ProductoCafeteria> obtenerTodosLosProductos() throws PersitenciaException {
        List<ProductoCafeteria> productos;

        productos = cafeteria.obtenerTodosLosProductos();
        if (productos.isEmpty()) {
            throw new PersitenciaException("lista vacia");
        } else {
            return productos;
        }
    }

    @Override
    public ProductoCafeteria buscarProductoCafeteriaPorID(Long id) throws PersitenciaException {
        ProductoCafeteria pro;
        
        pro = cafeteria.buscarProductoCafeteriaPorID(id);
        
        if(pro == null){
            throw new PersitenciaException("producto no encontrado");
        } else {
            return pro;
        }
    }
}
