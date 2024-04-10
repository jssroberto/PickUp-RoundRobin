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
    List<Producto> productosCargados;
    List<Producto> productos = new ArrayList<>();

    public ConsultarProducto(List<Producto> productosLista) {
        this.productosCargados = productosLista;
    }
    
    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public Producto consultarProducto(long id) {     
        for (Producto pro: productosCargados) {
            if (id == pro.getId()) {
                productos.add(pro);
                return pro;
            }
        }
        return null;
    }
    
    
}
