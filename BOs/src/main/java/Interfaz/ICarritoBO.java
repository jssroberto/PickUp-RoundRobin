/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaz;

import dominio.DetalleProducto;
import dominio.Producto;
import dominio.Usuario;
import excepciones.PersistenciaException;

/**
 *
 * @author yohan
 */
public interface ICarritoBO {

    public void agregarCarrito(Usuario usuarioId, Producto codigoProducto, int cantidad);
    public void vaciarCarrito(Usuario user);
}
