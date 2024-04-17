/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package SubsistemaConsultarProducto;

import mocks.Productos;
import java.util.ArrayList;
import java.util.List;
import org.itson.disenosw.dtos.productoDTO;

/**
 *
 * @author jl4ma
 */
public interface IConsultarProducto {
    
    public Productos consultarProducto(productoDTO producto);
    
}
