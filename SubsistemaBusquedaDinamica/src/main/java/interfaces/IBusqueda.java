/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dtos.ProductoCafeteriaDTO;
import excepciones.PersitenciaException;
import java.util.List;

/**
 *
 * @author yohan
 */
public interface IBusqueda {

    public List<ProductoCafeteriaDTO> consultarProductos(String palabra) throws PersitenciaException;

    public List<ProductoCafeteriaDTO> ordenarProductosAZ() throws PersitenciaException;

    public List<ProductoCafeteriaDTO> ordenarProductosZA() throws PersitenciaException;

    public List<ProductoCafeteriaDTO> ordenarProductosPorPrecio() throws PersitenciaException;
}
