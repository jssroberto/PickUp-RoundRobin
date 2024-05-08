/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package IDAOs;

import excepciones.ExcepcionAT;
import java.util.List;
import mocks.Producto;

/**
 *
 * @author jl4ma
 */
public interface IProductoDAO {

    public Producto BuscarProducto(Long id) throws ExcepcionAT;

    public List<Producto> BuscarProductos(String palabra) throws ExcepcionAT ;

}
