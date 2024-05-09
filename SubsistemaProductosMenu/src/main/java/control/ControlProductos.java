/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dtos.ProductoCafeteriaDTO;
import excepciones.PersitenciaException;
import interfaces.IControlProductos;
import java.util.List;
import metodos.ConsultarProductos;

/**
 *
 * @author jl4ma
 */
public class ControlProductos implements IControlProductos{
    
    ConsultarProductos consultar = new ConsultarProductos();
    
    public ProductoCafeteriaDTO buscarProductoCafeteriaPorID(Long id) throws PersitenciaException{
        if(consultar.buscarProductoCafeteriaPorID(id)!=null){
            return consultar.buscarProductoCafeteriaPorID(id);
        }else{
            return null;
        }
    }
    
    public List<ProductoCafeteriaDTO> obtenerTodosLosProductos() throws PersitenciaException{
        
        return consultar.obtenerTodosLosProductos();
    }
}
