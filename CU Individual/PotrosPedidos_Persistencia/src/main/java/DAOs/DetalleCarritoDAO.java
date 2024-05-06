/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import IDAOs.IDetalleCarritoDAO;
import excepciones.ExcepcionAT;
import mocks.DetalleCarrito;
import mocks.Producto;

/**
 *
 * @author galan
 */
public class DetalleCarritoDAO implements IDetalleCarritoDAO {

    DetalleCarrito dc = new DetalleCarrito();

    public DetalleCarritoDAO() {
        dc.generarLista();

    }

    @Override
    public DetalleCarrito BuscarDetalleCarrito(Long id) throws ExcepcionAT {
        if (id == null) {

            return null;
        }
        for (DetalleCarrito d : dc.getDetalles()) {
            if (id.equals(d.getId())) {
                return d;
            }
        }

        return null;
    }

    @Override
    public boolean agregarDetalleCarrito(long id) throws ExcepcionAT {
        ProductoDAO p = new ProductoDAO();
        if (p.BuscarProducto(id) == null) {

            return false;
        } else {
            dc.setProducto(p.BuscarProducto(id));
            return true;
        }

    }
}
