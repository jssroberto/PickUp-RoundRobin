/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubsistemaAgregarCarrito;

import Mock.Productos;
import org.itson.disenosw.dominio.Producto;
import Mock.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.itson.disenosw.dominio.Carrito;

/**
 *
 * @author jl4ma
 */
public class AgregarCarrito implements IAgregarCarrito {

    List<Carrito> carrito = new ArrayList<>();
    Carrito cart;

    public AgregarCarrito(Carrito cart) {
        this.cart = cart;
    }


    @Override
    public boolean agregarCarrito(Productos producto, Integer cantidad, org.itson.disenosw.dominio.Usuario usuario) {
        List<Producto> productos = new ArrayList<>();
        Producto producto3 = new Producto(producto.getCosto(), producto.getNombre(), producto.getDescripcion(), cantidad);
        productos.add(producto3);
        if (producto != null) {
            float costo = producto.getCosto() * cantidad;
            Carrito cart = new Carrito(costo, cantidad, productos, usuario);
            EntityManagerFactory entity = Persistence.createEntityManagerFactory("conexionPU");
            EntityManager entityManager = entity.createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(cart);
            entityManager.getTransaction().commit();
            return true;
        } else {
            return false;
        }
    }

}
