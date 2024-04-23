/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package SubsistemaAgregarCarrito;

import dominio.Usuario;
import excepciones.ExcepcionAT;
import mocks.Productos;
import org.itson.disenosw.dtos.ProductoDTO;

/**
 *
 * @author jl4ma
 */
public interface IAgregarCarrito {

    public void agregarCarrito(ProductoDTO producto, String idUsuarioCia, Integer cantidad) throws ExcepcionAT;
}
