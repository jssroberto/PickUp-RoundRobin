/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosNegocio;

import DAOs.ProductoCafeteriaDAO;
import dominio.ProductoCafeteria;
import excepciones.PersitenciaException;
import interfaces.IProductoCafeteriaBO;
import interfaces.IProductoCafeteriaDAO;
import java.util.List;




/**
 *
 * @author jl4ma
 */
public class ProductoCafeteriaBO implements IProductoCafeteriaBO {

    IProductoCafeteriaDAO cafeteria;
  
    public ProductoCafeteriaBO() {
        cafeteria = new ProductoCafeteriaDAO();

    }

    public List<ProductoCafeteria> obtenerTodosLosProductos() throws PersitenciaException {
        List<ProductoCafeteria> productos;

        productos = cafeteria.obtenerTodosLosProductos();
        if (productos.isEmpty()) {
            throw new PersitenciaException("lista vacia");
        } else {
            return productos;
        }
        

    }
}
