/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubsistemaConsultarProducto;

import excepciones.ExcepcionAT;
import org.itson.disenosw.dtos.productoDTO;

/**
 *
 * @author jl4ma
 */
public class ConsultarProducto implements IConsultarProducto {

    controlProducto cp = new controlProducto();

    @Override
    public productoDTO consultarProducto(productoDTO producto) throws ExcepcionAT {

        try {
            return cp.consultarProducto(producto.getNombre());
        } catch (ExcepcionAT e) {
            throw new ExcepcionAT(e.getMessage());
        }
    }

}
