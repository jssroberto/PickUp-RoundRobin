/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dominio.ProductoCafeteria;
import dtos.ProductoCafeteriaDTO;
import excepciones.PersitenciaException;
import java.util.List;

/**
 *
 * @author jl4ma
 */
public interface IProductoCafeteriaBO {
    
    public void actualizarProducto(ProductoCafeteriaDTO productoCafeteria) throws PersitenciaException;
    public ProductoCafeteriaDTO buscarProductoCafeteriaPorNombre(String nombreProducto) throws PersitenciaException;
    public ProductoCafeteriaDTO buscarProductoCafeteriaPorID(Long id) throws PersitenciaException;
    public List<ProductoCafeteriaDTO> obtenerTodosLosProductos() throws PersitenciaException;
}
