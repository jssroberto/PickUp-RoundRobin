/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dominio.Producto;
import dominio.Usuario;
import excepciones.PersistenciaException;

/**
 *
 * @author jl4ma
 */
public interface IControlCarrito {
    
    public boolean agregarCarrito(Usuario usuarioId, Producto product, int cantidad) throws PersistenciaException;
}
