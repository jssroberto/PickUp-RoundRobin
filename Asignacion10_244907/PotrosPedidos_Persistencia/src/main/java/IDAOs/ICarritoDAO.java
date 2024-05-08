/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package IDAOs;

import excepciones.ExcepcionAT;
import mocks.Carrito;

/**
 *
 * @author jl4ma
 */
public interface ICarritoDAO {

    public Carrito BuscarCarrito(Long id) throws ExcepcionAT;

}
