/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dominio.ProductoCafeteria;
import excepciones.PersitenciaException;
import java.util.List;

/**
 *
 * @author jl4ma
 */
public interface IProductoCafeteriaDAO {
    
    public void actualizarProducto(ProductoCafeteria productoCafeteria) throws PersitenciaException;
    public ProductoCafeteria buscarProductoCafeteriaPorNombre(String nombreProducto) throws PersitenciaException;
    public ProductoCafeteria buscarProductoCafeteriaPorID(Long id) throws PersitenciaException;
    public List<ProductoCafeteria> obtenerTodosLosProductos() throws PersitenciaException;
}