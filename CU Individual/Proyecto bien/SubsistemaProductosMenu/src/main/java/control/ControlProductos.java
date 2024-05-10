package control;

import dtos.ProductoCafeteriaDTO;
import excepciones.SubsistemaException;
import interfaces.IControlProductos;
import java.util.List;
import metodos.ConsultarProductos;

/**
 *
 * @author jl4ma
 */
public class ControlProductos implements IControlProductos {

    ConsultarProductos consultar;

    public ControlProductos() {
        consultar = new ConsultarProductos();
    }

    @Override
    public List<ProductoCafeteriaDTO> obtenerTodosLosProductos() throws SubsistemaException {

        return consultar.obtenerTodosLosProductos();
    }
}
