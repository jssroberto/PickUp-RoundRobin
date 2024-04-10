/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubsistemaConsultarProducto;

import Mock.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jl4ma
 */
public class ConsultarProducto implements IConsultarProducto{
    List<Producto> productos = new ArrayList<>();

    public ConsultarProducto() {
    }
    
    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public Producto consultarProducto(Integer id) {
                return null;
    }
    
    
}
