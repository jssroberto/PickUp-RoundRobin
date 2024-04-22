/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubsistemaAgregarCarrito;

import mocks.Carrito;
import java.util.List;

/**
 *
 * @author jl4ma
 */
public class SacarPrecio {

    public float sacarPrecio(List<Carrito> carrito) {
        float costo = 0;
        for(Carrito car: carrito){
            costo += car.getCostoFinal();
        }
        if (costo>= 0) {
            return costo;
        }else{
            return -1f;
        }
    }
    
}
