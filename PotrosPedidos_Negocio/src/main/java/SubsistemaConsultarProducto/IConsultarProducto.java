/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package SubsistemaConsultarProducto;


import excepciones.ExcepcionAT;
import org.itson.disenosw.dtos.productoDTO;

/**
 *
 * @author jl4ma
 */
public interface IConsultarProducto {
    
    public productoDTO consultarProducto(productoDTO producto) throws ExcepcionAT;
     
}
