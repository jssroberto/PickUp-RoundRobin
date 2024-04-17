/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SubsistemaSacarCostoPedido;

import SubsistemaConsultarProducto.ConsultarProducto;
import SubsistemaConsultarProducto.IConsultarProducto;
import java.util.List;
import mocks.Productos;
import org.itson.disenosw.dtos.productoDTO;

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
        IConsultarProducto pro = new ConsultarProducto();
        productoDTO p =new productoDTO(1l);
        System.out.println(pro.consultarProducto(p));
    }
    
}
