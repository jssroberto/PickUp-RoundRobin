/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaz;

import dtos.ProductoCafeteriaDTO;
import dtos.ProductoDTO;
import excepciones.PersitenciaException;
import java.util.List;

/**
 *
 * @author yohan
 */
public interface IBusquedaBO {
public List<ProductoCafeteriaDTO> consultarProductos(String palabra) throws PersitenciaException ;
}
