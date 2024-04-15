/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SubsistemaSacarCostoPedido;

import SubsistemaConsultarProducto.ConsultarProducto;
import SubsistemaConsultarProducto.IConsultarProducto;
import java.util.List;
import mocks.Productos;

/**
 *
 * @author jl4ma
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Productos producto = new Productos();
        producto.generarLista();
        List<Productos> productos = producto.getProductos();
        IConsultarProducto pro = new ConsultarProducto(productos);
        
        System.out.println(pro.consultarProducto(1l));
    }
    
}
