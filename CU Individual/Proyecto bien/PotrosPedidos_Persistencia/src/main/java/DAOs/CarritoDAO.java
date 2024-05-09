/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import cafeteria.ProductoCafeteria;
import dominio.Carrito;
import dominio.Producto;
import dominio.Usuario;
import excepciones.PersistenciaException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author USER
 */
public class CarritoDAO {

    private EntityManager em;
    private EntityManagerFactory emf;
    private Carrito carito;

    public CarritoDAO() {
        emf = Persistence.createEntityManagerFactory("conexionPU");
    }

    public void agregarCarrito(Carrito carrito) throws PersistenciaException {
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            em.persist(carrito);

            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            em.close();
            System.out.println(e.getCause());
            throw new PersistenciaException("Error al agregar carrito");
        }
    }

    public void actualizarCarrito(Carrito producto) throws PersistenciaException {
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            em.merge(producto);

            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            em.close();
            System.out.println(e.getCause());
            throw new PersistenciaException("Error al actualizar carrito");
        }
    }

    public Carrito buscarCarritoPorUsuario(Usuario usuario) throws PersistenciaException {
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            String jpql3 = "SELECT c FROM Carrito c WHERE c.usuario = :idUsuario";

            TypedQuery<Carrito> query = em.createQuery(jpql3, Carrito.class);
            query.setParameter("idUsuario", usuario);
            List<Carrito> carrito = query.getResultList();

            em.getTransaction().commit();
            em.close();

            if (!carrito.isEmpty()) {
                return carrito.get(0);
            } else {
                throw new PersistenciaException("Carrito no encontrado por su usuario");
            }
        } catch (Exception e) {
            System.out.println(e.getCause());
            System.out.println(e.getLocalizedMessage());
            System.out.println(("Carrito no encontrado por su usuario"));
            return null;
        }
    }

    public Carrito buscarCarritoPorUsuarioId(Long idUsuario) throws PersistenciaException {
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            String jpql = "SELECT c FROM Carrito c WHERE c.usuario.id = :idUsuario";

            TypedQuery<Carrito> query = em.createQuery(jpql, Carrito.class);
           
            List<Carrito> carritos = query.getResultList();

            em.getTransaction().commit();
            em.close();

            if (!carritos.isEmpty()) {
                return carritos.get(0);
            } else {
                throw new PersistenciaException("Carrito no encontrado para el usuario con ID: " + idUsuario);
            }
        } catch (Exception e) {
            System.out.println(e.getCause());
            System.out.println(e.getLocalizedMessage());
            System.out.println("Carrito no encontrado para el usuario con ID: " + idUsuario);
            return null;
        }
    }

}
