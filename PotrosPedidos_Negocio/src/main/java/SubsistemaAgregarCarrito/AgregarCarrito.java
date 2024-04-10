/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubsistemaAgregarCarrito;

import Mock.Carrito;
import Mock.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jl4ma
 */
public class AgregarCarrito implements IAgregarCarrito{
    List<Carrito> carrito = new ArrayList<>();
    Carrito cart = new Carrito();
    
    @Override
    public boolean agregarCarrito(Producto producto, Integer cantidad) {
        if(producto != null){
            float costo = producto.getCosto()*cantidad;
            carrito.add(new Carrito(cantidad, costo, producto));
            cart.setCarrito(carrito);
            return true;
        }else{
            return false;
    }
        
    }
    
    
}
