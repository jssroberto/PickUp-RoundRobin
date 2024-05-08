/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import IDAOs.ICarritoDAO;
import excepciones.ExcepcionAT;
import mocks.Carrito;



/**
 *
 * @author USER
 */
public class CarritoDAO implements ICarritoDAO{

     Carrito c = new Carrito();

    public CarritoDAO() {
        c.generarLista();

    }

     @Override
    public Carrito BuscarCarrito(Long id) throws ExcepcionAT {
    if (id==null) {
        
        return null;
    }
        for (Carrito ca : c.getCarrito()) {
            if (id .equals(ca.getId()) ) {
                return ca;
            }
        }

        return null;
    }
}