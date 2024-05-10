/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package busquedaDinamica;

import excepciones.ExcepcionAT;
import java.util.List;
import org.itson.disenosw.dtos.ProductoDTO;

/**
 *
 * @author yohan
 */
public interface IBusqueda {

   public List<ProductoDTO> consultarProductos(String palabra) throws ExcepcionAT;

}
