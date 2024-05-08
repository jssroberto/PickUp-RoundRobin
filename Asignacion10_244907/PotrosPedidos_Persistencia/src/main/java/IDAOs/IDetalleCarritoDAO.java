/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package IDAOs;

import excepciones.ExcepcionAT;
import mocks.DetalleCarrito;

/**
 *
 * @author jl4ma
 */
public interface IDetalleCarritoDAO {

    public DetalleCarrito BuscarDetalleCarrito(Long id) throws ExcepcionAT;
    public boolean agregarDetalleCarrito(long id) throws ExcepcionAT ;

}
