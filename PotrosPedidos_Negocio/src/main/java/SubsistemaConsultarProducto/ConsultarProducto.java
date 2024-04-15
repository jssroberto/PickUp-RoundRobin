/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubsistemaConsultarProducto;

import mocks.Productos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jl4ma
 */
public class ConsultarProducto implements IConsultarProducto{
    List<Productos> productosCargados;
    List<Productos> productos = new ArrayList<>();

    public ConsultarProducto(List<Productos> productosLista) {
        this.productosCargados = productosLista;
    }
    
    public List<Productos> getProductos() {
        return productos;
    }

    public void setProductos(List<Productos> productos) {
        this.productos = productos;
    }

    @Override
    public Productos consultarProducto(long id) {     
        for (Productos pro: productosCargados) {
            if (id == pro.getId()) {
                productos.add(pro);
                return pro;
            }
        }
        return null;
    }
    
    
}
