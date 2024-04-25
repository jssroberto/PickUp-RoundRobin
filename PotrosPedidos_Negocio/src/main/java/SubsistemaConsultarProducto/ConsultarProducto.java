/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubsistemaConsultarProducto;

import excepciones.PersistenciaException;
import org.itson.disenosw.dtos.ProductoDTO;

/**
 *
 * @author jl4ma
 */
public class ConsultarProducto implements IConsultarProducto {

    controlProducto cp = new controlProducto();

    @Override
    public ProductoDTO consultarProducto(ProductoDTO producto) throws PersistenciaException {

        try {
            return cp.consultarProducto(producto.getNombre());
        } catch (PersistenciaException e) {
            throw new PersistenciaException(e.getMessage());
        }
    }

}
