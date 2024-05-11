/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import Control.ControlBusqueda;
import dtos.ProductoCafeteriaDTO;
import excepciones.PersitenciaException;
import interfaces.IBusqueda;
import java.util.List;

/**
 *
 * @author yohan
 */
public class BusquedaDinamica implements IBusqueda {

    ControlBusqueda c = new ControlBusqueda();

    @Override
    public List<ProductoCafeteriaDTO> consultarProductos(String palabra) throws PersitenciaException {
        try {
            return c.consultarProductos(palabra);
        } catch (PersitenciaException e) {
            throw new PersitenciaException(e.getMessage());
        }
    }

    @Override
    public List<ProductoCafeteriaDTO> ordenarProductosAZ() throws PersitenciaException {
        try {
            return c.ordenarProductosAZ();
        } catch (PersitenciaException e) {
            throw new PersitenciaException(e.getMessage());
        }
    }

    @Override
    public List<ProductoCafeteriaDTO> ordenarProductosZA() throws PersitenciaException {
        try {
            return c.ordenarProductosZA();
        } catch (PersitenciaException e) {
            throw new PersitenciaException(e.getMessage());
        }
    }

    @Override
    public List<ProductoCafeteriaDTO> ordenarProductosPorPrecio() throws PersitenciaException {
        try {
            return c.ordenarProductosPorPrecio();
        } catch (PersitenciaException e) {
            throw new PersitenciaException(e.getMessage());
        }
    }

}
