/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubsistemaConsultarProducto;

import java.util.ArrayList;
import java.util.List;
import mocks.Productos;

/**
 *
 * @author yohan
 */
public class controlProducto {

    List<Productos> productosCargados;
    List<Productos> productos = new ArrayList<>();

    public controlProducto() {
    }

    public controlProducto(List<Productos> productosLista) {
        this.productosCargados = productosLista;
    }

    public List<Productos> getProductos() {
        return productos;
    }

    public void setProductos(List<Productos> productos) {
        this.productos = productos;
    }

    
    public Productos consultarProducto(long id) {
        for (Productos pro : productosCargados) {
            if (id == pro.getId()) {
                productos.add(pro);
                return pro;
            }
        }
        return null;
    }

}
