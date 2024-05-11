/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dtos.ProductoCafeteriaDTO;
import excepciones.PersistenciaException;
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
    public List<ProductoCafeteriaDTO> obtenerTodosLosProductos() throws PersistenciaException {

        return consultar.obtenerTodosLosProductos();
    }
}
