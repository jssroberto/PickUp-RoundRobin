/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dtos.ProductoCafeteriaDTO;
import excepciones.PersitenciaException;
import java.util.List;

/**
 *
 * @author jl4ma
 */
public interface IControlProductos {
    
    public ProductoCafeteriaDTO buscarProductoCafeteriaPorID(Long id) throws PersitenciaException;
    public List<ProductoCafeteriaDTO> obtenerTodosLosProductos() throws PersitenciaException;
}
