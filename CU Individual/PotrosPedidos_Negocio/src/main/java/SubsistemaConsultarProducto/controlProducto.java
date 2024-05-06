/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubsistemaConsultarProducto;

import BOs.ConsultarProductoBO;
import excepciones.ExcepcionAT;



/**
 *
 * @author yohan
 */
public class controlProducto {

    ConsultarProductoBO p = new ConsultarProductoBO();

    public boolean consultarProducto(Long id) throws ExcepcionAT {
        try {
            return  p.consultarProducto(id);
        } catch (ExcepcionAT e) {
            throw new ExcepcionAT(e.getMessage());
        }
    }
}
