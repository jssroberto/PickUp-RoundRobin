/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import dtos.ProductoCafeteriaDTO;
import excepciones.PersistenciaException;
import interfaces.IProductoCafeteriaBO;
import java.util.List;
import javax.swing.JOptionPane;
import objetosNegocio.ProductoCafeteriaBO;

/**
 *
 * @author jl4ma
 */
public class ConsultarProductos {
    
    IProductoCafeteriaBO producto;
    
    public ConsultarProductos(){
        producto = new ProductoCafeteriaBO();
    }
    
    
    public List<ProductoCafeteriaDTO> obtenerTodosLosProductos() throws PersistenciaException{
        List<ProductoCafeteriaDTO> productos;
        
        productos = this.producto.obtenerTodosLosProductos();
        if(productos.isEmpty()){
            JOptionPane.showMessageDialog(null, "Lista Vacia");
            return null;
        }else{
            JOptionPane.showMessageDialog(null, "Lista de Productos");
            return productos;
        }
    }
}
