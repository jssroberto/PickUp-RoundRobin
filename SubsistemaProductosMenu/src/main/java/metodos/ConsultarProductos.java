/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import dtos.ProductoCafeteriaDTO;
import excepciones.BOException;
import excepciones.PersistenciaException;
import excepciones.SubsistemaException;
import interfaces.IProductoCafeteriaBO;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import objetosNegocio.ProductoCafeteriaBO;

/**
 *
 * @author jl4ma
 */
public class ConsultarProductos {

    IProductoCafeteriaBO producto;

    public ConsultarProductos() {
        producto = new ProductoCafeteriaBO();
    }

    public List<ProductoCafeteriaDTO> obtenerTodosLosProductos() throws SubsistemaException{
        List<ProductoCafeteriaDTO> productos = new LinkedList<>();

        try {
            productos = this.producto.obtenerTodosLosProductos();
        } catch (BOException e) {
            throw new SubsistemaException(e.getMessage(), e);
        }
        if (productos.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Lista Vacia");
            return null;
        } else {
//            JOptionPane.showMessageDialog(null, "Lista de Productos");
            return productos;
        }
    }
}
