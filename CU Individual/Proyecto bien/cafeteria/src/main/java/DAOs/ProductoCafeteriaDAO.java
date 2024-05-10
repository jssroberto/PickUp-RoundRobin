/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import dominio.ProductoCafeteria;
import excepciones.CafeteriaException;
import interfaces.IProductoCafeteriaDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author jl4ma
 */
public class ProductoCafeteriaDAO implements IProductoCafeteriaDAO{
    private EntityManager em;
    private EntityManagerFactory emf;

    public ProductoCafeteriaDAO() {
        emf = Persistence.createEntityManagerFactory("conexionPU");
        em = emf.createEntityManager();
    }
    @Override
    public void actualizarProducto(ProductoCafeteria productoCafeteria) throws CafeteriaException {
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            em.merge(productoCafeteria);

            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            em.close();
            System.out.println(e.getCause());
            throw new CafeteriaException("Error al actualizar producto de cafeteria");
        }
    }

    @Override
    public ProductoCafeteria buscarProductoCafeteriaPorNombre(String nombreProducto) throws CafeteriaException {
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            String jpql3 = "SELECT p FROM ProductoCafeteria p WHERE p.nombre = :nombre";

            TypedQuery<ProductoCafeteria> query = em.createQuery(jpql3, ProductoCafeteria.class);
            query.setParameter("nombre", nombreProducto);
            List<ProductoCafeteria> usuario = query.getResultList();

            em.getTransaction().commit();
            em.close();

            if (!usuario.isEmpty()) {
                return usuario.get(0);
            } else {
                throw new CafeteriaException("Producto no encontrado por su nombre");
            }
        } catch (Exception e) {
            System.out.println(e.getCause());
            System.out.println(e.getLocalizedMessage());
            return null;
        }
    }

    @Override
    public ProductoCafeteria buscarProductoCafeteriaPorID(Long id) throws CafeteriaException {
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            String jpql3 = "SELECT p FROM ProductoCafeteria p WHERE p.id = :id";

            TypedQuery<ProductoCafeteria> query = em.createQuery(jpql3, ProductoCafeteria.class);
            query.setParameter("id", id);
            List<ProductoCafeteria> usuario = query.getResultList();

            em.getTransaction().commit();
            em.close();

            if (!usuario.isEmpty()) {
                return usuario.get(0);
            } else {
                throw new CafeteriaException("Producto no encontrado por su id");
            }
        } catch (Exception e) {
            System.out.println(e.getCause());
            System.out.println(e.getLocalizedMessage());
            return null;
        }
    }

    @Override
    public List<ProductoCafeteria> obtenerTodosLosProductos() throws CafeteriaException {
        try {
            em.getTransaction().begin();

            String jpql = "SELECT p FROM ProductoCafeteria p";

            TypedQuery<ProductoCafeteria> query = em.createQuery(jpql, ProductoCafeteria.class);
            List<ProductoCafeteria> productos = query.getResultList();

            em.getTransaction().commit();
            em.close();

            return productos;
        } catch (Exception e) {
            if (em != null && em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            em.close();
            throw new CafeteriaException("Error al obtener todos los productos de cafetería");
        }
    }
}
