/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busquedaDinamica;

import BOs.BusquedaBO;
import excepciones.ExcepcionAT;
import java.util.List;
import org.itson.disenosw.dtos.ProductoDTO;

/**
 *
 * @author yohan
 */
public class ControlBusqueda  {
    private  BusquedaBO  b = new BusquedaBO();

     public List<ProductoDTO> consultarProductos(String palabra) throws ExcepcionAT {
        try {
            return  b.consultarProductos(palabra);
        } catch (ExcepcionAT e) {
            throw new ExcepcionAT(e.getMessage());
        }
    }
}
