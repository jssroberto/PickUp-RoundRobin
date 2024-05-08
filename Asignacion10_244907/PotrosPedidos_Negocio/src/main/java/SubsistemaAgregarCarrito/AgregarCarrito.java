/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubsistemaAgregarCarrito;

import BOs.AgregarCarritoBO;
import excepciones.ExcepcionAT;



/**
 *
 * @author jl4ma
 */
public class AgregarCarrito   {

    AgregarCarritoBO carrito = new AgregarCarritoBO();
    
    public boolean carrito(Long id) throws ExcepcionAT{
        if(carrito.carrito(id)){
            return true;
        }else{
            return false;
        }
                
    }

}
