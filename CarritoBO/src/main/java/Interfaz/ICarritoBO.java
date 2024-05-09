/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaz;

import dtos.DetalleProductoDTO;
import dtos.UsuarioDTO;
import excepciones.PersistenciaException;

/**
 *
 * @author yohan
 */
public interface ICarritoBO {

    public void agregarDetalleProductoAlCarrito(UsuarioDTO usuario, DetalleProductoDTO nuevoDetalleProductoDTO) throws PersistenciaException;

    public void eliminarProductoCarrito(UsuarioDTO usuario, DetalleProductoDTO nuevoDetalleProductoDTO) throws PersistenciaException;
}
