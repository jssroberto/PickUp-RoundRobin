/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import BOs.ProductoCafeteriaBO;
import dtos.ProductoCafeteriaDTO;
import excepciones.PersitenciaException;
import interfaces.IProductoCafeteriaBO;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jl4ma
 */
public class ConsultarProductos {
    
    IProductoCafeteriaBO producto = new ProductoCafeteriaBO();
    
    public ProductoCafeteriaDTO buscarProductoCafeteriaPorID(Long id) throws PersitenciaException{
        ProductoCafeteriaDTO pro;
        pro = producto.buscarProductoCafeteriaPorID(id);
        if (pro != null) {
            JOptionPane.showMessageDialog(null, "ProductoEncontrado");
            return pro;
        }else{
            JOptionPane.showMessageDialog(null, "Producto no encontrado");
            return null;
        }
    }
    
    public List<ProductoCafeteriaDTO> obtenerTodosLosProductos() throws PersitenciaException{
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
