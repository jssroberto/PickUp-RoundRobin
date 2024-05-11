/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dominio.Producto;
import dominio.Usuario;
import excepciones.PersistenciaException;
import interfaces.ICarritoBO;
import interfaces.IControlCarrito;
import java.util.logging.Level;
import java.util.logging.Logger;
import objetosNegocio.CarritoBO;

/**
 *
 * @author jl4ma
 */
public class ControlCarrito implements IControlCarrito{
    ICarritoBO carro;
    
    public ControlCarrito(){
        carro = new CarritoBO();
    }
    
    @Override
    public boolean agregarCarrito(Usuario usuarioId, Producto product, int cantidad) throws PersistenciaException{
        carro.agregarCarrito(usuarioId, product, cantidad);
        return true;
    }
}