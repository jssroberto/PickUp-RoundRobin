/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubsistemaConsultarProducto;

import excepciones.ExcepcionAT;
import org.itson.disenosw.dtos.ProductoDTO;

/**
 *
 * @author jl4ma
 */
public class ConsultarProducto implements IConsultarProducto {

    controlProducto cp = new controlProducto();

    @Override
    public ProductoDTO consultarProducto(ProductoDTO producto) throws ExcepcionAT {

        try {
            return cp.consultarProducto(producto.getNombre());
        } catch (ExcepcionAT e) {
            throw new ExcepcionAT(e.getMessage());
        }
    }

}
