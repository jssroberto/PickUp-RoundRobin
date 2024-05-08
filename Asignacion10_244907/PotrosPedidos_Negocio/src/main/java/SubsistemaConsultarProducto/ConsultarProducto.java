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
public class ConsultarProducto implements IConsultarProducto{
    controlProducto p = new controlProducto();

    @Override
    public boolean consultarProducto(Long id) throws ExcepcionAT {
        try {
            return  p.consultarProducto(id);
        } catch (ExcepcionAT e) {
            throw new ExcepcionAT(e.getMessage());
        }
    }
    

}
