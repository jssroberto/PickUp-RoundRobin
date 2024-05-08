/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import DAOs.CarritoDAO;
import DAOs.DetalleCarritoDAO;
import IDAOs.ICarritoDAO;
import IDAOs.IDetalleCarritoDAO;
import excepciones.ExcepcionAT;


/**
 *
 * @author yohan
 */
public class AgregarCarritoBO {

        ICarritoDAO carrito = new CarritoDAO();
        IDetalleCarritoDAO  detalle = new DetalleCarritoDAO();
        
        public boolean carrito(Long id) throws ExcepcionAT{
            if(carrito.BuscarCarrito(id)!=null){
                return true;
            }else{
                return false;
            }
     
        }
        
        public boolean detalle(Long id) throws ExcepcionAT{
            if (detalle.BuscarDetalleCarrito(id)!=null) {
                return true;
            }else{
                return false;
            }
        }
}
