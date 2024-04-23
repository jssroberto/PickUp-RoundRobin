/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubsistemaAgregarCarrito;

import mocks.Productos;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//import mocks.Usuario;
import dominio.Carrito;
import dominio.Producto;
import dominio.Usuario;
import excepciones.ExcepcionAT;
import org.itson.disenosw.dtos.UsuarioDTO;
import org.itson.disenosw.dtos.ProductoDTO;

/**
 *
 * @author jl4ma
 */
public class AgregarCarrito implements IAgregarCarrito {

    @Override
    public void agregarCarrito(ProductoDTO producto, String idUsuarioCia, Integer cantidad) throws ExcepcionAT {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

//    controlCarrito c = new controlCarrito();
//
//    @Override
//    public void agregarCarrito(ProductoDTO producto, String idUsuarioCia, Integer cantidad) throws ExcepcionAT {
//        try {
//            c.agregarCarrito(producto, idUsuarioCia, cantidad);
//        } catch (Exception e) {
//            throw new ExcepcionAT(e.getMessage());
//        }
//
//    }

}
