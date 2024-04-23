/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubsistemaConsultarProducto;

import BOs.ConsultarProductoBO;
import DAOs.ProductoCafeteriaDAO;
import cafeteria.ProductoCafeteria;
import excepciones.ExcepcionAT;
import java.util.ArrayList;
import java.util.List;
import mocks.Productos;
import org.itson.disenosw.dtos.ProductoDTO;

/**
 *
 * @author yohan
 */
public class controlProducto {

//    List<Productos> productosCargados;
//    List<Productos> productos = new ArrayList<>();
    ConsultarProductoBO producto = new ConsultarProductoBO();

    public controlProducto() {
    }

//    public controlProducto(List<Productos> productosLista) {
//        this.productosCargados = productosLista;
//    }
//    public List<Productos> getProductos() {
//        return productos;
//    }
//
//    public void setProductos(List<Productos> productos) {
//        this.productos = productos;
//    }
    public ProductoDTO consultarProducto(String nombre) throws ExcepcionAT {
        try {
            return producto.consultarProducto(nombre);

        } catch (ExcepcionAT e) {
            throw new ExcepcionAT(e.getMessage());

        }
    }

}
