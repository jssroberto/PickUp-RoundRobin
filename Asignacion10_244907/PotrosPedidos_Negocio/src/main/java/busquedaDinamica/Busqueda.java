/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busquedaDinamica;

import excepciones.ExcepcionAT;
import java.util.List;
import org.itson.disenosw.dtos.ProductoDTO;

/**
 *
 * @author yohan
 */
public class Busqueda implements IBusqueda {

    private ControlBusqueda c = new ControlBusqueda();

    @Override
    public List<ProductoDTO> consultarProductos(String palabra) throws ExcepcionAT {
        try {
            return c.consultarProductos(palabra);
        } catch (ExcepcionAT e) {
            throw new ExcepcionAT(e.getMessage());
        }
    }

}
