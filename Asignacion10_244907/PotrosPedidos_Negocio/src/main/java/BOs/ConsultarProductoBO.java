/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import DAOs.ProductoDAO;
import IDAOs.IProductoDAO;
import excepciones.ExcepcionAT;

/**
 *
 * @author yohan
 */
public class ConsultarProductoBO {

    IProductoDAO p = new ProductoDAO();

    public boolean consultarProducto(Long id) throws ExcepcionAT {
        if (p.BuscarProducto(id) == null) {
            throw new ExcepcionAT("id Incorrecta");
        }else{
        return true;
        }
    }
}
