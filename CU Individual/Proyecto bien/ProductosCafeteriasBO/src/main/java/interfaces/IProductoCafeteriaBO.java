/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dtos.ProductoCafeteriaDTO;
import excepciones.BOException;
import java.util.List;

/**
 *
 * @author jl4ma
 */
public interface IProductoCafeteriaBO {
    
   
    public List<ProductoCafeteriaDTO> obtenerTodosLosProductos() throws BOException;
}
