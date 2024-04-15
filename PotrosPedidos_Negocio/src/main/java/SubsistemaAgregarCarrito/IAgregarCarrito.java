/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package SubsistemaAgregarCarrito;

import Mock.Carrito;
import Mock.Productos;
import org.itson.disenosw.dominio.Usuario;

/**
 *
 * @author jl4ma
 */
public interface IAgregarCarrito {
    
    public boolean agregarCarrito(Productos producto, Integer cantidad, Usuario usuario);
}
