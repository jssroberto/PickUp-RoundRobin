/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import dominio.Carrito;
import dominio.DetalleCarrito;
import dominio.Producto;
import dominio.Usuario;
import excepciones.ExcepcionAT;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author galan
 */
public class DetalleCarritoDAO {

    private EntityManager em;
    private EntityManagerFactory emf;
    private Carrito carito;

    public DetalleCarritoDAO() {
        emf = Persistence.createEntityManagerFactory("conexionPU");
    }

    public void insertarDetalleCarrito(DetalleCarrito detalleCarrito) throws ExcepcionAT {
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            em.persist(detalleCarrito);

            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            em.close();
            System.out.println(e.getCause());
            throw new ExcepcionAT("Error al insertar detalle carrito");
        }
    }

    public void eliminarDetalleCarrito(DetalleCarrito detalleCarrito) throws ExcepcionAT {
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            // Antes de eliminar el detalle, asegurémonos de que esté gestionado por el EntityManager
            DetalleCarrito detalleGestionado = em.merge(detalleCarrito);
            Carrito carrito = detalleGestionado.getCarrito();
            Float precioProducto = detalleGestionado.getProducto().getPrecio();
            carrito.setCantidadProductos(carrito.getCantidadProductos() - 1);
            // Restar al total del carrito el total del detalle
            carrito.setTotal(carrito.getTotal() - precioProducto);
            em.remove(detalleGestionado);

            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            em.close();
            System.out.println(e.getCause());
            throw new ExcepcionAT("Error al eliminar detalle carrito");
        }
    }

    public List<DetalleCarrito> buscarListaDetalleCarrito(Carrito carrito) throws ExcepcionAT {
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            String jpql3 = "SELECT dc FROM DetalleCarrito dc WHERE dc.carrito = :idCarrito";

            TypedQuery<DetalleCarrito> query = em.createQuery(jpql3, DetalleCarrito.class);
            query.setParameter("idCarrito", carrito);
            List<DetalleCarrito> detallesCarrito = query.getResultList();

            em.getTransaction().commit();
            em.close();

            if (!detallesCarrito.isEmpty()) {
                return detallesCarrito;
            } else {
                throw new ExcepcionAT("Lista de productos no encontrado por su carrito");
            }
        } catch (Exception e) {
            System.out.println(e.getCause());
            System.out.println(e.getLocalizedMessage());
            return null;
        }
    }
}
