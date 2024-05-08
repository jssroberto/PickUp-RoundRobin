/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubsistemaAgregarCarrito;

import BOs.AgregarCarritoBO;
import excepciones.ExcepcionAT;
import org.itson.disenosw.dtos.ProductoDTO;

/**
 *
 * @author yohan
 */
public class controlCarrito {

    AgregarCarrito carro = new AgregarCarrito();
    AgregarCarritoBO detalle = new AgregarCarritoBO();
        
    public boolean carro(Long id) throws ExcepcionAT{
        if (carro.carrito(id)) {
            return true;
        }else{
            return false;
        }
    }
    
    public boolean detalle(Long id) throws ExcepcionAT{
        
        if (detalle.detalle(id)) {
            return true;
        }else{
            return false;
        }
    }
}
