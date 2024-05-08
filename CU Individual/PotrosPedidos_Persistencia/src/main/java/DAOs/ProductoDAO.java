/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import IDAOs.ICarritoDAO;
import IDAOs.IProductoDAO;
import excepciones.ExcepcionAT;
import java.util.ArrayList;
import java.util.List;
import mocks.Banco;
import mocks.Producto;

/**
 *
 * @author USER
 */
public class ProductoDAO implements IProductoDAO {

      private  Producto producto = new Producto();

    public ProductoDAO() {
        producto.generarLista();
    }

    @Override
    public Producto BuscarProducto(Long id) throws ExcepcionAT {
        if (id == null) {
            return null;
        }
        for (Producto p : producto.getProductos()) {
            if (id.equals(p.getId())) {
                return p;
            }
        }
        return null;
    }

    @Override
    public List<Producto> BuscarProductos(String palabra) throws ExcepcionAT {
        if (palabra == null || palabra.isEmpty()) {
            return new ArrayList<>();
        }

        palabra = palabra.toLowerCase();
        List<Producto> productosEncontrados = new ArrayList<>();

        for (Producto p : producto.getProductos()) {
            String nombreProducto = p.getNombre().toLowerCase();
            if (nombreProducto.contains(palabra)) {
                productosEncontrados.add(p);
            }
        }

        return productosEncontrados;
    }
}
