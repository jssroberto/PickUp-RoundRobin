/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dominio.ProductoCafeteria;
import excepciones.CafeteriaException;
import java.util.List;

/**
 *
 * @author jl4ma
 */
public interface IProductoCafeteriaDAO {
    
    public void actualizarProducto(ProductoCafeteria productoCafeteria) throws CafeteriaException;
    public ProductoCafeteria buscarProductoCafeteriaPorNombre(String nombreProducto) throws CafeteriaException;
    public ProductoCafeteria buscarProductoCafeteriaPorID(Long id) throws CafeteriaException;
    public List<ProductoCafeteria> obtenerTodosLosProductos() throws CafeteriaException;
}
