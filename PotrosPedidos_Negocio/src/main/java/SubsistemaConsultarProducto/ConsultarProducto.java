/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class ConsultarProducto implements IConsultarProducto{

    consultaPedidoBO cp = new consultaPedidoBO();
    
    @Override
    public Productos consultarProducto(productoDTO producto) {     
    
        return cp.consultarProducto(producto.getId());
    }

    @Override
    public Productos consultarProducto(Integer ID) {
        return cp.consultarProducto(ID);
    }
    
    
}
