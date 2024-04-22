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
import org.itson.disenosw.dtos.UsuarioDTO;

/**
 *
 * @author jl4ma
 */
public class AgregarCarrito implements IAgregarCarrito {

    List<Carrito> carritos = new ArrayList<>();
    Carrito carrito;

    public AgregarCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public void inicializarCarrito(UsuarioDTO usuarioDTO) {
        usuarioDTO.getId();
//        Usuario usuario = buscarUsuario(usuarioDTO.getId());
    }

    @Override
    public boolean agregarCarrito(Productos producto, Integer cantidad, Usuario usuario) {
        List<Producto> productos = new ArrayList<>();
        System.out.println(producto.getCantidad());
        Producto producto3 = new Producto();
        productos.add(producto3);
        if (producto != null) {
            float costo = producto.getCosto() * cantidad;
            
            //esto va en persistencia gracias
            EntityManagerFactory entity = Persistence.createEntityManagerFactory("conexionPU");
            EntityManager entityManager = entity.createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(producto3);
            Carrito carrito = new Carrito();
            entityManager.persist(carrito);
            entityManager.getTransaction().commit();
            //fin de persistencia
            
            return true;
        } else {
            return false;
        }
    }

}
