/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

<<<<<<< HEAD
import BOs.CarritoBO;
=======
import dominio.DetalleProducto;
>>>>>>> Compra-tarjeta
import dominio.Producto;
import dominio.Usuario;
import excepciones.PersistenciaException;
import Interfaz.ICarritoBO;
import interfaces.IControlCarrito;
<<<<<<< HEAD
=======
import java.util.logging.Level;
import java.util.logging.Logger;
import objetosNegocio.CarritoBO;
import org.bson.types.ObjectId;
>>>>>>> Compra-tarjeta

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
    
    @Override
    public void vaciarCarrito(Usuario user){
        carro.vaciarCarrito(user);
    }
    
    @Override
    public void eliminarProductoCarrito(ObjectId usuarioId, DetalleProducto nuevoDetalleProducto){
        carro.eliminarProductoCarrito(usuarioId, nuevoDetalleProducto);
    }
}
